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
public class q3 {
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number");
         int n=sc.nextInt();
         for(int i=1;i<=10;i++){
          System.out.println(n+"*"+i+" --> "+ i*n);
         
         }
     }
}
