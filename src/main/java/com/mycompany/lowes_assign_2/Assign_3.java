/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lowes_assign_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author arind
 */
public class Assign_3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Product product = (Product) context.getBean("product");
        System.out.println(product.getName());
        System.out.println(product.getPrice());

        ApplicationContext context2 = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Product2 product2 = (Product2) context2.getBean("product");
        System.out.println(product2.getName());
        System.out.println(product2.getPrice());
    }
}
