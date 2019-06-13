package com.company;

public class Computer {
    private String brand;
    private String model;
    private String cpu;
    private int storageSize;
    private int ram;

    public Computer(String brand, String model, String cpu, int storageSize, int ram) {
        this.brand = brand;
        this.model = model;
        this.cpu = cpu;
        this.storageSize = storageSize;
        this.ram = ram;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
