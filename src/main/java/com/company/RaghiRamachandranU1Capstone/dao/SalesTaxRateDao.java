package com.company.RaghiRamachandranU1Capstone.dao;

import com.company.RaghiRamachandranU1Capstone.model.SalesTaxRate;

public interface SalesTaxRateDao {
    SalesTaxRate getTaxByState(String state);
}
