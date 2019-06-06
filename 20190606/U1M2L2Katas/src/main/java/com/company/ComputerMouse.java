package com.company;

public class ComputerMouse {

    private String manufacturer;
    private String model;
    private int xPosition;
    private int yPosition;
    private int lastClicked;


    public ComputerMouse(String manufacturer, String model, int xPosition, int yPosition, int lastClickec){
        this.manufacturer = manufacturer;
        this.model = model;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.lastClicked = lastClickec;
    }

    //getters
    public String getManufacturer(){
        return manufacturer;
    }

    //setters
    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
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
    public int getxPosition(){
        return xPosition;
    }

    public void setxPosition(int xPosition){
        this.xPosition = xPosition;
    }

    //getters
    public int getyPosition(){
        return yPosition;
    }

    public void setyPosition(int yPosition){
        this.yPosition = yPosition;
    }





}
