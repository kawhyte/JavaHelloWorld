package com.kennywhyte;

public class Employee {

    private int baseSalary;
    private int _hourlyRate;
    //public int extraHours;
    public static int numberOfEmployees;

    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public static void print() {
        System.out.println(numberOfEmployees);

    }

    public Employee(int baseSalary, int _hourlyRate) {
        setBaseSalary(baseSalary);
        set_hourlyRate(_hourlyRate);
        numberOfEmployees++;
    }


    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) throw new IllegalArgumentException("Salary cannot be zero");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() {
        return baseSalary;
    }

    private void set_hourlyRate(int _hourlyRate) {

        this._hourlyRate = _hourlyRate;
    }

    private int get_hourlyRate() {
        return _hourlyRate;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (_hourlyRate * extraHours);
    }

    public int calculateWage() {
        return baseSalary + _hourlyRate;
    }
}
