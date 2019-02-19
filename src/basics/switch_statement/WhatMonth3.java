package basics.switch_statement;

import com.sun.istack.internal.NotNull;

import java.util.Scanner;

public class WhatMonth3 {

    public static void main(String[] args) {
        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of month: ");
        int month = scanner.nextInt();

        String result = giveMeAMonth(month);

        System.out.println("Month " + month + " is " + result);
    }

    @NotNull
    private static String giveMeAMonth(int month) {
        String monthString;
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return"March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month";
        }
    }
}
