package com.company;

import java.util.Scanner;

public class CountByTwo {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What number would you like to count to by two's?");
        String userInput = myScanner.nextLine();
        int userNum = Integer.parseInt(userInput);

        for (int i = 0; i <= userNum; i+= 2){
            System.out.println(i);
        }
    }
}
