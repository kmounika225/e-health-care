package com.healthcare.repository;

import com.healthcare.entities.Diagnostics;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosticsRepository extends JpaRepository<Diagnostics, Integer> {
    List<Diagnostics> findByPatientId(Integer id);
}
