/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

import java.util.Scanner;

/**
 *
 * @author CSD
 */
public class q6 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the a=");
        int a=sc.nextInt();
        System.out.print("Enter the b=");
        int b=sc.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("After swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);
                
    }
}
