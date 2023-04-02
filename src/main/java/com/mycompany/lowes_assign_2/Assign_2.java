/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lowes_assign_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author arind
 */
public class Assign_2 {

    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/me";
        String username = "root";
        String password = "Bora@782123";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            // INSERT operation
            String insertQuery = "INSERT INTO customer (cid, cName, loc, age) VALUES (?, ?, ?, ?)";
            PreparedStatement insertStmt = con.prepareStatement(insertQuery);
            insertStmt.setInt(1, 2);
            insertStmt.setString(2, "Harinarayan");
            insertStmt.setString(3, "India");
            insertStmt.setInt(4, 12);
            int rowsInserted = insertStmt.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");

            // SELECT operation
            String selectQuery = "SELECT * FROM customer";
            Statement selectStmt = con.createStatement();
            ResultSet resultSet = selectStmt.executeQuery(selectQuery);
            while (resultSet.next()) {
                int cid = resultSet.getInt("cid");
                String cName = resultSet.getString("cName");
                String loc = resultSet.getString("loc");
                int age = resultSet.getInt("age");
                System.out.println(cid + "\t" + cName + "\t" + loc + "\t" + age);
            }

            // UPDATE operation
            String updateQuery = "UPDATE customer SET age = ? WHERE cName = ?";
            PreparedStatement updateStmt = con.prepareStatement(updateQuery);
            updateStmt.setInt(1, 18);
            updateStmt.setString(2, "Madhav");
            int rowsUpdated = updateStmt.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");

            // DELETE operation
            String deleteQuery = "DELETE FROM customer WHERE cid = ?";
            PreparedStatement deleteStmt = con.prepareStatement(deleteQuery);
            deleteStmt.setInt(1, 1);
            int rowsDeleted = deleteStmt.executeUpdate();
            System.out.println(rowsDeleted + " row(s) deleted.");

            insertStmt.close();
            selectStmt.close();
            updateStmt.close();
            deleteStmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println("Error performing database operation: " + e.getMessage());
        }
    }
}
