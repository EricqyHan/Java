package com.company;

public class Bathroom {
    private int squareFootage;
    private int length;
    private int width;
    private String floorType;
    private String toiletType;
    private String sinkType;
    private String showerType;

    public Bathroom(int squareFootage, int length, int width, String floorType, String toiletType, String sinkType, String showerType) {
        this.squareFootage = squareFootage;
        this.length = length;
        this.width = width;
        this.floorType = floorType;
        this.toiletType = toiletType;
        this.sinkType = sinkType;
        this.showerType = showerType;
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

    public String getToiletType() {
        return toiletType;
    }

    public void setToiletType(String toiletType) {
        this.toiletType = toiletType;
    }

    public String getSinkType() {
        return sinkType;
    }

    public void setSinkType(String sinkType) {
        this.sinkType = sinkType;
    }

    public String getShowerType() {
        return showerType;
    }

    public void setShowerType(String showerType) {
        this.showerType = showerType;
    }

}
