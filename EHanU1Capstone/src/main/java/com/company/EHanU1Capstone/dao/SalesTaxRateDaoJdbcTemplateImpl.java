package com.company.EHanU1Capstone.dao;

import com.company.EHanU1Capstone.model.SalesTaxRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class SalesTaxRateDaoJdbcTemplateImpl implements SalesTaxRateDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String GET_SALESTAXRATED_SQL =
            "select * from sales_tax_rate where state = ?";

    @Autowired
    public SalesTaxRateDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public SalesTaxRate getSalesTaxRate(String state) {
        try {
            return jdbcTemplate.queryForObject(GET_SALESTAXRATED_SQL, this::mapRowToSalesTaxRate, state);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    private SalesTaxRate mapRowToSalesTaxRate(ResultSet rs, int rowNum) throws SQLException {
        SalesTaxRate salesTaxRate = new SalesTaxRate();
        salesTaxRate.setState(rs.getString("state"));
        salesTaxRate.setRate(rs.getBigDecimal("rate"));

        return salesTaxRate;
    }
}
