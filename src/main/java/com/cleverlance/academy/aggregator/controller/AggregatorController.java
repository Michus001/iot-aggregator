package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class AggregatorController {
    
    private final List<Identification> identifications = new ArrayList<>();
    
    @PostMapping("/server")
    public ResponseEntity<Void> saveServer(@RequestBody Identification identification) {
        log.info("Server identification: {}", identification);
        
        this.identifications.add(identification);
        
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/server")
    public ResponseEntity<List<Identification>> getIdentifications() {
        
        return ResponseEntity.ok(this.identifications);
    }
    
}
