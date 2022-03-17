package com.cleverlance.academy.aggregator.sevice;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ClientIdentificationMapper {
    
    Identification toIdentification(com.cleverlance.academy.aggregator.client.model.Identification identification);
    
    @Mapping(target = "number", source = "streetNumber")
    Address toAddress(com.cleverlance.academy.aggregator.client.model.Address address);
}
