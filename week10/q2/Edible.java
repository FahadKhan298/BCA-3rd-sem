/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10.q2;

/**
 *
 * @author ZeeTech
 */
public class Edible
{
    Fruit f;
    Vegetable v;
    
     public Edible()
     {
        
    }
    
    static class Fruit
    {
    static  void fruitDetails()
    {
        System.out.println("Fruit");
    }    
     void fruitPackageing()
     {
         System.out.println("packged");
    }
        
    }
    static class Vegetable
    {
    static void vegetableDetails()
    {
        System.out.println("vegetables");
    }
    void vegetablePackageing()
    {
        System.out.println("Not packeged");
    }
    }
    
    
}
