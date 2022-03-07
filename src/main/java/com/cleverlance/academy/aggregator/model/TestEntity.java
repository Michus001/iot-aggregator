package com.cleverlance.academy.aggregator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TestEntity {
    
    @Id
    @GeneratedValue
    private Long id;
}
