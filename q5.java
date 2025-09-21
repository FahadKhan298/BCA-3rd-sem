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
public class q5 {
    public static int factorial(int n){
        
        if(n==0 || n==1){
            return 1;
        }
        else{
        return n*factorial(n-1);
    }
    }
    
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int fact=factorial(n);
        System.out.println("Factorial:"+fact);
        
    }
}

