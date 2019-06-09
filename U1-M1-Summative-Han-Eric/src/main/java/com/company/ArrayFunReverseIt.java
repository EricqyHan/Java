package com.company;

public class ArrayFunReverseIt {


    public static int[] reverse(int[] numbers) {

        int[] reversed = new int[numbers.length];

        for(int i = 0; i < numbers.length; i++) {

            // length - (i + 1) is the n-th to last element
            // so when i = 0, it would be the last element
            // when i = 3, it would be the fourth to last element since i=3 is the 4th element, etc
            reversed[i] = numbers[ numbers.length - (i + 1) ];
        }

        return reversed;
    }
}
