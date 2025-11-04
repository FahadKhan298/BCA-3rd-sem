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
class InsufficientExceptions extends Exception
{
    String s;

    public InsufficientExceptions(String string) {
        
        s=string;
    }

    public String getmessage() {
        return s;
    }
    
    
}
public class q3 {
    public static void withdrawl(int balance,int amount) throws InsufficientExceptions
    {
        if(amount<balance)
        {
            System.out.println("Amount withrawn:"+amount);
            System.out.println("Available balance:"+(balance-amount));
    }
        else
        {
            throw new InsufficientExceptions("Insufficient balance");
        }
    }
    public static void main(String[]args)
    {
        try
        {
            withdrawl(10000,20000);
        }
        catch(InsufficientExceptions e)
        {
            System.out.println(e.getmessage());
        }
    }
}
