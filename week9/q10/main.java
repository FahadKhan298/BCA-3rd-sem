/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.q10;

/**
 *
 * @author CSD
 */
public class main {
     public static void main(String[] args){
       Student a=new Student();
       a.name="fahad";
       a.marks=78;
       a.rollNo=561;
       a.changeSchoolName("shs School");
       a.display();
       a.changeSchoolName("amu");
       a.display();
     }

}
