package com.company;

public class Car {

    private String make;
    private String model;
    private String type;
    private String color;
    private String engine;
    private String transmission;
    private int numDoors;
    private double mpg;
    private int milesDriven;

    public Car(String make, String model, String type, String color, String engine, String transmission, int numDoors, double mpg, int milesDriven){
        this.make = make;
        this.model = model;
        this.type = type;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
        this.numDoors = numDoors;
        this.mpg = mpg;
        this.milesDriven = milesDriven;
    }

    //getters
    public String getMake(){
        return make;
    }

    //setters
    public void setMake(String make){
        this.make = make;
    }

    //getters
    public String getModel(){
        return model;
    }

    //setters
    public void setModel(String model){
        this.model = model;
    }

    //getters
    public String getType(){
        return type;
    }

    //setters
    public void setType(String type){
        this.type = type;
    }

    //getters
    public String getColor(){
        return color;
    }

    //setters
    public void setColor(String color){
        this.color = color;
    }

    //getters
    public String getEngine(){
        return engine;
    }

    //setters
    public void setEngine(String engine){
        this.engine = engine;
    }

    //getters
    public String getTransmission(){
        return transmission;
    }

    //setters
    public void setTransmission(String transmission){
        this.transmission = transmission;
    }

    //getters
    public int getNumDoors(){
        return numDoors;
    }

    //setters
    public void setNumDoors(int numDoors){
        this.numDoors = numDoors;
    }

    //getters
    public double getMpg(){
        return mpg;
    }

    //setters
    public void setMpg(double mpg){
        this.mpg = mpg;
    }

    //getters
    public int getMilesDriven(){
        return milesDriven;
    }

    //setters
    public void setMilesDriven(int milesDriven){
        this.milesDriven = milesDriven;
    }

    // methods
    public void manufacture() {

    }


}
