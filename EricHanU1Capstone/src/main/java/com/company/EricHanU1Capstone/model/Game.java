package com.company.EricHanU1Capstone.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Game {
    private int gameID;
    private String title;
    private String esrbRating;
    private String description;
    private BigDecimal price;
    private String studio;
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

    public void setEsrbRating(String ersb_rating) {
        this.esrbRating = ersb_rating;
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
        if (this == o || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return getGameID() == game.getGameID() &&
                title.equals(game.title) &&
                esrbRating.equals(game.esrbRating) &&
                description.equals(game.description) &&
                price.equals(game.price) &&
                studio.equals(game.studio) &&
                quantity == game.quantity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGameID(), getTitle(), getEsrbRating(), getDescription(), getPrice(), getStudio(), getQuantity());
    }
}
