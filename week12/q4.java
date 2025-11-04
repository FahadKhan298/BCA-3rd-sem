/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week12;

/**
 *
 * @author CSD
 */
class InvalidAgeException extends Exception
{
   

    public InvalidAgeException(String string) {
        super(string);
    }

    
    
    
}
public class q4 {
    public static void Agelimit(int age) throws InvalidAgeException
    {
        if(age>18)
        {
            System.out.println("Eligible for vote");
        }
        else
        {
            throw new InvalidAgeException("Not eligible");
        }
    }
    public static void main(String[]args)
    {
        try
        {
            Agelimit(15);
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
