/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication.motorphemployeeapp;

/**
 *
 * @author Annie Victoria Acar
 */
public class Salary {
    private final int salaryID;
    private final int employeeID;
    private String payPeriodStart;
    private String payPeriodEnd;
    private double workHours;
    private double overtimeHours;
    private double grossPay;
    private double deduction;
    private double netPay;
    
    //constructor
    public Salary(int salaryID, int employeeID, String payPeriodStart, String payPeriodEnd, double workHours, double overtimeHours){
        this.salaryID = salaryID;
        this.employeeID = employeeID;
        this.payPeriodStart = payPeriodStart;
        this.payPeriodEnd = payPeriodEnd;
        this.workHours = workHours;
        this.overtimeHours = overtimeHours;
    }
    
    //getters
    public int getSalaryID(){return salaryID;}
    public int getEmployeeID(){return employeeID;}
    public String getPayPeriodStart(){return payPeriodStart;}
    public String getPayPeriodEnd(){return payPeriodEnd;}
    public double getWorkHours(){return workHours;}
    public double getOvertimeHours(){return overtimeHours;}
    public double getGrossPay(){return grossPay;}
    public double getDeduction(){return deduction;}
    public double getNetPay(){return netPay;}
    
    //setters
    public void setGrossPay(double grossPay){this.grossPay = grossPay;}
    public void setDeduction(double deduction){this.deduction = deduction;}
    
    //calculate salary
    public void calculateSalary(){
        grossPay = (workHours*(grossPay/160))+(overtimeHours*(grossPay/160*1.5));
        netPay = grossPay-deduction;
    }
    
    //display salary informaiton
    public void displaySalary(){
        System.out.println("Salary ID: " + salaryID);
        System.out.println("Employee ID: " +employeeID);
        System.out.println("Pay Period:" + payPeriodStart + " to " +payPeriodEnd);
        System.out.println("Work Hours: " +workHours);
        System.out.println("Overtime Hours: " +overtimeHours);
        System.out.println("Gross Pay: PHP " +grossPay);
        System.out.println("Deductions: PHP " +deduction);
        System.out.println("Net Pay: PHP " +netPay);
    }
}