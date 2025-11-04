/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

/**
 *
 * @author ZeeTech
 */
import java.io.*;
public class q2 {
    public static void method3(String filename) throws IOException
    {
        FileReader f1=new FileReader(filename);
      
f1.read();
    }
    public static void method2(String filename) throws IOException
    {
        method3(filename);
    }
    public static void method1(String filename)
    {
        try{
        method2(filename);
    }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args )
    {
       method1("abc.txt");
            
    }
    
    
}
