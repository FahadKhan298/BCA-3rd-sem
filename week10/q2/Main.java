/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10.q2;

/**
 *
 * @author ZeeTech
 */
public class Main {
    public static void main(String[] args){
        Edible.Fruit.fruitDetails();
        Edible.Vegetable.vegetableDetails();
        Edible.Fruit f= new Edible.Fruit();
        f.fruitPackageing();
        Edible.Vegetable v=new Edible.Vegetable();
        v.vegetablePackageing();
    }
}
