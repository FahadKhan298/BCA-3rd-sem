/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

/**
 *
 * @author ZeeTech
 */
public class q7 {
     public static void main(String[] args){
        
        int a[]={10,20,30,25,99,65,14};
        int max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
            
        }
        System.out.println("max="+max);
    }
}
