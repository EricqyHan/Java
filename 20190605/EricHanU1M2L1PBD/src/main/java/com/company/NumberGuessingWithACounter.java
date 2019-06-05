package com.company;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingWithACounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("I have chosen a number number between 1 and 10. Try to guess it.");

        boolean guess = false;

        Random randomGen = new Random();
        int computerGuess = randomGen.nextInt(10) + 1;
        int userGuess;
        int numberOfGuesses = 0;

        while(!guess) {
            numberOfGuesses++;

            System.out.println("Your guess: ");
            userGuess = Integer.parseInt(scan.nextLine());

            if(userGuess != computerGuess) {
                System.out.println("That is incorrect. Guess Again!");
            } else {
                guess = true;
            }
        }
        System.out.println("That's right. You're a good guesser.");
        System.out.printf("It took you %d tries.%n", numberOfGuesses);
    }
}
