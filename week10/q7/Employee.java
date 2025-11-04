/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week10.q7;

/**
 *
 * @author ZeeTech
 */
public class Employee
{
String empName;
int empId;
Salary sal;
JoiningDate date;
public Employee(String empName,int empId,double basic,double hra,double pf,int day,int month,int year)
{
    this.empName=empName;
    this.empId=empId;
    this.date=new JoiningDate(day,month,year);
    this.sal=new Salary(basic,hra,pf);
    
}
class Salary
{
    double basic,hra,pf ;
    public Salary(double basic,double hra,double pf)
    {
        this.basic=basic;
        this.hra=hra;
        this.pf=pf;
        
    }
    void dispalySlary()
    {
        System.out.println("Basic: "+basic);
        System.out.println("Hra: "+hra);
        System.out.println("Pf: "+pf);
    }
}
class JoiningDate
{
    int day;
    int month;
    int year;
    public JoiningDate(int day,int month,int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;
    }
    void displayJoiningDate()
    {
        System.out.println("Day: "+day);
        System.out.println("Month: "+month);
        System.out.println("Year: "+year);
    }
}
void displayEmployee()
{
    System.out.println("Name: "+empName);
    System.out.println("Id: "+empId);
    sal.dispalySlary();
    date.displayJoiningDate();
}
}
