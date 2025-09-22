/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.q3;

/**
 *
 * @author ZeeTech
 */
public class Fruit {
    String color;
    String taste;
    int price;
    
    public Fruit(){
        this.color="Red";
        this.taste="sweet";
        this.price=250;
    }
    public void display(){
        System.out.println("color: "+color);
        System.out.println("taste: "+taste);
        System.out.println("price: "+price);
    }
}
