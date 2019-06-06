package com.company;

import com.company.interfaces.UserIO;

import java.util.Scanner;


public class Input implements UserIO{
Scanner myScanner = new Scanner(System.in);

    public int readInt(String prompt){
        System.out.println(prompt);
        int userInput = Integer.parseInt(this.myScanner.nextLine());
        return userInput;
    };


    public long readLong(String prompt){
        System.out.println(prompt);
        long userInput = Long.parseLong(this.myScanner.nextLine());
        return userInput;
    };


    public double readDouble(String prompt){
        System.out.println(prompt);
        double userInput = Double.parseDouble(this.myScanner.nextLine());
        return userInput;

    };

    public float readFloat(String prompt){
        System.out.println(prompt);
        float userInput = Float.parseFloat(this.myScanner.nextLine());
        return userInput;
    };

    public String readString(String prompt){
        System.out.println(prompt);
        String userInput = this.myScanner.nextLine();
        return userInput;
    };

}
