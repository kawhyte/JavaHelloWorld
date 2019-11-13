package com.kennywhyte;

public class Main {

    public static void main(String[] args) {

//        var browser = new Browser();
//        browser.navigate("address");


        var employee = new Employee(1000, 30);
        //employee.setBaseSalary(50);
        //employee.set_hourlyRate(20);
        employee.calculateWage();
        int wage = employee.calculateWage();

        System.out.println(wage);
    }

}
