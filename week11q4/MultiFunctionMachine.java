/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week11q4;

/**
 *
 * @author CSD
 */
public class MultiFunctionMachine implements Printer,Scanner{

    @Override
    public void connect() {
        System.out.println("Device connected");
       }

    @Override
    public void detail() {
        Printer.super.detail();
        Scanner.super.detail();
    }

   
}
