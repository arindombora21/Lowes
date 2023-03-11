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
public class ProductCatalog {

    public static void main(String args[]) throws IOException {
        BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        int pid=Integer.parseInt(bfn.readLine());
        String pName=bfn.readLine();
        int qty=Integer.parseInt(bfn.readLine());
        int up=Integer.parseInt(bfn.readLine());
        int stk=Integer.parseInt(bfn.readLine());
        System.out.println("The total cost is "+qty*up);
        System.out.println("The product id is "+pid);
        System.out.println("The product name is "+pName);
        if((qty*up)<=stk)
            System.out.println("The remaining stock is "+(stk-qty*up));
        else
            System.out.println("Out of stock");
    }
}
