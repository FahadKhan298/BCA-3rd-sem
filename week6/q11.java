/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week6;

import java.util.Scanner;

/**
 *
 * @author CSD
 */
public class q11 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch]++;  
        }
        System.out.println("\nCharacter frequencies:");
        for(int j=0;j<256;j++){
            if (freq[j] > 0) {
                System.out.println("'" + (char) j + "' : " + freq[j]);
            }
        }
    }


}
