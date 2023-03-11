/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arindombora_lowes;

/**
 *
 * @author arind
 */
interface a1
{
    void m1();
}
 
interface b1
{
    void m2();
}
public class InheritanceInterface implements a1,b1{
    @Override
    public void m1()
    {
        System.out.println("Welcome: inside the method m1");
    }
 
    @Override
    public void m2()
    {
        System.out.println("Welcome: inside the method m2");
    }
}
class Execute
{
    public static void main (String[] args)
    {
        InheritanceInterface ob1 = new InheritanceInterface();
        ob1.m1();
        ob1.m2();
    }
}