package com.healthcare.repository;

import com.healthcare.entities.Diagnostics;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosticsRepository extends JpaRepository<Diagnostics, Integer> {
    Diagnostics findByPatientId(Integer id);
}
