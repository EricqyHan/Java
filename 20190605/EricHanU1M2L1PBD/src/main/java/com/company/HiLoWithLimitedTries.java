package com.company;

import java.util.Random;
import java.util.Scanner;

public class HiLoWithLimitedTries {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");

        System.out.println("First Guess: " );
        String firstGuess = myScanner.nextLine();

        boolean guess = false;

        Random randomGenerator = new Random();
        int compGuess = randomGenerator.nextInt(100) + 1;
        int userGuess;
        int numberOfGuessesLeft = 6;

        //System.out.println("Computer guess is " + compGuess); // testing what the computer is

        while( !guess && numberOfGuessesLeft > 0) {

            System.out.println("Guess a number: ");
            userGuess = Integer.parseInt(myScanner.nextLine());

            if(userGuess > compGuess) {
                System.out.println();
                numberOfGuessesLeft -= 1;
                System.out.println("Number of guesses left: " + numberOfGuessesLeft);
                System.out.println("Sorry, you are too high!");
            } else if (userGuess < compGuess) {
                numberOfGuessesLeft -= 1;
                System.out.println("Number of guesses left: " + numberOfGuessesLeft);
                System.out.println("Sorry, you are too low!");
            } else {
                guess = true;
            }

            if(numberOfGuessesLeft <= 0) {
                System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
            }
        }

;
    }
}
