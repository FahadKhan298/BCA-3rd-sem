/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week11q1q2;

/**
 *
 * @author CSD
 */
public class Main {
    public static void main(String[]args)
    {
        Current c=new Current();
        Saving s=new Saving();
             Account.aboutBank();
            c.deposite();
            c.aboutBank();
            c.withdrawl();
            c.takeLoan();
           s.deposite();
           s.aboutBank();
           s.withdrawl();
           s.takeLoan();
                
    }
}
