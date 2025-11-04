/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week9.q10;

/**
 *
 * @author CSD
 */
public class Student {
     int rollNo;
    String name;
    int marks;
    static String schoolName;
   
    public void changeSchoolName(String school){
        this.schoolName=school;
    }
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Roll Number: "+rollNo);
        System.out.println("Marks: "+marks);
        System.out.println("School: "+schoolName);
    }

}
