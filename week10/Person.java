/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10;

/**
 *
 * @author ZeeTech
 */
public class Person {
    String name;
    int phone;
    Address addr;
    DateOfBirth dob;
    Person(String name,int phone,int house_no,String street,String city,String state,int day,int month,int year)
    {
     this.addr=new Address(house_no,street,city, state);
     this.dob=new DateOfBirth(day,month,year);
     this.name=name;
     this.phone=phone;
    }
    
    class Address{
        int house_no;
        String street;
        String city;
        String state;
        
        Address(int house_no,String street,String city,String state)
        {
         this.house_no=house_no;
         this.city=city;
         this.state=state;
         this.street=street;
        }
        
        void dispalyAddr(){
            System.out.println("House No.: "+house_no);
            System.out.println("Street: "+street);
            System.out.println("City: "+city);
            System.out.println("State: "+state);
        }
    }
        
        class DateOfBirth{
            int day;
            int month;
            int year;
            DateOfBirth(int day, int month, int year)
            {
                this.day=day;
                this.month=month;
                this.year=year;
                
            }
            
            void displayDOB(){
                System.out.println("Day: "+day);
                System.out.println("Month: "+month);
                System.out.println("Year: "+year);
            }
        }
            void display(){
               
                
                System.out.println("NAme: "+name);
                System.out.println("Phone no."+phone);
                addr.dispalyAddr();;
                dob.displayDOB();
                
            }
        }
    
    

