package com.company;

import java.util.Scanner;

public class CountTo {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Pick a number for us to count to. We will count from 0 to that number!");
        String userInput = myScanner.nextLine();
        int userSelectedNumber = Integer.parseInt(userInput);

        for(int i = 0; i <= userSelectedNumber; i++) {
            System.out.println(i);
        }

    }
}
