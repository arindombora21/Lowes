/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arindombora_lowes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author arind
 */
public class EmployeeDetails {

    public static void main(String args[]) throws IOException {
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        int eid=Integer.parseInt(bfn.readLine());
        String eName=bfn.readLine();
        int basic=Integer.parseInt(bfn.readLine());
        System.out.println("The details of employee "+eid+" with the name "+eName+" is");
        System.out.println("House Rent Allowance is "+0.12*basic);
        System.out.println("Term Allowance is "+0.08*basic);
        System.out.println("Dearness Allowance is "+0.09*basic);
        System.out.println("The gross salary is"+(basic+0.12*basic+0.08*basic+0.09*basic));
        double total_sum=basic+0.12*basic+0.08*basic+0.09*basic;
        if(total_sum>=25000)
            System.out.println("A level employee");
        else if(total_sum>=10000 && total_sum<25000)
            System.out.println("B level employee");
        else
            System.out.println("C level employee");
    }
}
