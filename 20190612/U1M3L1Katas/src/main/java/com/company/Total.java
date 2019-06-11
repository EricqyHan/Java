package com.company;

import java.util.ArrayList;

public class Total {

    public static void main(String[] args) {

        int [] numbers = {2, 4, 5, 3,
                7, 6, 1, 9,
                10, 13, 56, 43};

        int total = 0;

        ArrayList<Integer> numberList = new ArrayList<Integer>();


        for(int element : numbers) {
            total += element;
            numberList.add(element);
        }

        System.out.println("The sum of all elements in the array is " + total);

    }

}