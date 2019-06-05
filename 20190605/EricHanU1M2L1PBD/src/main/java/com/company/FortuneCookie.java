package com.company;

import java.util.Random;

public class FortuneCookie {
    public static void main(String[] args) {
    Random random = new Random();


    // Need array of strings for fortune

        String[] fortuneCookieFortunes = {"If you don't program in life, life will program you.",
                                        "Learning is hard work, but everything you learn is yours and will make subsequent learning easier",
                                        "When actions grow unprofitable, gather information; when information grows unprofitable, sleep.",
                                        "You can never understand everything. But, you should push yourself to understand the system.",
                                        "Dead lift - Pick it up and put it down.",
                                        "Fall down seven times, get up eight.",
                                        "Experience is the name everyone gives to their mistakes."

        };

        // Get random string from the above array
        String randomFortune = (fortuneCookieFortunes[new Random().nextInt(fortuneCookieFortunes.length)]);



        System.out.println("Fortune cookie says: " + randomFortune);
        // System.out.println();
    }
}
