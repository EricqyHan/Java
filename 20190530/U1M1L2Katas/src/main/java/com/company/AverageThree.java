package com.company;

import java.util.Scanner;

public class AverageThree {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int firstInput;
        int secondInput;
        int thirdInput;


        System.out.println("Enter a number: ");
        firstInput = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter a second number: ");
        secondInput = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter a third number: ");
        thirdInput = Integer.parseInt(myScanner.nextLine());


        int sum  = (firstInput + secondInput + thirdInput);
        float average = sum / 3.0f;
        System.out.printf("%.2f", average);


    }
}
