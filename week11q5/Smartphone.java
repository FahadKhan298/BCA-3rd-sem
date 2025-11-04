/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week11q5;

/**
 *
 * @author CSD
 */
public class Smartphone implements SmartDevice {

    @Override
    public void connectWifi() {
        System.out.println("Wifi Connected");
       }

    @Override
    public void powerOn() {
        System.out.println("Power On");
       
    }
    
}
