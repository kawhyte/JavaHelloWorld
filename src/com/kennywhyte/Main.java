package com.kennywhyte;

public class Main {

    public static void main(String[] args) {

//        var browser = new Browser();
//        browser.navigate("address");


        var employee = new Employee(1000, 30);
        var employee2 = new Employee(1000, 30);
        var employee3 = new Employee(1000, 30);
        var employee5 = new Employee(1000, 30);
        var employee4 = new Employee(1000, 30);
        //employee.setBaseSalary(50);
        //employee.set_hourlyRate(20);
        employee.calculateWage();
        int wage = employee.calculateWage();

        System.out.println(wage);
        Employee.print();
    }

}
