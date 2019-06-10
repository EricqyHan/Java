package com.company;

public class Patio {
    private String lightsType;
    private int width;
    private int length;
    private int squareFootage;
    private boolean hasMosquitoNet;

    public Patio(String lightsType, int width, int length, int squareFootage, boolean hasMosquitoNet) {
        this.lightsType = lightsType;
        this.width = width;
        this.length = length;
        this.squareFootage = squareFootage;
        this.hasMosquitoNet = hasMosquitoNet;
    }


    public String getLightsType() {
        return lightsType;
    }

    public void setLightsType(String lightsType) {
        this.lightsType = lightsType;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public boolean isHasMosquitoNet() {
        return hasMosquitoNet;
    }

    public void setHasMosquitoNet(boolean hasMosquitoNet) {
        this.hasMosquitoNet = hasMosquitoNet;
    }



}
