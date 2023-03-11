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
public class AttendanceSystem {

    public static void main(String args[]) throws IOException {
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        int total_days=280;
        int sid=Integer.parseInt(bfn.readLine());
        String sName=bfn.readLine();
        int m1=Integer.parseInt(bfn.readLine());
        int m2=Integer.parseInt(bfn.readLine());
        int m3=Integer.parseInt(bfn.readLine());
        int noOfDaysPrsnt=Integer.parseInt(bfn.readLine());
        System.out.println("The details of student with id "+sid+"with the name "+sName);
        System.out.println("The total marks obtained is "+(m1+m2+m3));
        double avg=(m1+m2+m3)/(3*1.0);
        System.out.println("The average marks obtained is "+avg);
        double perAtt=((noOfDaysPrsnt*1.0)/(total_days*1.0))*(100*1.0);
        if(perAtt>=60)
            System.out.println("He is a regular student");
        else
            System.out.println("He is an irregular student");
    }
}
