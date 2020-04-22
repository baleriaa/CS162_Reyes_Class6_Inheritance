package com.company;

public class Engineer extends Employee {
    private int yearsAtCompany;
    private int yearsOfExperience;
    private int signOnBonus;

    public Engineer(int yearsAtCompany, int yearsOfExperience){
        super();
        this.yearsAtCompany = yearsAtCompany;
        this.yearsOfExperience = yearsOfExperience;
    }
    public int getSignOnBonus(){
        if(yearsOfExperience <=5){
            signOnBonus = 5000;
        }
        else if(yearsOfExperience >5){
            signOnBonus = 10000;
        }
        return signOnBonus;
    }
    @Override
    public int getVacationWeeks(){
        return (super.getVacationWeeks() +yearsAtCompany +1);
    }
    @Override
    public String getName(){
        return "Engineer";
    }
    @Override
    public double getBaseSalary() {
        return (super.getBaseSalary() *1.5);
    }
    public String motto(){
        return "To the optimist, the glass is half full. To the pessimist, the glass is half empty.To the engineer, the glass is twice as big as it needs to be.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nSign-on bonus: $" +getSignOnBonus();
    }
}
