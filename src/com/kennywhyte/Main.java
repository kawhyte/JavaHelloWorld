package com.kennywhyte;

public class Main {

    public static void main(String[] args) {

        var employee = new Employee();
        employee.setBaseSalary(50);
        employee.set_hourlyRate(20);

        int wage = employee.calculateWage(10);

        System.out.println(wage);
    }

}
