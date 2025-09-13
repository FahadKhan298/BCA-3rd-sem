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
public class q2 {
     public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int a=sc.nextInt();
    int sum=0;
    int [] arr=new int[a];
    for(int i=0;i<a;i++){
        System.out.println("Enter a["+i+"] element");
        arr[i]=sc.nextInt();
        sum+=arr[i];
    }
    System.out.println("Sum of the elements of the array is "+ sum);
     }
}
