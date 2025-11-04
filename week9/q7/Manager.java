/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.q7;

/**
 *
 * @author CSD
 */
public class Manager extends Employee {
    String department;
   
   public Manager(String name,double salary,String department){
           super(name,salary);
   
         this.department=department;
     }
    @Override
    public void showDetail(){
        super.showDetail();
        System.out.println("department: "+department);
    }
}
