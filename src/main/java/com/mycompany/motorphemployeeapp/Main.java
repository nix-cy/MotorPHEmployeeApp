/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication.motorphemployeeapp;

import java.util.Scanner;

/**
 *
 * @author Annie Victoria Acar
 */
public class Main {
    public static void main(String[]args){
        EmployeeManager manager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
                
                
            //adding employees
            Employee emp1 = new Employee(1, "Mata", "Chrisian", "1987-10-21", "Account Team Leader", 42975);
            Employee emp2 = new Employee(2, "San Jose", "Brad1"
                    + "", "1996-03-15", "HR Team Leader", 42975);
            
            manager.addEmployee(emp1);
            manager.addEmployee(emp2);
            
            //assigning departments
            Department department1 = new Department(101, "HR", "Andrea Mae Villanueva");
            Department department2 = new Department(102, "IT", "Eduard Hernandez");
            
            System.out.println("Departments Assigned: ");
            department1.displayDepartment();
            department2.displayDepartment();
            
            //tracck attendance
            Attendance attendance1 = new Attendance(1, emp1.getEmployeeID(), "2022-09-01", "08:00", "17:00");
            Attendance attendance2 = new Attendance(2, emp2.getEmployeeID(), "2022-09-01", "08:00", "17:00");
            
            System.out.println("Attendance Records: ");
            attendance1.displayAttendance();
            attendance2.displayAttendance();
            
            //compensation details
            Compensation compensation1 = new Compensation(1, emp1.getEmployeeID(), "2022-09-01", 42975, 1500,800,800);
            Compensation compensation2 = new Compensation(2, emp2.getEmployeeID(), "2022-09-01", 42975, 1500,800,800);
            
            compensation1.calculateTotalCompensation();
            compensation2.calculateTotalCompensation();
            
            System.out.println("Compensation Details: ");
            compensation1.displayCompensation();
            compensation2.displayCompensation();
            
            //salary records
            Salary salary1 = new Salary(1, emp1.getEmployeeID(),"2022-09-01", "2022-09-15", 80, 5);
            Salary salary2 = new Salary(2, emp2.getEmployeeID(),"2022-09-01", "2022-09-15", 80, 2);
            
            salary1.calculateSalary();
            salary2.calculateSalary();
            
            System.out.println("Salary Records: ");
            salary1.displaySalary();
            salary2.displaySalary();
            
            //display all employees
            //manager.displayEmployees();
            
            //search for Employee id
            System.out.print("Enter Employee Id to search: ");
            int searchID = scanner.nextInt();
            Employee foundEmp = manager.getEmployeeByID(searchID);
            
            if (foundEmp != null){
                foundEmp.displayEmployee();
            } else{
                System.out.print("Employee not found!");
            }
            
            
            //updating salary
            System.out.print("Enter Employee ID to update salary: ");
            int updateSalaryID = scanner.nextInt();
            System.out.print("Enter new salary amount: PHP ");
            double newSalary = scanner.nextDouble();
            manager.updateSalary(updateSalaryID, newSalary);
        
        
        
        }
    
}