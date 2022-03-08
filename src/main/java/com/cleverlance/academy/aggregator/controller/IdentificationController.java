package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.controller.mapper.IdentificationMapper;
import com.cleverlance.academy.aggregator.sevice.IdentificationService;
import java.util.List;
import javax.validation.Valid;
import org.openapitools.api.IdentificationApi;
import org.openapitools.model.Address;
import org.openapitools.model.Identification;
import org.openapitools.model.Owner;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentificationController implements IdentificationApi {
    @Override
    public ResponseEntity<Void> saveIdentification(@Valid Identification identification) {
        this.identificationService.saveIdentification(identificationMapper.toIdentification(identification));
        return ResponseEntity.ok().build();
    }

    private final IdentificationService identificationService;
    private final IdentificationMapper identificationMapper;

    public IdentificationController(IdentificationService identificationService, IdentificationMapper identificationMapper) {
        
        this.identificationService = identificationService;
        this.identificationMapper = identificationMapper;
        
    }

    @Override
    public ResponseEntity<List<Identification>> getIdentifications() {
        List<com.cleverlance.academy.aggregator.model.Identification> identification = this.identificationService.getIdentification();
        
        return ResponseEntity.ok(identificationMapper.toIdentifications(identification));
    }
}
