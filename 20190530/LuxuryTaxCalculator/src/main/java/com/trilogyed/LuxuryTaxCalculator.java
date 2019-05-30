package com.trilogyed;

import java.util.Scanner;

public class LuxuryTaxCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int firstSalary;
        int secondSalary;
        int thirdSalary;

        System.out.println("Enter the salary for player 1" );
        firstSalary = Integer.parseInt(myScanner.nextLine());
        System.out.println("Enter the salary for player 2");
        secondSalary = Integer.parseInt(myScanner.nextLine());
        System.out.println("Enter the salary for player 3");
        thirdSalary = Integer.parseInt(myScanner.nextLine());


        int sum = (firstSalary + secondSalary + thirdSalary);


        if (sum > 40000000) {
            int taxableAmount = sum - 40000000;
            double luxuryTaxCost = (taxableAmount *.18);
            System.out.printf("Tax rate is $%.2f", luxuryTaxCost);
        }




    }
}
