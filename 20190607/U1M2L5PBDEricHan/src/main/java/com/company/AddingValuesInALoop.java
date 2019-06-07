package com.company;

import java.util.Scanner;

public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("I will add up the numbers you give me. ");
        System.out.println("Number: ");

        int addValues;
        int sum = 0;

        addValues = myScanner.nextInt();

        while(addValues != 0){
            sum = sum + addValues;
            System.out.println("Number: ");
            addValues = myScanner.nextInt();
            System.out.println("The total number so far is : " + (sum + addValues));
        }
        System.out.println("The total is: " + sum);
    }

}
