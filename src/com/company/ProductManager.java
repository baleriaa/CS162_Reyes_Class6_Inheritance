package com.company;

public class ProductManager extends Employee {
    private int yearsAtCompany;
    private int yearsOfExperience;
    private int sharesOfStock;

    public ProductManager(int yearsAtCompany, int yearsOfExperience){
        super();
        this.yearsAtCompany = yearsAtCompany;
        this.yearsOfExperience = yearsOfExperience;
        sharesOfStock = 100 * yearsOfExperience;
    }
    @Override
    public int getVacationWeeks(){
        return super.getVacationWeeks() +yearsAtCompany +2;
    }
    @Override
    public String getName(){
        return "Product Manager";
    }
    @Override
    public double getBaseSalary() {
        return (super.getBaseSalary() *2.5);
    }
    @Override
    public String motto(){
        return "There is nothing so useless as doing efficiently that which should not be done at all.";
    }
    @Override
    public String toString() {
        return super.toString() + "\nShares of stock: " +sharesOfStock;
    }
}
