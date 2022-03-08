package com.cleverlance.academy.aggregator.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Data;
import lombok.Value;

@Embeddable
@Data
public class Address {
    @Column(name = "street")
    private String street;
    @Column(name = "number")
    private String number;
    @Column(name = "city")
    private String city;
}
