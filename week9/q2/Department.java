/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.q2;

/**
 *
 * @author CSD
 */
public class Department extends Faculty {
    String name;
    String chairman;
    public void display(){
        details();
        System.out.println("Department name: "+name);
        System.out.println("chairman name: "+chairman);
    }
}
