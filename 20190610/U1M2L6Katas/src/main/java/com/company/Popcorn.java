package com.company;

public class Popcorn {
    private String manufacturer;
    private String name;
    private String packageDesign;
    private int calories;
    private int size;

    public Popcorn(String manufacturer, String name, String packageDesign, int calories, int size) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.packageDesign = packageDesign;
        this.calories = calories;
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }



}
