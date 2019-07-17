package com.company.EHanU1Capstone.viewmodel;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Objects;

public class InvoiceViewModel {
    private int invoiceID;
    @NotEmpty(message = "Please supply a value for name")
    private String name;
    @NotEmpty(message = "Please supply a value for street")
    private String street;
    @NotEmpty(message = "Please supply a value for city")
    private String city;
    @NotEmpty(message = "Please supply a value for message")
    private String state;
    @NotEmpty(message = "Please supply a value for zipcode")
    private String zipcode;
    @NotEmpty(message = "Please supply a value for itemType")
    private String itemType;
    @NotEmpty(message = "Please supply a value for itemID")
    private int itemID;
    @NotEmpty(message = "Please supply a value for unitPrice")
    private BigDecimal unitPrice;
    @NotEmpty(message = "Please supply a value for quantity")
    private int quantity;
    @NotEmpty(message = "Please supply a value for subtotal")
    private BigDecimal subtotal;
    @NotEmpty(message = "Please supply a value for tax")
    private BigDecimal tax;
    @NotEmpty(message = "Please supply a value for processingFee")
    private BigDecimal processingFee;
    @NotEmpty(message = "Please supply a value for total")
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
        InvoiceViewModel that = (InvoiceViewModel) o;
        return invoiceID == that.invoiceID &&
                itemID == that.itemID &&
                quantity == that.quantity &&
                name.equals(that.name) &&
                street.equals(that.street) &&
                city.equals(that.city) &&
                state.equals(that.state) &&
                zipcode.equals(that.zipcode) &&
                itemType.equals(that.itemType) &&
                unitPrice.equals(that.unitPrice) &&
                subtotal.equals(that.subtotal) &&
                tax.equals(that.tax) &&
                processingFee.equals(that.processingFee) &&
                total.equals(that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceID, name, street, city, state, zipcode, itemType, itemID, unitPrice, quantity, subtotal, tax, processingFee, total);
    }
}
