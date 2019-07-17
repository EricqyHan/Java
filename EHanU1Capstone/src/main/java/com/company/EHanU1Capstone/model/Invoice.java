package com.company.EHanU1Capstone.model;

import java.math.BigDecimal;
import java.util.Objects;

public class Invoice {
    private int invoiceID;
    private String name;
    private String street;
    private String city;
    private String state;
    private String zipcode;
    private String itemType;
    private int itemID;
    private BigDecimal unitPrice;
    private int quantity;
    private BigDecimal subtotal;
    private BigDecimal tax;
    private BigDecimal processingFee;
    private BigDecimal total;

    public int getInvoiceID() {
        return invoiceID;
    }

    public void setInvoiceID(int invoiceID) {
        this.invoiceID = invoiceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    public BigDecimal getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(BigDecimal processingFee) {
        this.processingFee = processingFee;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return invoiceID == invoice.invoiceID &&
                itemID == invoice.itemID &&
                quantity == invoice.quantity &&
                Objects.equals(name, invoice.name) &&
                Objects.equals(city, invoice.city) &&
                Objects.equals(state, invoice.state) &&
                Objects.equals(zipcode, invoice.zipcode) &&
                Objects.equals(itemType, invoice.itemType) &&
                Objects.equals(unitPrice, invoice.unitPrice) &&
                Objects.equals(subtotal, invoice.subtotal) &&
                Objects.equals(tax, invoice.tax) &&
                Objects.equals(processingFee, invoice.processingFee) &&
                Objects.equals(total, invoice.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceID, name, city, state, zipcode, itemType, itemID, unitPrice, quantity, subtotal, tax, processingFee, total);
    }
}
