package com.company;

public class ArrayFunReverseIt {
    public static void main(String[] args) {
        int[] numberArray1 = {1, 2, 3, 4, 5};

        int[] reversedArray2 = new int[numberArray1.length];
        for(int i = 0; i < numberArray1.length; i++){
            reversedArray2[i] = numberArray1[numberArray1.length-(i+1)];
        }


        // printing out numArray1
        System.out.println("Original Array.");
        for (int num1 : numberArray1){
           System.out.printf(" " + num1);
        }


        System.out.printf(" %n");
        System.out.println("Original Array Reversed.");

        for (int num2 : reversedArray2){
            System.out.printf(" " +  num2);
        }
    }
}

//    public static int[] reverse(int[] numbers) {
//
//        int[] reversed = new int[numbers.length];//
//        for(int i = 0; i < numbers.length; i++) {
//            // length - (i + 1) is the n-th to last element
//            // so when i = 0, it would be the last element
//            // when i = 3, it would be the fourth to last element since i=3 is the 4th element, etc
//            reversed[i] = numbers[ numbers.length - (i + 1) ];
//        }
//
//        return reversed;
//    }