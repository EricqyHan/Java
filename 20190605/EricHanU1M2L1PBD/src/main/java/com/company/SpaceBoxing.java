package com.company;

import java.util.Scanner;

public class SpaceBoxing {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your current Earth weight: ");

        String userInputWeight = myScanner.nextLine();
        float userWeight = Float.parseFloat(userInputWeight);

        System.out.println("I have the information for the following planets:");

        System.out.println("Which Planet are you visiting?");

        System.out.println("1. Venus");

//        String[][] newarr = {
//                {"1. Venus", "2. Mars", "3. Jumpiter"},
//                {"4. Saturn", "5. Uranus", "6. Neptune"}
//        };


        String userInput = myScanner.nextLine();
        int planetWeight = Integer.parseInt(userInput);

        if (planetWeight == 1) {
            System.out.printf("your weight would be %.2f pounds on that planet" , userWeight * 0.78);
        } else if (planetWeight == 2) {
            System.out.printf("your weight would be %.2f pounds on that planet" , userWeight * 0.39);
        } else if (planetWeight == 3) {
            System.out.printf("your weight would be %.2f pounds on that planet" , userWeight * 2.65);
        } else if (planetWeight == 4) {
            System.out.printf("your weight would be %.2f pounds on that planet" , userWeight * 1.17);
        }else if (planetWeight == 5) {
            System.out.printf("your weight would be %.2f pounds on that planet" , userWeight * 1.05);
        }else if (planetWeight == 6) {
            System.out.printf("your weight would be %.2f pounds on that planet" , userWeight * 1.23);
        }


        //System.out.println("Your weight would be around" + " weight " + "on that planet");
    }
}


