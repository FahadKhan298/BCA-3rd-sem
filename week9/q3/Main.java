/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.q3;

/**
 *
 * @author ZeeTech
 */

public class Main {
    public static void main(String[] args){
        
      Account M1=new Account();
      M1.Member_Id=69;
      M1.Account_holder_name="Armaan";
      M1.Address="dholakpur";
       M1.display();
      M1.deposite(20000);
      M1.withdrawl(1000);
      M1.calculateSimpleIntrest(1000,10,2);
      M1.calculateCompoundIntrest(1000,10,2,1);
     
      
    }
}
