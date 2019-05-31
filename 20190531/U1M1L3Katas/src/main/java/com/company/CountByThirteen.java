package com.company;

import java.util.Scanner;

public class CountByThirteen {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What number would you like to count to by thirteen's?");
        String userInput = myScanner.nextLine();
        int userNumber = Integer.parseInt(userInput);

        for(int i = 0; i <= userNumber; i+=13){
            System.out.println(i);
        }

    }
}