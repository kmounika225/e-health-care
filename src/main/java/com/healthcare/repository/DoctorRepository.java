package com.healthcare.repository;

import com.healthcare.entities.Doctor;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
	Optional<Doctor> findByuserId(Integer id);
}
