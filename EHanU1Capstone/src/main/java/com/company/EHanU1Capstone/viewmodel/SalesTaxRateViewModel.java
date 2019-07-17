package com.company.EHanU1Capstone.viewmodel;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Objects;

public class SalesTaxRateViewModel {
    @NotEmpty(message = "Please supply a value for state")
    private String state;

    @NotEmpty(message = "Please supply a value for rate")
    private BigDecimal rate;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SalesTaxRateViewModel that = (SalesTaxRateViewModel) o;
        return state.equals(that.state) &&
                rate.equals(that.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, rate);
    }
}
