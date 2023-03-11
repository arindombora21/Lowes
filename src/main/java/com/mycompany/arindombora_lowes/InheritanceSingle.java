/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arindombora_lowes;

/**
 *
 * @author arind
 */
class Animal {

    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("barking...");
    }
}

public class InheritanceSingle {
    public static void main(String args[]) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
