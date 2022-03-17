package com.cleverlance.academy.aggregator.sevice;

import com.cleverlance.academy.aggregator.model.Identification;
import java.util.List;

public interface IdentificationService {
    
    List<Identification> getIdentification(Integer pageSize, Integer pageNumber);
    
    void saveIdentification(Identification identification);
}
