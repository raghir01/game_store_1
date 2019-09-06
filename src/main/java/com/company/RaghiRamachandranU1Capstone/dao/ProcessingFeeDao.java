package com.company.RaghiRamachandranU1Capstone.dao;

import com.company.RaghiRamachandranU1Capstone.model.ProcessingFee;

public interface ProcessingFeeDao {

    ProcessingFee getProcessingFeeByItemType(String itemType);
}
