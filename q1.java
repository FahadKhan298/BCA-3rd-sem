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
public class q1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key element:");
        int key=sc.nextInt();
        int a[]={10,20,30,45,56,65,74,83,99,110,220};
        int low=0;
        int high= a.length-1;
        while(low<=high)
        {
        int mid=(low+high)/2;
        if(a[mid]==key){
            System.out.println("element found at index :"+mid);
            break;
        }    
        else if(key>a[mid]){
            low=mid+1;
        }
        else if(key<a[mid]){
            high=mid-1;
        }
       if(low>high){
           System.out.println("not found");
       }
    }
        
}
}
