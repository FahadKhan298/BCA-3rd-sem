/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10.q3;

/**
 *
 * @author ZeeTech
 */
public class calculate {
    
    
   public void minMaxAdd(int x, int y)
    {
        int min=x>y?y:x;
        System.out.println("Min:"+min);
        int max=x>y?x:y;
        System.out.println("Max: "+max);
        int add=x+y;
        System.out.println("Add: "+add);
    }
     public void minMaxAdd(double x, double y)
    {
         double min=x>y?y:x;
        System.out.println("Min:"+min);
        double max=x>y?x:y;
        System.out.println("Max: "+max);
      double add=x+y;
        System.out.println("Add: "+add);
    }
   public void minMaxAdd(String x, String y)
    {
    String min=x.length()>y.length()?y:x;
        System.out.println("Min:"+min);
         String max=x.length()>y.length()?x:y;
        System.out.println("Max:"+max);
        String add=x.concat(y);
        System.out.println("Add: "+add);
        
    }
}
