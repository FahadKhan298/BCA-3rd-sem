/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.q6;

/**
 *
 * @author CSD
 */
public class rectangle extends Shape{
    int length;
    int width;
   public  rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    @Override
     public void area(){
        System.out.println("area: "+length*width);
    }
}
