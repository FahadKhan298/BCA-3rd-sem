/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.q9;

/**
 *
 * @author CSD
 */
public class MathOperation {
        public static int gcd(int a,int b){
         if(b==0){
            return a;
         }
         else{
            return gcd(b,a%b);
         }
    }
    
    public static int lcm(int a,int b){
        int lcm=(a*b)/gcd(a,b);
        return lcm;
    }
}




