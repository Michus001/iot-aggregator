package com.cleverlance.academy.aggregator.controller;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import com.cleverlance.academy.aggregator.sevice.PersonService;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class AggregatorController {
    
    private final List<Identification> identifications = new ArrayList<>();
    
    private final PersonService personService;

    public AggregatorController(PersonService personService) {
        this.personService = personService;
    }
    
    
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
    
    @PostMapping("/person")
    public ResponseEntity<Void> savePerson(@RequestBody Person person) {
        
        this.personService.save(person);
        
        return ResponseEntity.ok().build();
    }
    
}
