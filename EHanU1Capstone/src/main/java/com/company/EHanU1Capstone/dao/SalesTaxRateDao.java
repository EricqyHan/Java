package com.company.EHanU1Capstone.dao;

import com.company.EHanU1Capstone.model.SalesTaxRate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalesTaxRateDao {


    SalesTaxRate getSalesTaxRate(String state);

}
