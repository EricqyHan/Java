package com.company;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input a number: ");

        String inputNumber = myScanner.nextLine();
        int number = Integer.parseInt(inputNumber);

        if (number % 2 == 0) {
            System.out.println("This number is even.");
        } else {
            System.out.println("This number is odd.");
        }

    }
}
