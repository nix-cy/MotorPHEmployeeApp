/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication.motorphemployeeapp;

/**
 *
 * @author Annie Victoria Acar
 */
public class Attendance {
    private int attendanceID;
    private int employeeID;
    private String date;
    private String login;
    private String logout;
    
    //constrctor
    public Attendance(int attendanceID, int employeeID, String date, String login, String logout){
        this.attendanceID = attendanceID;
        this.employeeID = employeeID;
        this.date = date;
        this.login = login;
        this.logout = logout;
    }
    
    //getters
    public int getAttendanceID(){return attendanceID;}
    public int getEmployeeID(){return employeeID;}
    public String getDate(){return date;}
    public String getLogin(){return login;}
    public String getLogout(){return logout;}
    
    //setters
    public void setLogin(String login){this.login = login;}
    public void setLogout(String logout){this.logout = logout;}
    
    //display attendnce information
    public void displayAttendance(){
        System.out.println("Attendance Id: " +attendanceID);
        System.out.println("Employee ID: " +employeeID);
        System.out.println("Date: " +date);
        System.out.println("Login Time: " +login);
        System.out.println("Logout Time: " +logout);
    }
}