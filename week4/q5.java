/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author moham
 */
public class q5 {
     public static void main(String[] args){
           Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         float n=sc.nextFloat();
         for(float i=n;i>10;i/=2){
             System.out.println(i);
         }
}
}
