/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

/**
 *
 * @author CSD
 */
public class q3 {
    public static void main(String[] args){
        int a[]={12,15,23,56,78,89};
        int n=a.length;
           int temp=a[0];
            a[0]=a[n-1];
            a[n-1]=temp;
        
        for(int i=0;i<n;i++){
            System.out.println(""+a[i]);
         }
    }
}
