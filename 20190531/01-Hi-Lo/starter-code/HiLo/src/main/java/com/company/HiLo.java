package com.company;
import java.util.Random;
import java.util.Scanner;
public class HiLo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Hi-Low");
        System.out.println("Please enter your name: ");
        String userName = myScanner.nextLine();

        System.out.println("Okay, "+ userName+" here are the rules:");
        System.out.println("I will come up with a number between 1 and 100 and you will have to guess which number I have picked.");
        System.out.println("Are you ready? Let's go!");

        // bound is how big window is
        // + 1 is where the number starts from
        int compGenNumber = random.nextInt(100) + 1;
        int userNumber;
        int userGuesses =0;

        do {
            userGuesses = userGuesses+1;
            System.out.println("Guess a number");
            userNumber = Integer.parseInt(myScanner.nextLine());
            if (userNumber == compGenNumber){
                System.out.println("Congratulations, " + userName + "! You win!");
                System.out.println("It took you " + userGuesses + " guesses to find my number!");
            }
            else if (userNumber < compGenNumber) {
                //userGuesses = userGuesses +1;
                System.out.println("Too low!");
            } else if ( userNumber > compGenNumber) {
                //userGuesses = userGuesses +1;
                System.out.println("Too high!");
            }
        } while ( userNumber != compGenNumber);

    }
}