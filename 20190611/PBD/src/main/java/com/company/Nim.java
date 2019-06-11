package com.company;

import java.util.Scanner;

public class Nim {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Player 1, enter your name.");
        String userInput1 = myScanner.nextLine();
        System.out.println("Player 2, enter your name.");
        String userInput2 = myScanner.nextLine();

        int a = 3;
        int b = 3;
        int c = 3;
        int removeFrom;
        String userinput;
        String player1 = userInput1;
        String player2 = userInput2;

        do{
            System.out.println(player1 + " Choose a pile: ");
            System.out.println(" A : " + a + "| B : " + b + "| C : " + c);
            userinput = myScanner.nextLine();
            System.out.println("How many to remove from pile " + userinput);
            removeFrom = Integer.parseInt(myScanner.nextLine());

            //Player 1
            if (userinput.equals("a")) {
                a = a - removeFrom;
            } else if (userinput.equals("b")) {
                b = b - removeFrom;
            } else if (userinput.equals("c")) {
                c = c - removeFrom;
            } else {
                System.out.println("Pile invalid. Select another pile.");
            }
            System.out.println(" A : " + a + "| B : " + b + "| C : " + c);
            System.out.println("                                       ");
            //Player 2
            System.out.println(player2 + " Choose a pile: ");
            System.out.println(" A : " + a + "| B : " + b + "| C : " + c);
            userinput = myScanner.nextLine();
            System.out.println("How many to remove from pile " + userinput);
            removeFrom = Integer.parseInt(myScanner.nextLine());

            if (userinput.equals("a")) {
                a = a - removeFrom;
            } else if (userinput.equals("b")) {
                b = b - removeFrom;
            } else if (userinput.equals("c")) {
                c = c - removeFrom;
            } else {
                System.out.println("Pile invalid. Select another pile.");
            }
            System.out.println(" A : " + a + "| B : " + b + "| C : " + c);

        }  while((a != 0) && (b != 0) && (c != 0));{
            System.out.println("All piles are empty. Good Job!");
        }
    }
}
