package com.company;

public class App {

    // note use of index in place of i b/c of Bill's suggestion to learn to think that way

    public static int total(int[] arr) {
        int sum = 0;
        for (int index : arr) {
            sum = sum + index;
        }
        return sum;
    }

    public static int totalOdd(int[] arr) {
        int sum = arr[1]; // start at index of 1 since 1 is odd and we are going by index and not number "value"
        for (int index = 3; index < arr.length; index += 2) { // we will continue from the 3rd index
            if (index % 2 != 0) { // index / 2 remainder is not equal to 0
                sum += arr[index];
            }
        }
        return sum;
    }


    public static int totalEven(int[] arr) {
        int sum = arr[0]; // Start at index of 0 since 0 is even and we are going by index of
        for (int index = 2; index < arr.length; index += 2) { // we will continue from the 2 index since it is even
            if (index % 2 == 0) { // index /2 remainder is even
                sum += arr[index];
            }
        }
        return sum;
    }

    public static int secondLargestNumber(int[] arr) {
        int large = arr[0]; // largest number is at an index of 0
        int secondLarge = arr[1]; // second largest number is at array of 1
        if (large < secondLarge) { // if the largest is less than the second largest ...
            large = arr[1]; // we swap places and now it is the second largest
            secondLarge = arr[0]; // after swapping places it is now the largest
        }
        for (int i = 2; i < arr.length; i++) { //starting at second index since first two were settled
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            } else if (arr[i] > secondLarge) {
                secondLarge = arr[i];        // loop for checking one by one
            }
        }
        return secondLarge;
    }

    public static String[] swapFirstAndLast(String[] arr) {
        String first = arr[arr.length - 1]; // last character in array (so it is last spot -1 ... becuase of 0 in arrays)
        String last = arr[0]; // becomes first in array
        arr[0] = first;
        arr[arr.length - 1] = last;
        return arr;
    }

//    public static int[] reverse(int[] arr) {
//
//    }


//    public static String[] concatenateString(String arr){
//    String stringArrays = " ";
//    for (String concatenateString: stringArrays) {  // read as for each concatenateString in arr;
//    stringArrays = concatenateString + arr;
//    }
//    return stringArrays;
//    }


    public static int[] everyThird(int[] arr) {
        if (arr.length < 3) { // if array is less than 3 return null
            return null;
        } // note that if arr.length is less than 3, cannot even complete
        int counter = 0;
        int[] newArray = new int[arr.length /3];
        for (int i = 2; i < arr.length; i += 3) {
            newArray[counter] = arr[i];
            counter++;
        }
        return newArray;
    }


//    public static int[] lessThanFive(int[] arr) {
//        int sum = 0;
//        for (element : arr) {
//            System.out.println();
//        }
//    }

}


