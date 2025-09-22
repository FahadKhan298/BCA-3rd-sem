/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.q5;

/**
 *
 * @author ZeeTech
 */
public class Fruit {
    String color;
    String taste;
    int price;
    
    public Fruit(){
        this("Not Define","Not defined");
    }
    public Fruit(String color){
        this(color,"Not define");
    }
    public Fruit(String color,String taste){
        this.color=color;
        this.taste=taste;
        price=253;
    }
     public void display(){
        System.out.println("color: "+color);
        System.out.println("taste: "+taste);
        System.out.println("price: "+price);
    }
    
}
