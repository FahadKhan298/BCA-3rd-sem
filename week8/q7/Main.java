/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.q7;

/**
 *
 * @author CSD
 */
public class Main {
    public static void main(String[]args){
        Car car1=new Car();
        Car car2=new Car("Audi");
        Car car3=new Car("bmw","red");
       
        car2.setDetails(5000000);
        car3.setDetails(150000);
        car1.display();
        car2.display();
        car3.display();
    }
}
