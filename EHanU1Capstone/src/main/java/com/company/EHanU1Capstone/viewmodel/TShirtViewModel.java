package com.company.EHanU1Capstone.viewmodel;

import javax.validation.constraints.Negative;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Objects;

public class TShirtViewModel {

    private int tShirtID;
    @NotEmpty(message = "Please supply a value for size")
    private String size;
    @NotEmpty(message ="Please supply a value for color")
    private String color;
    @NotEmpty(message = "Please supply a value for description")
    private String description;
    @NotEmpty(message = "Please supply a value for price")
    private BigDecimal price;
    @NotEmpty(message = "Please supply a value for quantity")
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
        TShirtViewModel that = (TShirtViewModel) o;
        return tShirtID == that.tShirtID &&
                quantity == that.quantity &&
                size.equals(that.size) &&
                color.equals(that.color) &&
                description.equals(that.description) &&
                price.equals(that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tShirtID, size, color, description, price, quantity);
    }
}
