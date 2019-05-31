package com.company;

import java.util.Scanner;

public class YourAgeCan {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("How old are you?");
        String inputAge = myScanner.nextLine();

        int age = Integer.parseInt(inputAge);

        if (age >= 100) {
            System.out.println("Is more than a century old.");
        } if (age >= 80 && age <= 89) {
            System.out.println("Is an octogenerian.");
        } if (age >=65) {
            System.out.println("Can retire.");
        } if (age >=55) {
            System.out.println("Is eligible for AARP.");
        } if (age >= 35) {
            System.out.println("Be president");
        } if (age >= 21) {
            System.out.println("Drink alcohol");
        } if (age >= 18) {
            System.out.println("Vote");
        }


    }
}
