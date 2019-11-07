package com.kennywhyte;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //TextBox textbox1 = new TextBox();//test
        var textbox1 = new TextBox();

        textbox1.setText(" Box 1");
        System.out.println(textbox1.text.toUpperCase());

        var textbox2 = new TextBox();
        textbox2.setText(" Box 2");
        System.out.println(textbox2.text.toUpperCase());
    }


    public static String greetUser(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }
}
