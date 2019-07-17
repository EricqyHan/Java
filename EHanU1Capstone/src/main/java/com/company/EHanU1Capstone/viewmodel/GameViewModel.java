package com.company.EHanU1Capstone.viewmodel;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Objects;

public class GameViewModel {
    private int gameID;

    private String title;
    @NotEmpty(message = "Please supply a value for esrbrating")
    private String esrbRating;
    @NotEmpty(message = "Please supply a value for description")
    private String description;
    @NotEmpty(message = "Please supply a value for price")
    private BigDecimal price;
    @NotEmpty(message = "Please supply a value for studio")
    private String studio;
    @NotEmpty(message = "Please supply a value for quantity")
    private int quantity;

    public int getGameID() {
        return gameID;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEsrbRating() {
        return esrbRating;
    }

    public void setEsrbRating(String esrbRating) {
        this.esrbRating = esrbRating;
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

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
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
        GameViewModel that = (GameViewModel) o;
        return gameID == that.gameID &&
                quantity == that.quantity &&
                title.equals(that.title) &&
                esrbRating.equals(that.esrbRating) &&
                description.equals(that.description) &&
                price.equals(that.price) &&
                studio.equals(that.studio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameID, title, esrbRating, description, price, studio, quantity);
    }
}
