/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author ZeeTech
 */
public class q7 {
       public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Enter the third number:");
        int c=sc.nextInt();
        System.out.println("Enter the fourth number:");
        int d=sc.nextInt();
        int min;
        if(a<b && a<c && a<d){
            min=a;
        }
        else if(b<a && b<c && b<d){
            min=b;
        }
        else if(c<a && c<b && c<d){
            min=c;
        }
        else{
            min=d;
        }
        System.out.println("minimum no.="+min);
        
    }
}
