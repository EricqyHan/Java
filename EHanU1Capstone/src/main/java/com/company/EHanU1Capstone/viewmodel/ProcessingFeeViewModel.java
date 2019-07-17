package com.company.EHanU1Capstone.viewmodel;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Objects;

public class ProcessingFeeViewModel {

    @NotEmpty(message = "Please supply a value for product type")
    private String productType;
    @NotEmpty(message = "Please supply a value for fee")
    private BigDecimal fee;

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProcessingFeeViewModel that = (ProcessingFeeViewModel) o;
        return productType.equals(that.productType) &&
                fee.equals(that.fee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productType, fee);
    }
}

