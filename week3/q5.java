/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author moham
 */
public class q5 {
     public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the First co-ordinate points");
     float x1=sc.nextFloat();
     float y1=sc.nextFloat();
     System.out.println("Enter the Second co-ordinate points");
     float x2=sc.nextFloat();
     float y2=sc.nextFloat();
     float result= (float) Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
     System.out.println(result);
     }
}
