/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication.motorphemployeeapp;

/**
 *
 * @author Annie Victoria Acar
 */
public class Compensation {
    private int compensationID;
    private int employeeID;
    private String effectiveDate;
    private double baseSalary;
    private double riceSubsidy;
    private double phoneAllowance;
    private double clothingAllowance;
    private double grossSemiMonthlyRate;
    private double hourlyRate;
    
    //cosntructr
    public Compensation(int compensationID, int employeeID, String effectiveDate, double baseSalary, double riceSubsidy, double phoneAllowance, double clothingAllowance){
        this.compensationID = compensationID;
        this.employeeID = employeeID;
        this.effectiveDate = effectiveDate;
        this.baseSalary = baseSalary;
        this.riceSubsidy = riceSubsidy;
        this.phoneAllowance = phoneAllowance;
        this.clothingAllowance = clothingAllowance;
    }
    
    //getters
    public int getCompensationID(){return compensationID;}
    public int getEmployeeID(){return employeeID;}
    public String getEffectiveDate(){return effectiveDate;}
    public double getBaseSalary(){return baseSalary;}
    public double getRiceSubsidy(){return riceSubsidy;}
    public double getPhoneAllowance(){return phoneAllowance;}
    public double getClothingAllowance(){return clothingAllowance;}
    public double getGrossSemiMonthlyRate(){return grossSemiMonthlyRate;}
    public double getHourlyRate(){return hourlyRate;}
    
    //settsrs
    public void setBaseSalary(double baseSalary){this.baseSalary = baseSalary;}
    public void setRiceSubsidy(double riceSubsidy){this.riceSubsidy = riceSubsidy;}
    public void setPhoneAllowance(double phoneAllowance){this.phoneAllowance = phoneAllowance;}
    public void setClothingAllowance(double clothingAllowance){this.clothingAllowance = clothingAllowance;}
    
    //calculate compensation
    public void calculateTotalCompensation(){
        grossSemiMonthlyRate = baseSalary/2;
        hourlyRate = baseSalary/160;
    }
    
    //display compensation data
    public void displayCompensation(){
        System.out.println("Compensation ID: " +compensationID);
        System.out.println("Employee ID: " +employeeID);
        System.out.println("Effective Date: " +effectiveDate);        
        System.out.println("Basic Salary: PHP " +baseSalary);
        System.out.println("Rice Subsidy: PHP " +riceSubsidy);
        System.out.println("Phone Allowance: PHP " +phoneAllowance);
        System.out.println("Clothing Allowance: PHP " +clothingAllowance);
        System.out.println("Gross Semi-monthly Rate: PHP " +grossSemiMonthlyRate);
        System.out.println("Hourly Rate: PHP " +hourlyRate);
    }
}