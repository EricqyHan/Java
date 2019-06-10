package com.company;

public class SodaPop {

    private String manufacturer;
    private String flavor;
    private int calories;
    private boolean isDiet;

    public SodaPop(String manufacturer, String flavor, int calories, boolean isDiet) {
        this.manufacturer = manufacturer;
        this.flavor = flavor;
        this.calories = calories;
        this.isDiet = isDiet;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isDiet() {
        return isDiet;
    }

    public void setDiet(boolean diet) {
        isDiet = diet;
    }


}
