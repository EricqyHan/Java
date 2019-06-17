package com.company;

public class ObjectMain {
    public static void main(String[] args) {
        CalculatorObject calculations = new CalculatorObject();

        System.out.println("Example One - Add Method (1+1) = " + calculations.add(1,1));
        System.out.println("Example Two - Subtract Method (23-52) = " + calculations.subtract(23,52));
        System.out.println("Example Three - Multiplication Method (34*2) = " + calculations.multiply(34,2));
        System.out.println("Example Four - Division Method (12/3) = " + calculations.divide(12,3));
        System.out.println("Example Five - Division Method (12/7) = " + calculations.divide(12,7));
        System.out.println("Example Six - Addition Method With Double Data Type (3.4 + 2.3) = " + calculations.addDouble(3.4,2.3));
        System.out.println("Example Seven - Multiplication Method With Double Data Type (6.7*4.4) = " + calculations.multiplyDouble(6.7,4.4));
        System.out.println ("Example Eight - Subtraction Method With Double Data Type: (5.5-0.5) = " + calculations.subtractDouble(5.5,0.5));
        System.out.println("Example Nine - Division Method With Double Data Type: (10.8/2.2) = " + calculations.divideDouble(10.8,2.2));



    }
}
