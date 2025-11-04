/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week11q1q2;

/**
 *
 * @author ZeeTech
 */
interface Account {
    void deposite();
    void withdrawl();
    public static void  aboutBank()
    {
        System.out.println("this is a static method of aboutBank ");
    }
    default void takeLoan()
    {
        System.out.println("this is a default method of takeloan");
        
    }          
            
}
