/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author moham
 */

public class q2 {
    public static void main(String[] args){
    int a=118;
    int b=97;
    int c=23;
    int max=a;
    if(a>b && a>c){
        max=a;
    }
    else if(b>a && b>c){
        max=b;
    }
    else{
        max=c;
    }
    System.out.println("Largest number is "+ max);
    }
}
