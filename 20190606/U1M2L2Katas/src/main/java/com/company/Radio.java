package com.company;

public class Radio {

    private String manufacturer;
    private String model;
    private int numSpeaker;
    private String station;
    private int volume;
    private boolean powered;

    // Constructor
    public Radio(String manufacturer, String model, int numSpeakers, String station, int volume, boolean powered) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.numSpeaker = numSpeakers;
        this.station = station;
        this.volume = volume;
        this.powered = powered;
    }

    // getters
    public String getManufacturer(){
        return manufacturer;
    }

    // setters

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }

    // getters
    public String getModel(){
        return model;
    }
    // setters
    public void setModel(String model){
        this.model = model;
    }

    // getters
    public int getNumSpeakers(){
        return numSpeaker;
    }

    // Setters
    public void setNumSpeakers(int numSpeaker){
        this.numSpeaker = numSpeaker;
    }

    // getters
    public String getStation(){
        return station;
    }

    public void setStation(String station){
        this.station = station;
    }

    // getters
    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public boolean isPowered(){
        return powered;
    }

    public void setPowered(boolean powered){
        this.powered = powered;
    }


    // method
    public void manufacture(){

    }

}
