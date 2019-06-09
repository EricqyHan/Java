package com.company;

import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter five numbers: ");
        int num = 5;
        int numbers[] = new int[num];

        System.out.println("Enter the " + num + " numbers now.");

        for(int i = 1; i < numbers.length+1; i++){
            System.out.println("Enter number " + i + ": ");
            numbers[i] = myScanner.nextInt();
        }

        System.out.println("These are the numbers you have entered. ");

    }
}
