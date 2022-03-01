package com.cleverlance.academy.aggregator.sevice;

import com.cleverlance.academy.aggregator.model.Person;
import javax.validation.Valid;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Service
@Validated
public class PersonServiceImpl implements PersonService {
    
    @Override
    public void save(@Valid Person person) {
        
    }
}
