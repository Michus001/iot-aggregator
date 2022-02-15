package com.cleverlance.academy.aggregator.model;

import lombok.Value;

@Value
public class Identification {
    
    private String name;
    private Address address;
    private Person owner;
    
}
