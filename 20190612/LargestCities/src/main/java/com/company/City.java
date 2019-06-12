package com.company;

public class City { // 1. Create a class called city
    private String name; //1. with the following properties a. name
    private int population; //1. with the following properties b. population

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
