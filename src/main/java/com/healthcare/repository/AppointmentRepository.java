package com.healthcare.repository;

import com.healthcare.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
    Appointment findByPatientId(Integer id);
}
