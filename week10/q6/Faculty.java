/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10.q6;

/**
 *
 * @author ZeeTech
 */
public class Faculty extends University
{
 String name;
 
 public Faculty(String name1,  int ranking, String name)
 
 {
 super(name1,ranking);
 this.name= name;
 }
 
 void details(){
     System.out.println("University name:"+super.name);
     System.out.println("Ranking: "+super.ranking);
     System.out.println("Faculty name:"+name);
 }
}
