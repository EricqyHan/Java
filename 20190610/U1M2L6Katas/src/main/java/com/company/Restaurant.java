package com.company;

public class Restaurant {

    private String name;
    private String kindOfFood;
    private int entrances;
    private int exits;
    private boolean isFranchise;

    public Restaurant(String name, String kindOfFood, int entrances, int exits, boolean isFranchise) {
        this.name = name;
        this.kindOfFood = kindOfFood;
        this.entrances = entrances;
        this.exits = exits;
        this.isFranchise = isFranchise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindOfFood() {
        return kindOfFood;
    }

    public void setKindOfFood(String kindOfFood) {
        this.kindOfFood = kindOfFood;
    }

    public int getEntrances() {
        return entrances;
    }

    public void setEntrances(int entrances) {
        this.entrances = entrances;
    }

    public int getExits() {
        return exits;
    }

    public void setExits(int exits) {
        this.exits = exits;
    }

    public boolean isFranchise() {
        return isFranchise;
    }

    public void setFranchise(boolean franchise) {
        isFranchise = franchise;
    }


}
