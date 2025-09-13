/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;



/**
 *
 * @author ZeeTech
 */
public class q5 {
    public static void main(String [] args){
       
        for(int i=2;i<=100;i++){
        boolean isprime=true;
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                   isprime=false;
                   break;
                }
                else{
                    isprime=true;
                }
            }
               if(isprime){
                   System.out.println(""+i);
               }
        }
    }
} 
