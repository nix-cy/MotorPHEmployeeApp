/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication.motorphemployeeapp;

/**
 *
 * @author Annie Victoria Acar
 */
public class Employee {
    private final int employeeID;
    private String lastName;
    private String firstName;
    private String DOB;
    private String position;
    private double salary;
    private String address;
    private String phoneNumber;
    private String SSSnumber;
    private String PHnumber;
    private String TINnumber;
    private String PagIbigNumber;
    
    
    //constructor
    public Employee(int employeeID, String lastName, String firstName, String DOB, String position, double salary){
        this.employeeID = employeeID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.DOB = DOB;
        this.position = position;
        this.salary = salary;
    }
    
    //getters
    public int getEmployeeID(){return employeeID;}
    public String getLastName(){return lastName;}
    public String getFirstName(){return firstName;}
    public String getDOB(){return DOB;}
    public String getPosition(){return position;}
    public double getSalary(){return salary;}
    public String getAddress(){return address;}
    public String getPhoneNumber(){return phoneNumber;}
    public String getSSSnumber(){return SSSnumber;}
    public String getPHnumber(){return PHnumber;}
    public String getTINnumber(){return TINnumber;}
    public String getPagIbigNumber(){return PagIbigNumber;}
    
    //setters
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setDOB(String DOB){this.DOB = DOB;}
    public void setPosition(String position){this.position = position;}
    public void setSalary(double salary){this.salary = salary;}
    public void setAddress(String address){this.address = address;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber = phoneNumber;}
    
    //display employee details
    public void displayEmployee(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + DOB);
        System.out.println("Position: " + position);
        System.out.println("Basic Salary: PHP " + salary);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("SSS Number: " + SSSnumber);
        System.out.println("Phil Health Number: " + PHnumber);
        System.out.println("TIN: " + TINnumber);
        System.out.println("PagIbig Number: " + PagIbigNumber);
    }
    
}