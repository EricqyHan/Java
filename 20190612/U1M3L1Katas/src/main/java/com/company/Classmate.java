package com.company;

public class Classmate {
    private String name;
    private String hairColor;

    public Classmate(String name, String hairColor) {
        this.name = name;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
