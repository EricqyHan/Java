package com.company;

import java.util.Scanner;

public class BabyNim {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int a = 3;
        int b = 3;
        int c = 3;
        int removeFrom;
        String userinput;

        do{
            System.out.println("Choose a pile: ");
            userinput = myScanner.nextLine();
            System.out.println("How many to remove from pile " + userinput);
            removeFrom = Integer.parseInt(myScanner.nextLine());


            if (userinput.equals("a")) {
                a = a - removeFrom;
            } else if (userinput.equals("b")) {
                b = a - removeFrom;
            } else if (userinput.equals("c")) {
                c = c - removeFrom;
            } else {
                System.out.println("Pile invalid. Select another pile.");
            }
            System.out.println(" A: " + a + " B: " + b + " C: " + c);

        } while(a >0 || b > 0 || c > 0);{
            System.out.println("All piles are empty. Good Job!");
        }
    }

}

