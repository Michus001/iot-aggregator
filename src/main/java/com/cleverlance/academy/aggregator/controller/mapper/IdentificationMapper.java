package com.cleverlance.academy.aggregator.controller.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.openapitools.model.Address;
import org.openapitools.model.Identification;

@Mapper
public interface IdentificationMapper {
    
    
    List<Identification> toIdentifications(List<com.cleverlance.academy.aggregator.model.Identification> identification);
    
    Identification toIdentification(com.cleverlance.academy.aggregator.model.Identification identification);
    
    @Mapping(target = "streetNumber", source = "number")
    Address toAddress(com.cleverlance.academy.aggregator.model.Address address);

    com.cleverlance.academy.aggregator.model.Identification toIdentification(Identification identification);

    @Mapping(target = "number", source = "streetNumber")
    com.cleverlance.academy.aggregator.model.Address toAddress(Address address);
}
