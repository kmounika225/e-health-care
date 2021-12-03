package com.healthcare.repository;

import com.healthcare.entities.Prescription;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionRepository extends JpaRepository<Prescription,Integer> {
    List<Prescription> findByPatientId(Integer id);
    List<Prescription> findByDoctorId(Integer id);
}
  