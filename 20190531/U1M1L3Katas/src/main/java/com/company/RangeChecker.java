package com.company;

import java.util.Scanner;

public class RangeChecker {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String userInput;
        int userNumber;

        do {
            System.out.println("Pick a number between 15 and 32");

            userInput = myScanner.nextLine();
            userNumber = Integer.parseInt(userInput);
        } while (userNumber < 16 || userNumber > 31);


    }
}
