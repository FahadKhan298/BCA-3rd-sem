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
public class q2 {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number of element:");
         int n=sc.nextInt();
         int a[]=new int[100];
         System.out.println("Enter the elements:");
         for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
         }
   
   for(int i=0;i<n-1;i++){
       for(int j=0;j<n-i-1;j++){
           if(a[j]>a[j+1]){
               int temp=a[j];
               a[j]=a[j+1];
               a[j+1]=temp;
           }
       }
   }
   for(int k=0;k<n;k++){
       System.out.print(a[k]+",");
   }
       
   
    }
}
