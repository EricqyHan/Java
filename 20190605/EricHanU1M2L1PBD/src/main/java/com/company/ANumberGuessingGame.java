package com.company;

import java.util.Random;
import java.util.Scanner;

public class ANumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner myScanner = new Scanner(System.in);

        System.out.println("I'm thinking of a number between 1 to 10.");
        String guessNumber = myScanner.nextLine();

        int guess = Integer.parseInt(guessNumber);

        int imThinking = random.nextInt(10)+1;


        System.out.println("Your guess: " + imThinking);


        if (guess == imThinking) {
            System.out.println( "That's right! My secret number was " + imThinking + "!");
        } else {
            System.out.println("Sorry, but I was really thinking of " + imThinking + ".");
        }


    }
}
