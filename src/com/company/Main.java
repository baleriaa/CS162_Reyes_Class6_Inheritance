package com.company;

public class Main {

    public static void main(String[] args) {
	Employee employee = new Employee();
    Employee technicalWriter = new TechnicalWriter();
    Employee engineer = new Engineer();
    Employee productManager = new ProductManager();
	System.out.println(employee.toString());
    System.out.println(technicalWriter.toString());
    System.out.println(engineer.toString());
    System.out.println(productManager.toString());
    }
}
