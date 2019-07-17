package com.company.EHanU1Capstone.model;

import java.math.BigDecimal;
import java.util.Objects;

public class TShirt {
    private int tShirtID;
    private String size;
    private String color;
    private String description;
    private BigDecimal price;
    private int quantity;

    public int gettShirtID() {
        return tShirtID;
    }

    public void settShirtID(int tShirtID) {
        this.tShirtID = tShirtID;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TShirt tShirt = (TShirt) o;
        return tShirtID == tShirt.tShirtID &&
                quantity == tShirt.quantity &&
                size.equals(tShirt.size) &&
                color.equals(tShirt.color) &&
                description.equals(tShirt.description) &&
                price.equals(tShirt.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tShirtID, size, color, description, price, quantity);
    }
}
