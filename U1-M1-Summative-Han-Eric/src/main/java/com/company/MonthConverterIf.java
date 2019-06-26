package com.company;

import java.util.Scanner;

public class MonthConverterIf {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in); // I

        System.out.println("Enter a number between 1 and 12."); // Prompt asking user to input a number between 1 and 12
        String inputMonth = myScanner.nextLine();

        //A switch statement might prove to be faster than ifs provided number of cases are good.
        // If there are only few cases, it might not effect the speed in any case.
        // Prefer switch if the number of cases are more than 5 otherwise, you may use if-else too.

        int userInput = Integer.parseInt(inputMonth);

        switch(userInput) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("You have entered an invalid number. You must enter a number between 1 and 12. Goodbye");
        }



    }
}
