package com.company;

import java.util.Scanner;

public class MonthConverterSwitch {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 12.");
        String inputMonth = myScanner.nextLine();

        int userInput = Integer.parseInt(inputMonth);

        // if else are good for variable conditions that result into a boolean,
        // whereas switch statements are great for fixed data values.
        //  A switch is really saying "pick one of these based on this variables value"
        //  but an if statement is just a series of boolean checks.
        if (userInput == 1) {
            System.out.println("January");
        } else if (userInput == 2) {
            System.out.println("February");
        } else if (userInput == 3) {
            System.out.println("March");
        } else if (userInput == 4) {
            System.out.println("April");
        } else if (userInput == 5) {
            System.out.println("May");
        } else if (userInput == 6) {
            System.out.println("June");
        } else if (userInput == 7) {
            System.out.println("July");
        } else if (userInput == 8) {
            System.out.println("August");
        } else if (userInput == 9) {
            System.out.println("September");
        } else if (userInput == 10) {
            System.out.println("October");
        } else if (userInput == 11) {
            System.out.println("November");
        } else if(userInput == 12) {
            System.out.println("December");
        } else {
            System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye");
        }
    }
}
