/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.arindombora_lowes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author arind
 */
public class ControlStatements {

    public static void main(String[] args) throws IOException {
         BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        //if else
        String food = bfn.readLine();
        if (food.equals("Rasgulla")) {
            System.out.println("My favourite Food");
        } else if (food.equals("Paneer")) {
            System.out.println("I Hate it");
        } else if (food.equals("Chicken")) {
            System.out.println("Works fine");
        } else {
            System.out.println("I like non-veg food only");
        }

        //switch case
        int num = Integer.parseInt(bfn.readLine());
        switch (num) {
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            default:
                System.out.println(num);
        }

        //for loop
        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum = sum + j;
        }
        System.out.println("The sum of first 10 natural numbers is " + sum);

        //while loop
        int i = 20;
        int sum1 = 0;
        while (i > 0) {
            sum1 += i;
            i--;
        }
        System.out.println("The sum of first 20 natural numbers is" + sum1);

        //for each loop
        String[] names = {"Java", "C", "C++", "Python", "JavaScript"};
        for (String name : names) {
            System.out.println(name);
        }

        //do while
        i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        do {
            System.out.println(i);
            i = i + 2;
        } while (i <= 10);
    }
}
