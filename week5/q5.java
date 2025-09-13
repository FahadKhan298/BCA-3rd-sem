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
public class q5 {
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=r;
            n=n/10;
        }
        System.out.println("Sum of the digits of the integer is "+ sum);
    }
}
