package com.company.EHanU1Capstone.dao;

import com.company.EHanU1Capstone.model.ProcessingFee;
import org.apache.tomcat.jni.Proc;
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
public class ProcessingFeeDaoJdbcTemplateImplTest {

    @Autowired
    ProcessingFeeDao processingFeeDao;

    @Test
    public void getProcessingFee() {
        ProcessingFee processingFee = processingFeeDao.getProcessingFee("Console");

        ProcessingFee consoleFee = new ProcessingFee();
        consoleFee.setProductType("Console");
        consoleFee.setFee(new BigDecimal("14.99"));

        assertEquals(consoleFee, processingFee);
    }
}