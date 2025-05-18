/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication.motorphemployeeapp;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Annie Victoria Acar
 */
public class EmployeeManager {
    private List<Employee> employees = new ArrayList<>();
    
    //add an employee
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added successfully!");
    }
    
    //view all employees
    public void displayEmployees(){
        if(employees.isEmpty()){
            System.out.println("No employees available.");
        }else{
        for (Employee emp : employees){
            emp.displayEmployee();
            System.out.println("---------");}
        }
    }
    
    //search employee by id
    public Employee getEmployeeByID(int id){
        for (Employee emp : employees){ //loop thru employees
            if(emp.getEmployeeID()==id){ //if found
                return emp;
            }
        }
        return null; //if employee isn't found
    }
    
    //update Employee Position
    public void updatePosition(int id, String newPosition){
        Employee emp = getEmployeeByID(id);
        if(emp != null){
            emp.setPosition(newPosition);
            System.out.println("Position updated for Employee ID: " +id);
        }else{
            System.out.println("Employee not found!");
        }
    }
    
    //update employee salary
    public void updateSalary(int id, double newSalary){
        Employee emp = getEmployeeByID(id);
        if (emp != null){
            emp.setSalary(newSalary);
        }
    }
    
    
}