package com.company.EHanU1Capstone.dao;

import com.company.EHanU1Capstone.model.Invoice;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InvoiceDaoJdbcTemplateImplTest {

    @Autowired
    InvoiceDao invoiceDao;

    @Before
    public void setUp() throws Exception {
        List<Invoice> Invoice = invoiceDao.getAllInvoices();
        for(Invoice i : Invoice) {
            invoiceDao.deleteInvoice(i.getInvoiceID());
       }
    }

    @Test
    public void addGetDeleteInvoice() {
        Invoice invoice = new Invoice();
        invoice.setName("Bob Treehouse");
        invoice.setStreet("123 Fake Street");
        invoice.setCity("Springfield");
        invoice.setState("New Mexico");
        invoice.setZipcode("90210");
        invoice.setItemID(222);
        invoice.setUnitPrice(new BigDecimal("222"));
        invoice.setQuantity(88);
        invoice.setSubtotal(new BigDecimal("99.99"));
        invoice.setTax(new BigDecimal("82.33"));
        invoice.setProcessingFee(new BigDecimal("44.87"));
        invoice.setTotal(new BigDecimal("94.33"));

        invoice = invoiceDao.addInvoice(invoice);

        Invoice invoice1 = invoiceDao.getInvoice(invoice.getInvoiceID());
        assertEquals(invoice1, invoice);

        invoiceDao.deleteInvoice(invoice.getInvoiceID());
        invoice1 = invoiceDao.getInvoice(invoice.getInvoiceID());
        assertNull(invoice1);
    }

    @Test
    public void getAllInvoices() {
        Invoice invoice = new Invoice();
        invoice.setName("Bob Treehouse");
        invoice.setStreet("123 Fake Street");
        invoice.setCity("Springfield");
        invoice.setState("New Mexico");
        invoice.setZipcode("90210");
        invoice.setItemID(222);
        invoice.setUnitPrice(new BigDecimal("222"));
        invoice.setQuantity(88);
        invoice.setSubtotal(new BigDecimal("99.99"));
        invoice.setTax(new BigDecimal("82.33"));
        invoice.setProcessingFee(new BigDecimal("44.87"));
        invoice.setTotal(new BigDecimal("94.33"));

        invoice = invoiceDao.addInvoice(invoice);

        invoice = new Invoice();
        invoice.setName("Perri Love");
        invoice.setStreet("99 Paper Street");
        invoice.setCity("Gotham City");
        invoice.setState("New York");
        invoice.setZipcode("99876");
        invoice.setItemID(234);
        invoice.setUnitPrice(new BigDecimal("111"));
        invoice.setQuantity(99);
        invoice.setSubtotal(new BigDecimal("91.99"));
        invoice.setTax(new BigDecimal("85.33"));
        invoice.setProcessingFee(new BigDecimal("49.87"));
        invoice.setTotal(new BigDecimal("94.33"));

        List<Invoice> invoiceList = invoiceDao.getAllInvoices();
        assertEquals(2, invoiceList);
    }



}