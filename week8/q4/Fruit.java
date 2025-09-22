/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.q4;

/**
 *
 * @author ZeeTech
 */
public class Fruit {
    String color;
    String taste;
    int price;
    
    public Fruit(){
    color="not defined";
   price=0;
    taste="Not defined";
    
}
    public Fruit(String color){
    this.color=color;
    price=0;
    taste="Not defined";
    
}
    public Fruit(String color, String taste){
        this.color=color;
        this.taste=taste;
         price=25;
    }
    public void display(){
        System.out.println("color: "+color);
        System.out.println("taste: "+taste);
        System.out.println("price: "+price);
    }
}
