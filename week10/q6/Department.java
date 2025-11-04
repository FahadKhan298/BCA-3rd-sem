/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10.q6;

/**
 *
 * @author ZeeTech
 */
public class Department extends Faculty
{
    String name;
    String chairman;
    public Department(String uniname,int ranking,String facname,String name,String chairman)
    {
        super(name,ranking,name);
        this.name=name;
        this.chairman=chairman;
    }
    
    void dispaly(){
        super.details();
        System.out.println("Departmanet name:"+name);
        System.out.println("Chairman: "+chairman);
    }
}
