package com.company;

import java.util.Random;
import java.util.Scanner;

public class KeepGuessing {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random random = new Random();

            System.out.println("I have chosen a number between 1 and 10. Try to guess it.");
            String userInput = myScanner.nextLine();

            int guess = Integer.parseInt(userInput);

            int randomNumber=random.nextInt(10)+1;
           System.out.println(randomNumber);

//           while(guess != randomNumber)){
//               System.out.println("Your Guess:" + guess);
//               guess = myScanner.nextInt();
//               userInput = Integer.parseInt(guess);
//            System.out.println();
//           }
        }
    }

