/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.q4q5;

/**
 *
 * @author CSD
 */
public class saving extends Account{
    double Min_balance;

    public saving(int Member_Id, String Account_holder_name, String Address, int balance,double Min_balance) {
        super(Member_Id, Account_holder_name, Address, balance);
        this.Min_balance=Min_balance;
    }
    @Override
    void display(){
        System.out.println("Saving details");
        super.display();
        System.out.println("Saving balance"+balance);
        System.out.println("min balance: "+Min_balance);
    }
    @Override
    public void deposite(int amount){
        if(amount<=0){
            System.out.println("insufficient amount");
        }
        else
        {
            balance+=amount;
            System.out.println("Deposited: "+amount);
            System.out.println("new balance: "+balance);
            
        }
    }
    @Override
        public void withdrawl(int amount){
        if (amount>0){
            if(balance-amount>=Min_balance){
                balance-=amount;
                System.out.println("Amount withdrawl: "+amount);
                System.out.println("New balance: "+balance);
            }
        
            else{
                System.out.println("Insufficient withdrawl:");
                System.out.println("Current balance: "+balance);
                
    }
    }
        
        else{
            System.out.println("Invalid withdawl");
}
        }
        
  
}
