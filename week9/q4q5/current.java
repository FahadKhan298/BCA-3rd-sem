/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.q4q5;

/**
 *
 * @author CSD
 */
public class current extends Account {
    double Max_withdrawl_limit;
    public current(int Member_Id, String Account_holder_name, String Address, int balance,double Max_withdrawl_limit) {
        super(Member_Id, Account_holder_name, Address, balance);
        this.Max_withdrawl_limit= Max_withdrawl_limit;
    }
    @Override
    public void withdrawl(int amount){
        if(amount>0){
            if(amount<=Max_withdrawl_limit){
                if(balance>=amount){
                balance-=amount;
                System.out.println("withdrawl amount:"+amount);
                System.out.println("new balance: "+balance);
            }
            }
            else{
                System.out.println("Insufficient amount");
            }
        }
        else{
            System.out.println("Withdrawl limit exceed the max withdrawl limit"); 
        }
        
    
        
    }
    @Override
    public void deposite(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("deposited amount: "+amount);
            System.out.println("new balance: "+balance);
        }
        else{
            System.out.println("Invalid amount");
        }
        
    }
   
}
