package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        America teamAmericaWorldPolice = new America(); //America class where America is AKA Inventory for states

        while(true) {
            System.out.println("Please enter an option: [A]dd, [D]elete, [L]ist, [S]earch, [E]xit");
            String option = myScanner.nextLine().toLowerCase();

            switch(option) {
                case "add":
                case "a":
                    teamAmericaWorldPolice.addState();
                    break;
                case "list":
                case "l":
                    teamAmericaWorldPolice.listStates();
                    break;
                default:
                    System.out.println("Invalid selection.");
            }
        }

    }
}
