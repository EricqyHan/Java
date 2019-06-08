package com.company;

import java.util.Arrays;

public class ArrayFun5Words {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", " Mazda"};

//        for (i - 0; i < cars.length; i ++){
//            System.out.println(cars[i] + ", ");
//        }

        for (String i : cars){
            System.out.print(i + ", ");
        }
    }
}
