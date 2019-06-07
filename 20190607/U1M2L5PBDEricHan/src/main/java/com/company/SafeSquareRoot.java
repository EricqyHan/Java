package com.company;

import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Square Root");
        System.out.println("Enter a number: ");

        String userSquare = myScanner.nextLine();
        int square =Integer.parseInt(userSquare);


        while(square < 0) {
            System.out.println("You can't take the square root of a negative number, silly.");
            System.out.println("Try again: ");
            square = Integer.parseInt(myScanner.nextLine());
        }
        double x = Math.sqrt(square);
        System.out.println("The square root of " + square + " is " + x +".");
    }
}
