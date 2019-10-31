package com.kennywhyte;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your Principle: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter your Annual Interest Rate: ");
        double rate = scanner.nextDouble();

        System.out.print("Period:(Years): ");
        int period = scanner.nextInt();

        double interestRate = rate / 100 / 12;

        double payment = (principal * interestRate) / (1 - Math.pow(1 + interestRate, -period));

        double mortgage = (double) Math.round(payment * 100) / 100;

        System.out.println("Mortgage " + mortgage);*/


        String[] fruits = {"apple", "banana", "Chicken"};


        System.out.println("Outside the loop: " + Arrays.toString(fruits));


        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for (String fruit : fruits
        ) {
            System.out.println("Last: " + fruit);
        }

    }
}
