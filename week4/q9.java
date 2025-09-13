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
public class q9 {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year:");
        int y=sc.nextInt();
       if((y%400==0) ||( y%4==0 && y%100!=0)){
          System.out.println(y+" is a leap year");
      }
       else{
           System.out.println(y+" 1is not a leap year");
       }
    }
    
}
