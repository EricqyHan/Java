package com.company;

public class OpticalDrive {
    private String manufacturer;
    private String modelName;
    private boolean hasBluRay;
    private int speed;


    public OpticalDrive(String manufacturer, String modelName, boolean hasBluRay, int speed) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.hasBluRay = hasBluRay;
        this.speed = speed;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public boolean isHasBluRay() {
        return hasBluRay;
    }

    public void setHasBluRay(boolean hasBluRay) {
        this.hasBluRay = hasBluRay;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
