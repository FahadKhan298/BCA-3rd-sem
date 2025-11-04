/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week11q3;

/**
 *
 * @author CSD
 */
public class BuySomething implements Bike,Scooty {
    public  void details()
    {
        System.out.println("Details of Bike and Scooty");
        Bike.super.details();
        Scooty.super.detail();
        
    }

    @Override
    public void offer() {
        System.out.println("Offer of 10% discount on bike and scooty");
    }

    
}
