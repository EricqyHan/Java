package com.company.EHanU1Capstone.controller;

import com.company.EHanU1Capstone.service.ServiceLayer;
import com.company.EHanU1Capstone.viewmodel.InvoiceViewModel;
import com.company.EHanU1Capstone.viewmodel.PurchasingViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping
public class InvoiceController {

    @Autowired
    ServiceLayer serviceLayer;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public InvoiceViewModel createInvoice(@RequestBody @Valid PurchasingViewModel invoice) {
        return serviceLayer.saveInvoice(invoice);
    }
}
