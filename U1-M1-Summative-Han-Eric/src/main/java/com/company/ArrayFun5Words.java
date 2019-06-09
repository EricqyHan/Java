package com.company;

import java.util.Scanner;

public class ArrayFun5Words {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String[] array = new String[5];

        System.out.println("Enter five words");

        for (int i = 0; i < array.length; i++){
            System.out.println("Enter word " + (i+1) + ": ");
            array[i] = myScanner.nextLine();
        }

        for (String arrays: array){
            System.out.print(arrays + " ");
        }


    }
}
