/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author ZeeTech
 */
public class q3 {
     public static void main(String[] args) {
        String str = "fahad";

        StringBuffer sb = new StringBuffer(str);
        String reversed = sb.reverse().toString();

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }

}
