package com.cleverlance.academy.aggregator.repository;

import com.cleverlance.academy.aggregator.model.Identification;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaIdentificationRepository extends JpaRepository<Identification, Integer> {
    
    List<Identification> findByName(String name);
}
