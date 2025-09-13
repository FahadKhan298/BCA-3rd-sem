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
public class q1 {
      public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int a=sc.nextInt();
    int [] arr=new int[a];
    for(int i=0;i<a;i++){
        System.out.println("Enter a["+i+"] element");
        arr[i]=sc.nextInt();
    }
    System.out.println("The elements of the array are:-");
    for(int i=0;i<a;i++){
        System.out.println(arr[i]);
    }
    }
}
