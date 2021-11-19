package com.healthcare.repository;

import com.healthcare.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EHealthCareRepository extends JpaRepository<Patient, Integer> {
}
