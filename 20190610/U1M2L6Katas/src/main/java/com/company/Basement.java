package com.company;

public class Basement {
    private int squareFootage;
    private int length;
    private int width;
    private String floorType;
    private String boilerType;
    private boolean isFinished;

    public Basement(int squareFootage, int length, int width, String floorType, String boilerType, boolean isFinished) {
        this.squareFootage = squareFootage;
        this.length = length;
        this.width = width;
        this.floorType = floorType;
        this.boilerType = boilerType;
        this.isFinished = isFinished;
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getFloorType() {
        return floorType;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }

    public String getBoilerType() {
        return boilerType;
    }

    public void setBoilerType(String boilerType) {
        this.boilerType = boilerType;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }


}
