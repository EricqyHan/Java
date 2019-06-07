package com.company;

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
        System.out.println("He glances at you out of the corner of his eye and starts shuffling..");
        System.out.println("He lays down three cards.");
        System.out.println("                          ");
        System.out.println("Which one is the ace?");
        System.out.println("                          ");
        System.out.println("##        ##       ##      ");
        System.out.println("##        ##       ##      ");
        System.out.println("1         2        3      ");

        String guessCard = myScanner.nextLine();
        int guess = Integer.parseInt(guessCard);

        int threeCardMonte = random.nextInt(3) + 1;
        System.out.println("three card monte test " + threeCardMonte);


        if (guess == threeCardMonte){
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
        } else {
            System.out.println("Ha! Fast Eddie wins again! The ace was card number " + threeCardMonte);
        }





    }
}