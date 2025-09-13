/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author moham
 */
public class q4 {
     public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++){
            sum+=(float)1/i;
        }
        System.out.println("Sum of the series is "+ sum);
    }

}
