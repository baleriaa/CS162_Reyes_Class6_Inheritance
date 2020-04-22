 package com.company;

/**
 * Employee.java - Employee Benefits Management
 * @author Baleria Reyes
 * @version 1
 */
public class Employee {
    private String name;
    private double baseSalary;
    private int yearsOfExperience;
    private int yearsAtCompany;
    private int vacationWeeks;

    /**
     * Parameterless constructor
     */
    public Employee(){
        name = "DEFAULT";
        baseSalary = 60000.00;
        yearsOfExperience = 0;
        yearsAtCompany = 0;
        vacationWeeks = 0;
    }

    /**
     * Parameterized constructor
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

    public void setVacationWeeks(int vacationDays) {
        this.vacationWeeks = vacationDays;
    }

    public int getVacationWeeks() {
        return vacationWeeks;
    }
    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * Returns the employees name, salary and motto
     * @return A value of data type String
     */
    public String toString(){
        return "Employee name: "+getName() +"\nSalary: $" +getBaseSalary() +"\nVacation days: " +getVacationWeeks() *7 +"\nMotto: " +motto();
    }
    /**
     * Returns a generic employee motto
     * @return A value of data type String
     */
    public String motto(){
        return "We value our employees";
    }
}