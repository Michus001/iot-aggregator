package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.controller.mapper.IdentificationMapper;
import com.cleverlance.academy.aggregator.sevice.IdentificationService;
import org.openapitools.api.IdentificationApi;
import org.openapitools.model.Address;
import org.openapitools.model.Identification;
import org.openapitools.model.Owner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentificationController implements IdentificationApi {

    private final IdentificationService identificationService;
    private final IdentificationMapper identificationMapper;

    public IdentificationController(IdentificationService identificationService, IdentificationMapper identificationMapper) {
        
        this.identificationService = identificationService;
        this.identificationMapper = identificationMapper;
        
    }

    @Override
    public ResponseEntity<Identification> getIdentification() {
        com.cleverlance.academy.aggregator.model.Identification identification = this.identificationService.getIdentification();
        
        return ResponseEntity.ok(identificationMapper.toIdentification(identification));
    }
}
