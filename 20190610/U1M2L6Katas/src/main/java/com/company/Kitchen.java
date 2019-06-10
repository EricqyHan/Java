package com.company;

public class Kitchen {
    private int squareFootage;
    private int width;
    private int length;
    private String refrigeratorType;
    private String sinkType;
    private String floorType;
    private String stoveTopType;
    private boolean knifeRack;
    private boolean hasIsland;

    public Kitchen(int squareFootage, int width, int length, String refrigeratorType, String sinkType, String floorType, String stoveTopType, boolean knifeRack, boolean hasIsland) {
        this.squareFootage = squareFootage;
        this.width = width;
        this.length = length;
        this.refrigeratorType = refrigeratorType;
        this.sinkType = sinkType;
        this.floorType = floorType;
        this.stoveTopType = stoveTopType;
        this.knifeRack = knifeRack;
        this.hasIsland = hasIsland;
    }


    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
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

    public String getRefrigeratorType() {
        return refrigeratorType;
    }

    public void setRefrigeratorType(String refrigeratorType) {
        this.refrigeratorType = refrigeratorType;
    }

    public String getSinkType() {
        return sinkType;
    }

    public void setSinkType(String sinkType) {
        this.sinkType = sinkType;
    }

    public String getFloorType() {
        return floorType;
    }

    public void setFloorType(String floorType) {
        this.floorType = floorType;
    }

    public String getStoveTopType() {
        return stoveTopType;
    }

    public void setStoveTopType(String stoveTopType) {
        this.stoveTopType = stoveTopType;
    }

    public boolean isKnifeRack() {
        return knifeRack;
    }

    public void setKnifeRack(boolean knifeRack) {
        this.knifeRack = knifeRack;
    }

    public boolean isHasIsland() {
        return hasIsland;
    }

    public void setHasIsland(boolean hasIsland) {
        this.hasIsland = hasIsland;
    }


}
