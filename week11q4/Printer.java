/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package week11q4;

/**
 *
 * @author CSD
 */
public interface Printer {
    void connect();
    default void detail()
    {
        System.out.println("this is a detail of Printer");
    }
}
