package com.company.EHanU1Capstone.viewmodel;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Objects;

public class InvoiceViewModel {
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
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        InvoiceViewModel invoice = (InvoiceViewModel) o;
        return getInvoiceID() == invoice.getInvoiceID() &&
                Objects.equals(getName(),invoice.getName()) &&
                Objects.equals(getStreet(),invoice.getStreet()) &&
                Objects.equals(getCity(),invoice.getCity()) &&
                Objects.equals(getState(),invoice.getState()) &&
                Objects.equals(getZipcode(),invoice.getZipcode()) &&
                Objects.equals(getItemType(),invoice.getItemType()) &&
                Objects.equals(getItemID(),invoice.getItemID()) &&
                Objects.equals(getUnitPrice(),invoice.getUnitPrice()) &&
                Objects.equals(getQuantity(),invoice.getQuantity()) &&
                Objects.equals(getSubtotal(),invoice.getSubtotal()) &&
                Objects.equals(getTax(),invoice.getTax()) &&
                Objects.equals(getProcessingFee(),invoice.getProcessingFee()) &&
                Objects.equals(getTotal(),invoice.getTotal());
    }


    @Override
    public int hashCode() {
        return Objects.hash(invoiceID, name, street, city, state, zipcode, itemType, itemID, unitPrice, quantity, subtotal, tax, processingFee, total);
    }
}
