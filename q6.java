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
public class q6 {
    public static int fibb(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibb(n-1)+fibb(n-2);
        }
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nth term:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibb(i)+" ");
        }
                
    }
}
