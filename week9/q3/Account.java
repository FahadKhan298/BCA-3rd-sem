/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.q3;

/**
 *
 * @author ZeeTech
 */
public class Account {
   static int Member_Id;
   static String Account_holder_name;
   static String Address;
   
   void deposite(int amount){
       System.out.println("Amount deposited :"+amount);
   }
   void withdrawl(int amount){
       System.out.println("Amount withdrawl:"+amount);
   }
   static void calculateSimpleIntrest(int principle,int rate,int time){
      double si=(principle*rate*time)/100;
       System.out.println("SIMPLE INTREST: "+si);
        }
   static void calculateCompoundIntrest(int principle,int rate,int time,int period){
       double ci=principle*Math.pow((1+rate*0.01),time*period);
       System.out.println("Compound inrest: "+ci);
   }
   static void display(){
       System.out.println("Member Id: "+Member_Id);
       System.out.println("Account holder name: "+Account_holder_name);
       System.out.println("Address: "+Address);
      
       
       
       
       
   }
}
