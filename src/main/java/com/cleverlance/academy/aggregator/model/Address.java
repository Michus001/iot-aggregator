package com.cleverlance.academy.aggregator.model;

import javax.persistence.Embeddable;
import lombok.Data;
import lombok.Value;

@Embeddable
@Data
public class Address {
    private String street;
    private String number;
    private String city;
}
