/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

import java.util.Scanner;

/**
 *
 * @author ZeeTech
 */
public class q7 {
    public static int gcdrec(int a,int b){
        if(b==0){
            return a;
        }
        return gcdrec(b,a%b);


    }
   public static int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number1:");
         int a=sc.nextInt();
        System.out.println("Enter the number2:");
         int b=sc.nextInt();
        System.out.println("GCD using recursion"+gcdrec(a,b));
        System.out.println("GCD without RECURSION:"+gcd(a,b));
    
    }
}
