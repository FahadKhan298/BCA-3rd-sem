/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week8.q7;

/**
 *
 * @author CSD
 */
public class Car {
    String model;
    String color;
    double price;
    public Car(){
        this("unknown","not defined");
    }
    public Car(String model){
        this(model,"unknown");
        
    }
    public Car(String model, String color){
        this.model=model;
        this.color=color;
       
    }
   public void setModel(String model)
   {
       this.model=model;
    }
   public void setColor(String color)
   {
       this.color=color;
    }
    public void setPrice(double price)
   {
       this.price=price;
    }
     public void setDetails(String model,String color,double price){
        setModel(model);
        setColor(color);
        setPrice(price);
    }
    public void setDetails(double price){
        setPrice(price);
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }
    public String getDetails(){
        return "model:"+model+"\ncolor: "+color+"\nprice: "+price;
    }
    public void display(){
        System.out.println(getDetails());
        System.out.println("------------||--------||-------");
    }
}
