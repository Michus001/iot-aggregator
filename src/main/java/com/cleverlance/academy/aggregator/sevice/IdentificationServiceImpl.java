package com.cleverlance.academy.aggregator.sevice;

import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.repository.IdentificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentificationServiceImpl implements IdentificationService {
    
    private final IdentificationRepository identificationRepository;

    public IdentificationServiceImpl(IdentificationRepository identificationRepository) {
        
        this.identificationRepository = identificationRepository;
    }

    @Override
    public Identification getIdentification() {
        return this.identificationRepository.getIdentification();
    }
}
