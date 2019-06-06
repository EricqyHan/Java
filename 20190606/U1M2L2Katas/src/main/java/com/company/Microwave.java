package com.company;

public class Microwave {
    private String manufacturer;
    private String model;
    private int secondsLeft;
    private String time;
    private boolean running;

    public Microwave(String manufacturer, String model, int secondsLeft, String time, boolean running){
        this.manufacturer = manufacturer;
        this.model = model;
        this.secondsLeft = secondsLeft;
        this.time = time;
        this.running = running;
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
    public int getSecondsLeft(){
        return secondsLeft;
    }

    //setters
    public void setSecondsLeft(int secondsLeft){
        this.secondsLeft = secondsLeft;
    }

    //getters
    public String getTime(){
        return time;
    }

    //setters
    public void setTime(String time){
        this.time = time;
    }

    // getters
    public boolean isRunning() {

        return running;
    }


    // Setters
    public void setRunning(boolean running) {

        this.running = running;
    }



}
