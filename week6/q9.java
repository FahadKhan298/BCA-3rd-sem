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
public class q9 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element:");
         int n=sc.nextInt();
         int a[]=new int[100];
         System.out.println("Enter the elements:");
         for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
         }
       
        int j=0;
        int b[]=new int[10];
        for(int i=n-1;i>=0;i--){
            b[j]=a[i];
         System.out.println(""+b[j]);
         j++;
    }
    }
}
