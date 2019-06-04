package com.company;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int[] arr = getArrayInput();

        System.out.println("Sum of numbers is " + total(arr));

        //System.out.print("Arrays reverse is " + reverse(arr));
        //System.out.println("Arrays reverse is " + concatString(arr));

    }

    //[] will return an array in a method
    public static int[] getArrayInput() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter number of inputs : ");
        int arraySize = Integer.parseInt(myScanner.nextLine());

        int[] arrayInput = new int[arraySize];

        for (int i = 0; i < arrayInput.length; i++) {
            System.out.println("Enter your number : (" + (i + 1) + ")");
            arrayInput[i] = Integer.parseInt(myScanner.nextLine());
        }
        return arrayInput;
    }



    // total is good
    public static int total(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
    }


    // odd is still in progress
    public static int totalOdd(int[] arr) {
        int sum = arr[1]; // we are setting it to first number in array
        // ex: int[]arr = [1,7, 8,2, 15,14]
        // sum starts at 1 now because we are doing odd indexes
        for (int i = 3; i < arr.length; i += 2) {
            if (i % 2 != 0) {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int totalEven(int[] arr) {
        int sum = arr[0];
        for (int i = 2; i < arr.length; i += 2) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        return sum;
    }


    public static int secondLargestNumber(int[] arr) {
        int biggest = arr[0];
        int secondBiggest = arr[1];
        if (biggest < secondBiggest) {
            biggest = arr[1];
            secondBiggest = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > biggest) {
                secondBiggest = biggest;
                biggest = arr[i];
            } else if (arr[i] > secondBiggest) {
                secondBiggest = arr[i];
            }
        }
        return secondBiggest;
    }


    public static String[] swapFirstAndLast(String[] arr){
        String first = arr[arr.length - 1]; // last character in array (so it last spot minus 1)
        String  last = arr[0]; // become first in array
        arr[0] = first;
        arr[arr.length-1] = last;
        return arr;
    }

    public static int[] reverse(int[] arr){
        for (int index = 0; index < arr.length /2; index++){
            int j = arr[arr.length -1 -index];

            int k = arr[index];
            arr[index] = j;
            arr[arr.length - 1 - index] = k;
        }
        return arr;
    }


    public static String[] concatensateStrings(String[] arr) {
        String concat = arr[0];
        for (String i = 0; )
    }


    public static int[] everyThird(int[] arr) {
        if (arr.length < 3) {
            return null;
        } // if arr.length is less than 3, cannot even complete and dont forget edge cases
        int counter = 0;
        int[] newArray = new int[arr.length / 3];
        for (int i = 2; i < arr.length; i += 3) {
            newArray[counter] = arr[i];
            counter++;
        }
        return newArray;
    }


//    public static int reverse(int[] arr){
//        int reversed = 0;
//
//        for(int i = arr.length-1; i >= 0; i--) {
//            System.out.print(arr[i] + "");
//        }
//        return reversed;
//    }

    //Create a method called concatenateString which takes in an array of strings and returns a String which consists of the
    //concatenation of all elements in the array. Your code should work for an array of any size.




}
