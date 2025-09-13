/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.Scanner;

/**
 *
 * @author ZeeTech
 */
public class q10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input decimal number
        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();

        // String to store hexadecimal
        String hex = "";

        // Digits for hexadecimal (0-9, A-F)
        char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9',
                            'A','B','C','D','E','F'};

        // Convert manually
        int num = decimal;
        while (num > 0) {
            int remainder = num % 16;              // find remainder
            hex = hexDigits[remainder] + hex;      // prepend the hex digit
            num = num / 16;                        // divide by 16
        }

        // Handle case for 0
        if (decimal == 0) {
            hex = "0";
        }

        // Output result
        System.out.println("Hexadecimal: " + hex);

        sc.close();
    }
}
