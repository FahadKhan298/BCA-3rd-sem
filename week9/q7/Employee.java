/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.q7;

/**
 *
 * @author CSD
 */
public class Employee {
    String name;
    double salary;
   public Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
  public void showDetail(){
       System.out.println("Name; "+name);
       System.out.println("salary: "+salary);
   }
    
}
