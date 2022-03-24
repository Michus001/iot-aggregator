package com.cleverlance.academy.aggregator.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
@Table(name = "identification")
public class Identification {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    
    @Column(name = "name")
    @NotBlank
    private String name;
    
    @Embedded
    @NotNull
    private Address address;
    
    @Embedded
    @NotNull
    private Person owner;
    
    @Column(name = "url")
    @NotBlank
    private String url;
    
}
