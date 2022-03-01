package com.cleverlance.academy.aggregator.sevice;

import com.cleverlance.academy.aggregator.model.Person;
import javax.validation.Valid;

public interface PersonService {
    
    void save(@Valid Person person);
}
