package com.company.RaghiRamachandranU1Capstone.dao;

import com.company.RaghiRamachandranU1Capstone.model.Invoice;

import java.util.List;

public interface InvoiceDao {

    Invoice addInvoice(Invoice invoice);

    List<Invoice> getAllInvoices();

    void deleteInvoice(int invoiceId);
}
