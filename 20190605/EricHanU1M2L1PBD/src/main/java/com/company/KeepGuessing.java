package com.company;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(10) + 1;

        System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
        String userInput = myScanner.nextLine();
        int guess = Integer.parseInt(userInput);

        while (guess != randomNumber) {
            System.out.println("Your guess: " + guess);
            System.out.println("That is incorrect. Guess again.");
            userInput = myScanner.nextLine();
            guess = Integer.parseInt(userInput);
        }
        System.out.println("That's right! You're a good guesser.");
    }
}

