package com.secretchat.sccore.repository;

import com.secretchat.sccore.entity.GeographicalData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GeographicalDataRepository extends JpaRepository<GeographicalData, String> {
}