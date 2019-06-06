package com.company;

public class TV {
    private String manufacturer;
    private String model;
    private int screenSize;
    private String channel;
    private int volume;
    private boolean powered;

    // Implement Constructor
    public TV(String manufacturer, String model, int screenSize, String channel, int volume, boolean powered) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.screenSize = screenSize;
        this.channel = channel;
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

    //getters
    public int getScreenSize(){
        return screenSize;
    }

    // setters
    public void setScreenSize(int screenSize){
        this.screenSize = screenSize;
    }

    // getters
    public String getChannel(){
        return channel;
    }

    // setters
    public void setChannel(String channel){
        this.channel = channel;
    }


    // getters
    public int getVolume(){
        return volume;
    }

    // setters
    public void setVolume(int volume){
        this.volume = volume;
    }

    // getters
    public boolean isPowered() {
        return powered;
    }

    // setters
    public void setPowered(boolean powered){
        this.powered = powered;
    }

    //method
    public void manufacturer(){
    }


}
