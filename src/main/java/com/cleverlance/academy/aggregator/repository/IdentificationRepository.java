package com.cleverlance.academy.aggregator.repository;

import com.cleverlance.academy.aggregator.model.Identification;
import java.util.List;

public interface IdentificationRepository {
    List<Identification> getIdentification();
    
    void saveIdentification(Identification identification);
}
