package com.cleverlance.academy.aggregator.repository;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class IdentificationRepositoryImpl implements IdentificationRepository {
    
    private final List<Identification> identifications = new ArrayList<>();
    
    @Override
    public List<Identification> getIdentification() {
        return this.identifications;
    }

    @Override
    public void saveIdentification(Identification identification) {
        this.identifications.add(identification);
    }

}
