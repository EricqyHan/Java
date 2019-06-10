package com.company;

public class EtcHome {
    private int bathroomNumbers;
    private int bedroomsNumbers;
    private int yardLength;
    private int yardwidth;
    private String pool;
    private String hotTub;
    private String swingSet;
    private boolean backYardKitchen;

    public EtcHome(int bathroomNumbers, int bedroomsNumbers, int yardLength, int yardwidth, String pool, String hotTub, String swingSet, boolean backYardKitchen) {
        this.bathroomNumbers = bathroomNumbers;
        this.bedroomsNumbers = bedroomsNumbers;
        this.yardLength = yardLength;
        this.yardwidth = yardwidth;
        this.pool = pool;
        this.hotTub = hotTub;
        this.swingSet = swingSet;
        this.backYardKitchen = backYardKitchen;
    }



    public int getBathroomNumbers() {
        return bathroomNumbers;
    }

    public void setBathroomNumbers(int bathroomNumbers) {
        this.bathroomNumbers = bathroomNumbers;
    }

    public int getBedroomsNumbers() {
        return bedroomsNumbers;
    }

    public void setBedroomsNumbers(int bedroomsNumbers) {
        this.bedroomsNumbers = bedroomsNumbers;
    }

    public int getYardLength() {
        return yardLength;
    }

    public void setYardLength(int yardLength) {
        this.yardLength = yardLength;
    }

    public int getYardwidth() {
        return yardwidth;
    }

    public void setYardwidth(int yardwidth) {
        this.yardwidth = yardwidth;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public String getHotTub() {
        return hotTub;
    }

    public void setHotTub(String hotTub) {
        this.hotTub = hotTub;
    }

    public String getSwingSet() {
        return swingSet;
    }

    public void setSwingSet(String swingSet) {
        this.swingSet = swingSet;
    }

    public boolean isBackYardKitchen() {
        return backYardKitchen;
    }

    public void setBackYardKitchen(boolean backYardKitchen) {
        this.backYardKitchen = backYardKitchen;
    }





}
