package com.company.EHanU1Capstone.dao;

import com.company.EHanU1Capstone.model.SalesTaxRate;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SalesTaxRateDaoJdbcTemplateImplTest {

    @Autowired
    SalesTaxRateDao salesTaxRateDao;


    @Test
    public void getSalesTaxRate() {

        SalesTaxRate salesTaxRate = salesTaxRateDao.getSalesTaxRate("AK");

        SalesTaxRate salesTaxRateAK = new SalesTaxRate();
        salesTaxRateAK.setState("AK");
        salesTaxRateAK.setRate(new BigDecimal(".06"));


        assertEquals(salesTaxRateAK, salesTaxRate );
    }

}