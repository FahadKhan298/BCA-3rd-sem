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
public class q8 {
      public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the nth term:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sum=sum+i;
            }
            
        }
        System.out.print("sum="+sum);
    }
}
