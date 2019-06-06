package com.company;

public class CoffeeMaker {

    private String manufacturer;
    private String model;
    private int carafeSize;
    private int cupsLeft;
    private boolean powered;


    public CoffeeMaker(String manufacturer, String model, int carafeSize, int cupsLeft, boolean powered) {
        this.manufacturer= manufacturer;
        this.model = model;
        this.carafeSize = carafeSize;
        this.cupsLeft = cupsLeft;
        this.powered = powered;
    }

    //getters
    public String getManufacturer() {

        return manufacturer;
    }

    // Setters
    public void setManufacturer(String manufacturer){

        this.manufacturer = manufacturer;
    }

    // getters
    public String getModel(){
        return model;
    }

    // Setters
    public void setModel(){

        this.model = model;
    }

    // getters
    public int getCupsLeft(){
        return cupsLeft;
    }

    // Setters
    public void setCupsLeft(){
        this.cupsLeft = cupsLeft;
    }

    //getters
    public int getCarafeSize(){
        return carafeSize;
    }


    // Setters
    public void setCarafeSize(){

        this.carafeSize = carafeSize;
    }

    // getters
    public boolean isPowered() {

        return powered;
    }


    // Setters
    public void setPowered(boolean powered) {

        this.powered = powered;
    }

    //methods
    public void brew() {
    }

    public void pourCoffee(int numCups) {
    }


}
