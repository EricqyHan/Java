package com.company.EHanU1Capstone.dao;

import com.company.EHanU1Capstone.model.ProcessingFee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProcessingFeeDaoJdbcTemplateImpl implements ProcessingFeeDao {

    private JdbcTemplate jdbcTemplate;

    private static final String GET_PROCESSINGFEE_SQL =
            "select * from processing_fee where product_type = ?";


    @Autowired
    public ProcessingFeeDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public ProcessingFee getProcessingFee(String productType) {
        try {
            return jdbcTemplate.queryForObject(GET_PROCESSINGFEE_SQL, this::mapRowToProcessingFee , productType);
        } catch (EmptyResultDataAccessException e) {
            // if there is no match for this console return null
            return null;
        }
    }


    private ProcessingFee mapRowToProcessingFee(ResultSet rs, int rowNum) throws SQLException {
        ProcessingFee processingFee = new ProcessingFee();
        processingFee.setProductType(rs.getString("product_type"));
        processingFee.setFee(rs.getBigDecimal("fee"));

        return processingFee;
    }

}
