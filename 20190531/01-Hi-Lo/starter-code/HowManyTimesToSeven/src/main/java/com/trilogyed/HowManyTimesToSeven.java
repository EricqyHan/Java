package com.trilogyed;

import java.util.Random;

public class HowManyTimesToSeven {
    public static void main(String[] args) {
        Random random = new Random();

        int firstSeven = 0;
        int totalSeven = 0;
        int totalRolls = 0;

        for (int i = 0; i <= 100; i++) {
            int roll1 = random.nextInt(6) + 1;
            int roll2 = random.nextInt(6) + 1;
            int rollSum = roll1 + roll2;
            }  if  (firstSeven != 7 && rollSum = 7){

        }
    }
}
