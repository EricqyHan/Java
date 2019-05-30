package com.company;

import java.util.Scanner;

public class AddThirteen {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int firstInteger;
        int addThirteen = 13;

        System.out.println("Enter a number");
        firstInteger = Integer.parseInt(myScanner.nextLine());


        int sum = firstInteger + addThirteen;

        System.out.println(sum);

    }
}
