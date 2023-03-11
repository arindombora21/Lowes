/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lowes;

import java.util.Scanner;

/**
 *
 * @author arind
 */
public class Lowes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0;i<num;i++){
            int pid = sc.nextInt();
            String pName = sc.next();
            int up = sc.nextInt();
            int qty = sc.nextInt();
            int stk = sc.nextInt();
            int tc = up*qty;
            int rs = stk-qty;
            if(stk >= qty){
                System.out.println(pName + tc + rs);
            }else{
                System.out.println(pName + " out of stock");
            }
        }
    }
}
