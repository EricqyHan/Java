package com.company.EHanU1Capstone.dao;


import com.company.EHanU1Capstone.model.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class InvoiceDaoJdbcTemplateImpl implements InvoiceDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String ADD_INVOICE_SQL =
            "insert into invoice (name, city, state, zipcode, itemType, itemID, unitPrice, " +
                    "quantity, subtotal, tax, processingFee, total) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    private static final String GET_INVOICE_SQL =
            "select * from invoice where invoice_id = ?";

    private static final String SELECT_ALL_INVOCIES_SQL =
            "select * from invoices";

    private static final String UPDATE_INVOICE_SQL =
            "update invocie set name = ?, city = ?, state = ?, zipcode = ?, itemType = ?, itemID = ?, unitPrice = ?, " +
                    "quantity = ?, subtotal = ?, tax = ?, processingFee = ?, total = ?) where invoice_id = ?";

    private static final String DELETE_INVOICE_SQL =
            "delete from game where game_id = ?";

    @Autowired
    public InvoiceDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Invoice addInvoice(Invoice invoice) {
        jdbcTemplate.update(
                UPDATE_INVOICE_SQL,
                invoice.getName(),
                invoice.getStreet(),
                invoice.getCity(),
                invoice.getStreet(),
                invoice.getZipcode(),
                invoice.getItemType(),
                invoice.getItemID(),
                invoice.getUnitPrice(),
                invoice.getQuantity(),
                invoice.getSubtotal(),
                invoice.getTax(),
                invoice.getProcessingFee(),
                invoice.getTotal());

                int id = jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class);

                invoice.setItemID(id);
                return invoice;
    }

    @Override
    public Invoice getInvoice(int id) {
        try {
            return jdbcTemplate.queryForObject(SELECT_ALL_INVOCIES_SQL, this::mapRowToInvoice, id);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public List<Invoice> getAllInvoices() {
        return jdbcTemplate.query(SELECT_ALL_INVOCIES_SQL, this::mapRowToInvoice);
    }


    @Override
    public void deleteInvoice(int id) {
        jdbcTemplate.update(DELETE_INVOICE_SQL, id);
    }




    private Invoice mapRowToInvoice(ResultSet rs, int rowNum) throws SQLException {
        Invoice invoice = new Invoice();
        invoice.setName(rs.getString("name"));
        invoice.setCity(rs.getString("city"));
        invoice.setState(rs.getString("state"));
        invoice.setZipcode(rs.getString("zipcode"));
        invoice.setItemID(rs.getInt("item_id"));
        invoice.setUnitPrice(rs.getBigDecimal("Unit Price"));
        invoice.setQuantity(rs.getInt("quantity"));
        invoice.setSubtotal(rs.getBigDecimal("subtotal"));
        invoice.setTax(rs.getBigDecimal("tax"));
        invoice.setProcessingFee(rs.getBigDecimal("processing_fee"));
        invoice.setTotal(rs.getBigDecimal("total"));

        return invoice;

    }


}
