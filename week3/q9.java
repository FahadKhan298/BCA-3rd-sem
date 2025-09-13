/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author ZeeTech
 */
public class q9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the DIVIDEND :");
        int a=sc.nextInt();
        System.out.println("enter the DIVISOR:");
        int b=sc.nextInt();
        if(a!=0&&b!=0){
            int rem=a%b;
            int q=a/b;
            System.out.println("remainder="+rem+"Quotient="+q);
                    }
    }
}