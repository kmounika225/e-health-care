package com.healthcare.repository;

import com.healthcare.entities.Patient;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EHealthCareRepository extends JpaRepository<Patient, Integer> {
	Optional<Patient> findByuserId(Integer id);
}
