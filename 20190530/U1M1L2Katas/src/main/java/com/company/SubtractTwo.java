package com.company;

import java.util.Scanner;

public class SubtractTwo {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int subtractOne;
        int subtractTwo;

        System.out.println("Enter a number");
        subtractOne = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter a number to subtract from the first number");
        subtractTwo = Integer.parseInt((myScanner.nextLine()));

        int sum = (subtractOne-subtractTwo);
        System.out.println(sum);



    }
}
