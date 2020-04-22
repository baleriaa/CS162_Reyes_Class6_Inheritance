 package com.company;

/**
 * Employee.java - Employee Benefits Management
 * @author Kimberly Bryant
 * @version 1
 */
public class Employee {
    private String name;
    private double baseSalary;
    private int yearsOfExperience;
    private int yearsAtCompany;
    private int vacationDays;

    /**
     * Parameterless constructor
     */
    public Employee(){
        name = "DEFAULT";
        baseSalary = 25000.00;
        yearsOfExperience = 0;
        yearsAtCompany = 0;
        vacationDays = 0;
    }

    /**
     * Parameterless constructor
     *@param name String
     *@param baseSalary double
     *@param yearsOfExperience int
     *@param yearsAtCompany int
     */
    public Employee(String name, double baseSalary, int yearsOfExperience, int yearsAtCompany){
        this.name = name;
        this.baseSalary = baseSalary;
        this.yearsOfExperience = yearsOfExperience;
        this.yearsAtCompany = yearsAtCompany;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }

    public int getVacationDays() {
        return vacationDays;
    }



    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsAtCompany() {
        return yearsAtCompany;
    }

    public void setYearsAtCompany(int yearsAtCompany) {
        this.yearsAtCompany = yearsAtCompany;
    }

    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        return "Employee name: "+name +"\nSalary: " +baseSalary +"\nVacation days: " +vacationDays +"\n" +motto();
    }
    /**
     * Returns a generic employee motto
     * @return A value of data type String
     */
    public String motto(){
        return "We value our employees";
    }
}