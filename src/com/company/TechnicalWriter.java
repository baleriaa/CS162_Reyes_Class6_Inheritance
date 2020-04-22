package com.company;

public class TechnicalWriter extends Employee {
    private int yearsAtCompany;

    public TechnicalWriter(int yearsAtCompany){
        super();
        this.yearsAtCompany = yearsAtCompany;
    }
    @Override
    public String getName(){
        return "Technical Writer";
    }
    @Override
    public int getVacationWeeks(){
        return (super.getVacationWeeks() +yearsAtCompany);
    }
    public String motto(){
        return "You can always edit a bad page. You can’t edit a blank page.";
    }
}
