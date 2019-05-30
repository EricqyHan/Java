package com.company;

import java.util.Scanner;

public class AddFiveAndDouble {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int firstInput;
        int five = 5;

        System.out.println("Enter a number");
        firstInput = Integer.parseInt(myScanner.nextLine());

        // Add five to firstIput and THEN double it.
        int sum = (firstInput + five)*2;
        System.out.println(sum);

    }
}
