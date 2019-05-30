package com.company;

import java.util.Scanner;

public class MultiplyThree {

    public static void main(String[] args) {
        // Scanner class used to get input
        // Created myScanner object
        // System.in permits us to read input from keyboard

        Scanner myScanner = new Scanner(System.in);

        int multipleOne;
        int multipleTwo;
        int multipleThree;

          /* Note that Integer.parseInt() is a java method used primarily
           in parsing a String method argument into an integer object */


        System.out.println("Enter a number");
        // nextLine() method is used to read strings
        multipleOne = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter a second number");
        multipleTwo = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter a third number");
        multipleThree = Integer.parseInt(myScanner.nextLine());

        // Multiply three number input from the user
        int sum = (multipleOne * multipleTwo * multipleThree);

        System.out.println(sum);

    }
}