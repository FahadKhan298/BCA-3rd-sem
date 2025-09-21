/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ZeeTech
 */
public class q8 {
    public static boolean isAnagram(String s1, String s2) {
    if (s1.length() != s2.length()) return false;
    char[] a = s1.toCharArray();
    char[] b = s2.toCharArray();
    Arrays.sort(a);
    Arrays.sort(b);
    return Arrays.equals(a, b);
}

    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string1");
        String str1=sc.nextLine();
        System.out.println("Enter the string2");
        String str2=sc.nextLine();
        if(!isAnagram(str1,str2)){
            System.out.println("Is not anagram");
        }
        else{
            System.out.println("IS anagram");
        }
        
}
}
