package com.cleverlance.academy.aggregator.sevice;

import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.repository.IdentificationRepository;
import com.cleverlance.academy.aggregator.repository.JpaIdentificationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentificationServiceImpl implements IdentificationService {
    
    private final JpaIdentificationRepository identificationRepository;

    public IdentificationServiceImpl(JpaIdentificationRepository identificationRepository) {
        
        this.identificationRepository = identificationRepository;
    }

    @Override
    public List<Identification> getIdentification() {
        return this.identificationRepository.findAll();
    }

    @Override
    public void saveIdentification(Identification identification) {
        this.identificationRepository.saveAndFlush(identification);
    }
}
