package com.cleverlance.academy.aggregator.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Identification {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    
    @Embedded
    private Address address;
    
    @Embedded
    private Person owner;
    
}
