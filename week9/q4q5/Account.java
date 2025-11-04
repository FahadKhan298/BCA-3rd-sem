/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.q4q5;

/**
 *
 * @author ZeeTech
 */
 public abstract class Account {
      int Member_Id;
    String Account_holder_name;
   String Address;
   int balance;
   public Account(int Member_Id,String Account_holder_name, String Address,int balance)
   {
   this.Member_Id=Member_Id;
    this.Account_holder_name= Account_holder_name;
   this.Address=Address;
   this.balance=balance;
   }
   
   public abstract void deposite(int amount);
   public abstract void withdrawl(int amount);
   
   void display(){
       System.out.println("Member Id: "+Member_Id);
       System.out.println("Account holder name: "+ Account_holder_name);
       System.out.println("Address: "+ Address);

   }
}





