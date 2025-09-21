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
public class q7 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element:");
         int n=sc.nextInt();
         int a[]=new int[100];
         System.out.println("Enter the elements:");
         for(int i=0;i<n;i++){
             a[i]=sc.nextInt();
         }
        int max1=a[0];
        int max2=a[0];
        for(int i=0;i<6;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[i];
                }
             if(a[i]>=max2 && a[i]<max1){
                    max2=a[i];
                    
                }
        }
        System.out.println("first largest element:"+max1);
        System.out.println("second largest element of array:"+max2);
    }
}
