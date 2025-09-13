/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author CSD
 */
public class q2 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int count=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
              count++;
            }
        }
        if(count==0){
            System.out.println("Is Prime");
        }
        else{
            System.out.println("Is Not Prime:");
        }
        
    }
}
