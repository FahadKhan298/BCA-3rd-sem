/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week11q1q2;

/**
 *
 * @author CSD
 */
public class Current implements Account{
    @Override
 public void deposite()
 {
     System.out.println("Current deposite account");
 }
 @Override
    public void withdrawl()
    {
        System.out.println("Current withdrawl Account");
    }
 
    public void aboutBank()
    {
        System.out.println("Current Account method of aboutBank");
    }
    
}
