package com.cleverlance.academy.aggregator.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import lombok.Value;

@Embeddable
@Data
public class Address {
    @NotBlank
    @Column(name = "street")
    private String street;
    
    @Column(name = "number")
    @NotBlank
    private String number;
    
    @Column(name = "city")
    @NotBlank
    private String city;
}
