package com.company;

import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Please enter a number between 1 and 10.");
        String userInput = myScanner.nextLine();
        int userNumber = Integer.parseInt(userInput);

        while ((userNumber < 1) || (userNumber > 10)) {
            System.out.println("You must enter a number between 1 and 10, please try again.");
            userInput = myScanner.nextLine();
            userNumber = Integer.parseInt(userInput);
        }
        System.out.println(userNumber);
    }
}