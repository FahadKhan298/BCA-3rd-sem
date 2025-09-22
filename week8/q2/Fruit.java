/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.q2;

/**
 *
 * @author ZeeTech
 */
public class Fruit {
    private String color;
   private String taste;
     private int price;
     
     public void setDetail(String color, String taste, int price){
         this.color=color;
         this.taste=taste;
         this.price=price;
     }
     public void Display(){
         System.out.println("Color: "+color);
         System.out.println("taste: "+taste);
         System.out.println("price:  "+price);
     }
}
