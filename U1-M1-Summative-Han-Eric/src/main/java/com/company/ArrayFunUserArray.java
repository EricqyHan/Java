package com.company;

import java.util.Scanner;

public class ArrayFunUserArray {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Enter five numbers");

        for (int i = 0; i < array.length; i++){
            System.out.println("Enter number " + (i+1) + ": ");
            array[i] = Integer.parseInt(myScanner.nextLine());
        }

        for (int arrays: array){
            System.out.print(arrays + " ");
        }


    }
}
