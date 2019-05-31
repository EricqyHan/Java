package com.trilogyed;

import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Give me a number. We will count to it using only prime numbers.");
        String userInput = myScanner.nextLine();
        int userNum = Integer.parseInt(userInput);

        // Starting loop from 1 and going to userInput number
        for (int i = 1; i <= userNum; i ++) {

            // boolean set to true
            boolean isPrime = true;

            // This loop divides numbers from the first loop
            // it divides from 2 all the way up
            // the boolean is set to false if our remainder is set to 0
            for (int p = 2; p < i; p++) {
                if (i % p == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " ");
            }

        }

    }
}
