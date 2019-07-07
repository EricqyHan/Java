package com.company.model;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private int bookId;
    private int isbn;
    private LocalDate publish_date;
    private int authorId;
    private String title;
    private int publisherId;
    private double price;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public LocalDate getPublish_date() {
        return publish_date;
    }

    public void setPublish_date(LocalDate publish_date) {
        this.publish_date = publish_date;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o || getClass() != o.getClass()) return false;
        Book that = (Book) o;
        return getBookId() == that.getBookId() &&
                Objects.equals(getIsbn(), that.getIsbn()) &&
                Objects.equals(getPublish_date(), that.getPublish_date()) &&
                Objects.equals(getAuthorId(), that.getAuthorId()) &&
                Objects.equals(getTitle(), that.getTitle()) &&
                Objects.equals(getPublisherId(), that.getPublisherId()) &&
                Objects.equals(getPublisherId(), that.getPrice());
}

    @Override
    public int hashCode() {
        return Objects.hash(getBookId(), getIsbn(), getPublish_date(), getAuthorId(), getTitle(), getPublisherId(), getPrice());

    }

    public void setPublish_date(Date publish_date) {
    }
}

