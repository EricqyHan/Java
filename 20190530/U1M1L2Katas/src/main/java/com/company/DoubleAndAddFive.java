package com.company;

import java.util.Scanner;

public class DoubleAndAddFive {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int firstInput;
        int five = 5;


        System.out.println("Enter a number");
        firstInput = Integer.parseInt(myScanner.nextLine());

        // Multiply firstInput by 2 and THEN add five
        int sum = (firstInput*2) + five;
        System.out.println(sum);

    }
}
