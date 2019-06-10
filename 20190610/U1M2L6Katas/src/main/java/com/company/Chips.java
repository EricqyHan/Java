package com.company;

public class Chips {
    private String brand;
    private String flavor;
    private String packageDesign;
    private int calories;
    private boolean glutenFree;
    private boolean lowFat;

    public Chips(String brand, String flavor, String packageDesign, int calories, boolean glutenFree, boolean lowFat) {
        this.brand = brand;
        this.flavor = flavor;
        this.packageDesign = packageDesign;
        this.calories = calories;
        this.glutenFree = glutenFree;
        this.lowFat = lowFat;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getPackageDesign() {
        return packageDesign;
    }

    public void setPackageDesign(String packageDesign) {
        this.packageDesign = packageDesign;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    public boolean isLowFat() {
        return lowFat;
    }

    public void setLowFat(boolean lowFat) {
        this.lowFat = lowFat;
    }

}
