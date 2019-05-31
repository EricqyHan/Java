package com.company;

import java.util.Scanner;

public class FavoriteProgrammingLanguage {

    public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);

    String userInput;


        do {
            System.out.println("What is your favorite programming language?");
            userInput = myScanner.nextLine();
        }while (!userInput.equals("Java")); {
            System.out.println("That's what I was looking for! Java is definitely the answer!");
        }


    }
}
