package com.cleverlance.academy.aggregator.sevice;

import com.cleverlance.academy.aggregator.model.Identification;
import java.util.List;
import org.springframework.cache.annotation.Cacheable;

public interface IdentificationService {


    List<Identification> getIdentification();
    
    void saveIdentification(Identification identification);
}
