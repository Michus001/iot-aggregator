package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.client.ApiClient;
import com.cleverlance.academy.aggregator.client.api.DefaultApi;
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
    private final DefaultApi defaultApi;

    public IdentificationController(IdentificationService identificationService, DefaultApi defaultApi, IdentificationMapper identificationMapper) {
        
        this.identificationService = identificationService;
        this.identificationMapper = identificationMapper;
        this.defaultApi = defaultApi;
        
    }

    @Override
    public ResponseEntity<List<Identification>> getIdentifications() {
        List<com.cleverlance.academy.aggregator.model.Identification> identification = this.identificationService.getIdentification();
        //this.defaultApi.getApiClient().setBasePath("https://tofu-iot-server.herokuapp.com");
        //this.defaultApi.getIdentification();
        return ResponseEntity.ok(identificationMapper.toIdentifications(identification));
    }
}
