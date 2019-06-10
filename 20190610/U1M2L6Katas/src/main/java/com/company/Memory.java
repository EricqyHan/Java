package com.company;

public class Memory {
    private String manufacturer;
    private String model;
    private int speed;

    public Memory(String manufacturer, String model, int speed) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.speed = speed;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }




}
