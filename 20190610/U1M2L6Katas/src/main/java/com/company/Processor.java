package com.company;

public class Processor {
    private String manufacturer;
    private String model;
    private String processorType;
    private int cores;
    private int threads;


    public Processor(String manufacturer, String model, String processorType, int cores, int threads) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.processorType = processorType;
        this.cores = cores;
        this.threads = threads;
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

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }


}
