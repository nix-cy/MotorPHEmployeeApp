/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication.motorphemployeeapp;

/**
 *
 * @author Annie Victoria Acar
 */
public class Department {
    private final int departmentID;
    private String nameD;
    private String deptHead;
    
    //constructor
    public Department(int departmentID, String nameD, String deptHead){
        this.departmentID = departmentID;
        this.nameD = nameD;
        this.deptHead = deptHead;
    }
    
    //getters
    public int getDepartmentID(){return departmentID;}
    public String getNameD(){return nameD;}
    public String getDeptHead(){return deptHead;}
    
    //setters
    public void setName(String nameD){this.nameD = nameD;}
    public void setDeptHead(String deptHead){this.deptHead = deptHead;}
    
    //display department information
    public void displayDepartment(){
        System.out.println("Department ID: " + departmentID);
        System.out.println("Name: " + nameD);
        System.out.println("Department Head: " + deptHead);
    }
}