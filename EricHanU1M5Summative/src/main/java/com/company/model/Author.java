package com.company.model;

import java.util.Objects;

public class Author {
    private int author_id;
    private String firstName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String phone;
    private String email;

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return getAuthor_id() == author.getAuthor_id() &&
                getFirstName() == author.getFirstName() &&
                getLastName() == author.getLastName() &&
                getStreet() == author.getStreet() &&
                getCity() == author.getCity() &&
                getState() == author.getState() &&
                getPostalCode() == author.getPostalCode() &&
                getPhone() == author.getPhone() &&
                getEmail() == author.getEmail();

    }

    @Override
    public int hashCode() {
        return Objects.hash(getAuthor_id(), getFirstName(), getLastName(), getStreet(), getCity(), getState(), getPostalCode(),getPhone(), getEmail());
    }
}
