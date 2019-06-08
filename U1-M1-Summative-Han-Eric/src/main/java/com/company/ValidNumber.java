package com.company;

import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10.");

        String userInput;
        int userNumber;


do {
        userInput = myScanner.nextLine();
        userNumber = Integer.parseInt(userInput);
        if ((userNumber < 1) || (userNumber > 10)) {
            System.out.println("You must enter a number 1 and 10, please try again.");
        }
} while  ((userNumber < 1) || (userNumber > 10)) ; { // needs to be true
            System.out.println(userNumber);
        }

    }
}
