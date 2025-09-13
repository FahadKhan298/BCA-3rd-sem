/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author ZeeTech
 */
public class q9 {
       public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num!=0)
        {
            int digit=num%10;
             rev= digit + rev*10;
            num=num/10;
        }
       if(temp==rev){
           System.out.println(temp+" isPalindrome");
       }
       else{
           System.out.print(temp+"is notPalindrome");
       }
    }
}
