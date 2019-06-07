package com.company;

import java.util.Scanner;

public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("I will add up the numbers you give me. ");
        String userInput = myScanner.nextLine();
        int addValues = Integer.parseInt(userInput);


        while(addValues != 0){
            System.out.println("Number: ");
            userInput = myScanner.nextLine();
            addValues = Integer.parseInt(userInput);
        }
        System.out.println("The total is: " + addValues);
    }

}
