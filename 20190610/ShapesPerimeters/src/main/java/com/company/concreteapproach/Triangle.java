package com.company.concreteapproach;

public class Triangle extends Shape{

    private double sideA;
    private double sideB;
    private double siodec;

    public Triangle(String name, String color, int xCoordinate, int yCoordinate, double sideA, double sideB, double siodec) {
        super(name, color, xCoordinate, yCoordinate);
        this.sideA = sideA;
        this.sideB = sideB;
        this.siodec = siodec;
    }


    public double area(){
        return 0;
    }

    public double perimeter() {
        return 0;
    }

}

}
