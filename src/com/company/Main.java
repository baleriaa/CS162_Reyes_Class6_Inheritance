package com.company;

public class Main {

    public static void main(String[] args) {
	Employee employee = new Employee();
    Employee technicalWriter = new TechnicalWriter(2);
    Employee engineer = new Engineer(7, 7);
    Employee productManager = new ProductManager(5, 17);
	System.out.println(employee.toString());
    System.out.println(technicalWriter.toString());
    System.out.println(engineer.toString());
    System.out.println(productManager.toString());

    }
}
