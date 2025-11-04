/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.q6;

/**
 *
 * @author HP
 */
public  class Car {
    String model;
    String color;
    double price;
    
    public Car(){
        //this("Unkown","unknown",0.0);
       
    }
    public Car(String model){
      //  this(model,"unkwon",0.0);
       
    }
    public Car(String model,String color){
        this.color=color;
        this.model=model;
        price=0.0;
    }
    public void setDetail(String model, String color, double price){
        this.model=model;
        this.color=color;
        this.price=price;
        
    }
    public String getDetail(){
        return "\nmodel :"+model+"\ncolor :"+color+"\nprice :"+price;
    }
    public void display(){
        System.out.println("Model: "+model);
        System.out.println("color: "+color);
        System.out.println("price: "+price);
    }
    
}
