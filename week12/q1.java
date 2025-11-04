/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week12;

/**
 *
 * @author ZeeTech
 */
public class q1 {
    public static int divide(int num,int den)
    {
        return num/den;
    }
    public static void main(String[]args)
    {
        int den[]={10,20,30,0,14};
        for(int i=0;i<den.length;i++)
        {
            try
            {
                int c= divide(100,den[i]);
                System.out.println(c);
            }
            catch(Exception e)
            {
                System.out.println("Can't divide by zero:");
            }
            System.out.println("------------------------");
        }
    }
}
