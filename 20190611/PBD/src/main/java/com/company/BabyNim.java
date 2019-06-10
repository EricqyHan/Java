package com.company;

import java.util.Scanner;

public class BabyNim {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int a = 3;
        int b = 3;
        int c = 3;

        String userinput = myScanner.nextLine();

        do{
            System.out.println("Choose a pile: ");
            userinput = myScanner.nextLine();
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

        } while(a >0 || b > 0 || c > 0);{
            System.out.println("All piles are empty. Good Job!");
        }
    }

}

