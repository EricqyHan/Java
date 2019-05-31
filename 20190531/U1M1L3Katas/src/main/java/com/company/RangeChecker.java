package com.company;

import java.util.Scanner;

public class RangeChecker {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int userInput;

        do {
            System.out.println("Pick a number between 15 and 32");
            userInput = Integer.parseInt(myScanner.nextLine());

            if (userInput > 15 && userInput < 32) {
                System.out.println("You entered " + userInput + ".");
            }
        } while (userInput < 16 || userInput > 31);
    }
}

