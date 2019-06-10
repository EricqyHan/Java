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
        String player1 = userInput1;
        String player2 = userInput2;


        do {
            System.out.println(player1 + " choose a pile: ");
            String userinput = myScanner.nextLine();
            player1 = myScanner.nextLine();
            if (userinput.equals("a")) {
                a--;
            } else if (userinput.equals("b")) {
                b--;
            } else if (userinput.equals("c")) {
                c--;
            } else {
                System.out.println("Pile invalid. Select another pile.");
            }
            System.out.println(" A: " + a + " B: " + b + " C: " + c);

//            System.out.println(player2 + " choose a pile: ");
//            player2 = myScanner.nextLine();
//            if (userinput.equals("a")) {
//                a--;
//            } else if (userinput.equals("b")) {
//                b--;
//            } else if (userinput.equals("c")) {
//                c--;
//            } else {
//                System.out.println("Pile invalid. Select another pile.");
//            }
//            System.out.println(" A: " + a + " B: " + b + " C: " + c);


        } while (a > 0 || b > 0 || c > 0);
        {
            System.out.println("All piles are empty. Good Job!");
        }
    }

//        System.out.println(userInput1);
//        System.out.println(userInput2);
}