/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lamdba;

/**
 *
 * @author arind
 */
interface AreaCalc{  
    public double area(int len,int wid,int rad);  
} 
interface SimpInt{
    public double inter(int pr,int t,int r);
}
public class LamdbaEg {
    public static void main(String[] args) {
        AreaCalc ar=(len,wid,rad)->{
            if(rad==-1)
                return len*wid;
            return 3.14*rad*rad; 
        };
        System.out.println(ar.area(2,3,-1));
        System.out.println(ar.area(-1,-1,3));
        SimpInt in=(p,t,r)->{
            return (p*t*r)/100;
        };
        System.out.println(in.inter(1000,2,2));
    }
}
