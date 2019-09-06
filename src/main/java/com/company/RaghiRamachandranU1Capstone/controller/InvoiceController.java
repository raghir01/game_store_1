package com.company.RaghiRamachandranU1Capstone.controller;

import com.company.RaghiRamachandranU1Capstone.service.InvoiceService;
import com.company.RaghiRamachandranU1Capstone.viewmodel.InvoiceViewModel;
import com.company.RaghiRamachandranU1Capstone.viewmodel.PurchaseViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/store")
public class InvoiceController {

    @Autowired
    private InvoiceService service;

    @PostMapping("/purchases")
    @ResponseStatus(value = HttpStatus.CREATED)
    public InvoiceViewModel purchase(@RequestBody @Valid PurchaseViewModel purchaseViewModel){
        return service.purchase(purchaseViewModel);
    }

}
