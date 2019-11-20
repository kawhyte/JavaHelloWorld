package com.kennywhyte;

import org.w3c.dom.Text;

public class Main {

    public static void main(String[] args) {
//        int principal = (int) Console.readNumber("Principal: ", 1000, 1_000_000);
//        float annualInterest = (float) Console.readNumber("Annual Interest Rate: ", 1, 30);
//        byte years = (byte) Console.readNumber("Period (Years): ", 1, 30);
//
//        var calculator = new MortgageCalculator(principal, annualInterest, years);
//        var report = new MortgageReport(calculator);
//        report.printMortgage();
//        report.printPaymentSchedule();


        var control = new TextBox();
        control.setText("hello");

//
//        control.disable();
//
//        System.out.println(control.hashCode());
        System.out.println(control.toString());

    }
}

