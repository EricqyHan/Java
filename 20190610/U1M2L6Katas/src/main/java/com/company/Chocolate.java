package com.company;

public class Chocolate {
    private String name;
    private String type;
    private String packageDesign;
    private int size;
    private boolean hasNuts;
    private boolean lowFat;

    public Chocolate(String name, String type, String packageDesign, int size, boolean hasNuts, boolean lowFat) {
        this.name = name;
        this.type = type;
        this.packageDesign = packageDesign;
        this.size = size;
        this.hasNuts = hasNuts;
        this.lowFat = lowFat;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPackageDesign() {
        return packageDesign;
    }

    public void setPackageDesign(String packageDesign) {
        this.packageDesign = packageDesign;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isHasNuts() {
        return hasNuts;
    }

    public void setHasNuts(boolean hasNuts) {
        this.hasNuts = hasNuts;
    }

    public boolean isLowFat() {
        return lowFat;
    }

    public void setLowFat(boolean lowFat) {
        this.lowFat = lowFat;
    }



}
