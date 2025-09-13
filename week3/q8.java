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
public class q8 {
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the temp. in (deg)C:");
       int c=sc.nextInt();
       int f=(c*9/5)+32;
       System.out.println("Temp. in farenhite:"+f);
   } 
}
