package com.company;

public class Bedroom {
    private int squareFootage;
    private int length;
    private int width;
    private String floorType;
    private String bedBrand;
    private boolean hasOffice;

    public Bedroom(int squareFootage, int length, int width, String floorType, String bedBrand, boolean hasOffice, boolean hasBlackOutBlinds) {
        this.squareFootage = squareFootage;
        this.length = length;
        this.width = width;
        this.floorType = floorType;
        this.bedBrand = bedBrand;
        this.hasOffice = hasOffice;
        this.hasBlackOutBlinds = hasBlackOutBlinds;
    }

    private boolean hasBlackOutBlinds;


    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getLenght() {
        return length;
    }

    public void setLenght(int lenght) {
        this.length = lenght;
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

    public String getBedBrand() {
        return bedBrand;
    }

    public void setBedBrand(String bedBrand) {
        this.bedBrand = bedBrand;
    }

    public boolean isHasOffice() {
        return hasOffice;
    }

    public void setHasOffice(boolean hasOffice) {
        this.hasOffice = hasOffice;
    }

    public boolean isHasBlackOutBlinds() {
        return hasBlackOutBlinds;
    }

    public void setHasBlackOutBlinds(boolean hasBlackOutBlinds) {
        this.hasBlackOutBlinds = hasBlackOutBlinds;
    }


}