/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author ZeeTech
 */
public class q8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N th term:");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.println(""+a);
            int temp=a+b;
            a=b;
            b=temp;
        }
    }
}
