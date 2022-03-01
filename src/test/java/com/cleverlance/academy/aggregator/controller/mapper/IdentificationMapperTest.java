package com.cleverlance.academy.aggregator.controller.mapper;

import static org.junit.jupiter.api.Assertions.*;

import com.cleverlance.academy.aggregator.model.Address;
import com.cleverlance.academy.aggregator.model.Identification;
import com.cleverlance.academy.aggregator.model.Person;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

class IdentificationMapperTest {

    private static final IdentificationMapper MAPPER = Mappers.getMapper(IdentificationMapper.class);
    
    @Test
    void toIdentification() {
        Identification identification = new Identification("Moje meteostanice", new Address("Hlavni", "3D", "Praha"), new Person("Jan", "Novak", "jan.novak@seznam.cz", "MALE"));

        org.openapitools.model.Identification converted = MAPPER.toIdentification(identification);
        
        assertEquals("Moje meteostanice", converted.getName());
        assertEquals("Hlavni", converted.getAddress().getStreet());
        assertEquals("3D", converted.getAddress().getStreetNumber());
        assertEquals("Praha", converted.getAddress().getCity());
        assertEquals("Jan", converted.getOwner().getFirstName());
        assertEquals("Novak", converted.getOwner().getLastName());

    }
}