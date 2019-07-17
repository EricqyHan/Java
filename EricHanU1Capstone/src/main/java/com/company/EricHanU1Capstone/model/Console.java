package com.company.EricHanU1Capstone.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Console {
    private int consoleID;
    private String model;
    private String manufacturer;
    private String memoryAmount;
    private String processor;
    private BigDecimal price;
    private int quantity;

    public int getConsoleID() {
        return consoleID;
    }

    public void setConsoleID(int consoleID) {
        this.consoleID = consoleID;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getMemoryAmount() {
        return memoryAmount;
    }

    public void setMemoryAmount(String memoryAmount) {
        this.memoryAmount = memoryAmount;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o ) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Console console = (Console) o;
        return  consoleID == console.consoleID &&
                model.equals(console.model) &&
                manufacturer.equals(console.manufacturer) &&
                memoryAmount.equals(console.memoryAmount) &&
                processor.equals(console.processor) &&
                price.equals(console.price) &&
                quantity == (console.quantity);
    }


    @Override
    public int hashCode(){
        return Objects.hash(consoleID, model, manufacturer, memoryAmount, processor, price, quantity);
    }

}
