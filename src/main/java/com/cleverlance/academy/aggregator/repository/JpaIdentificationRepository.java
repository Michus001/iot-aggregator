package com.cleverlance.academy.aggregator.repository;

import com.cleverlance.academy.aggregator.model.Identification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JpaIdentificationRepository extends JpaRepository<Identification, Integer> {
}
