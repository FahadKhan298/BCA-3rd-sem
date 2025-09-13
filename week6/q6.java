/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author ZeeTech
 */
public class q6 {
    public static void main(String [] args){
        int arr[]={10,20,32,15,1565,12,23,14};
         Scanner sc=new Scanner(System.in);
        System.out.println("entr the element to be searched: ");
        int key=sc.nextInt();
        int count=0;
        int index=0;
        for(int i=0;i<8;i++){
            if(arr[i]==key){
                count++;
                index=i;
            }
            else{
                count=0;
            }
        }
        if(count==1){
            System.out.println("elment present at index "+index);
        }
        else{
            System.out.println("not present");
        }
        
    }
    
}
