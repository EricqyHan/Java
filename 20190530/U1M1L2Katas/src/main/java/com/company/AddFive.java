package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AddFive {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int firstInput;
        int secondInput;
        int thirdInput;
        int fourthInput;
        int fifthInput;

        /* Note that Integer.parseInt() is a java method used primarily
           in parsing a String method argument into an integer object */

        // nextLine() method is used to read strings

        System.out.println("Enter a number");
        firstInput = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter a second number");
        secondInput = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter a third number");
        thirdInput = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter a fourth number");
        fourthInput = Integer.parseInt(myScanner.nextLine());

        System.out.println("Enter a fifth number");
        fifthInput = Integer.parseInt(myScanner.nextLine());


        int sum = (firstInput + secondInput + thirdInput + fourthInput + fifthInput);
        System.out.println(sum);



    }
}
