package com.company.EHanU1Capstone.dao;

import com.company.EHanU1Capstone.model.Invoice;

import java.util.List;

public interface InvoiceDao {

    Invoice addInvoice(Invoice invoice);

    Invoice getInvoice(int id);

    List<Invoice> getAllInvoices();

    void deleteInvoice(int id);


}
