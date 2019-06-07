package com.company;

import java.util.Random;

public class DiceDouble {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("HERE COMES THE DICE!");

        int rollDice1 = random.nextInt(6)+1;
        int rollDice2 = random.nextInt(6)+1;
        System.out.println("Roll #1: " + rollDice1);
        System.out.println("Roll #2: " + rollDice2);
        int firstRoll = rollDice1 + rollDice2;

        System.out.println("The NEW TOTAL is " + firstRoll);


        while(rollDice1!=rollDice2){
            rollDice1 = random.nextInt(6)+1;
            rollDice2 = random.nextInt(6)+1;
            System.out.println("                     ");
            System.out.println("Roll #1: " + rollDice1);
            System.out.println("Roll #2: " + rollDice2);

            int total = rollDice1 + rollDice2;

            System.out.println("The total is " + total + "!");

        }
    }
}