package com.kennywhyte;

public class Employee {

    private int baseSalary;
    private int _hourlyRate;
    //public int extraHours;


    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) throw new IllegalArgumentException("Salary cannot be zero");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void set_hourlyRate(int _hourlyRate) {

        this._hourlyRate = _hourlyRate;
    }

    public int get_hourlyRate() {
        return _hourlyRate;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (_hourlyRate * extraHours);
    }
}
