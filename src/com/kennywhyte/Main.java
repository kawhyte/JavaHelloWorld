package com.kennywhyte;

public class Main {

    public static void main(String[] args) {

//        var browser = new Browser();
//        browser.navigate("address");


        var employee = new Employee(10, 30);
        //employee.setBaseSalary(50);
        //employee.set_hourlyRate(20);
        employee.calculateWage(1);
        int wage = employee.calculateWage(10);

        System.out.println(wage);
    }

}
