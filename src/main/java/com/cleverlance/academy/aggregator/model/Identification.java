package com.cleverlance.academy.aggregator.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "identification")
public class Identification {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    
    @Embedded
    private Address address;
    
    @Embedded
    private Person owner;
    
    private String url;
    
}
