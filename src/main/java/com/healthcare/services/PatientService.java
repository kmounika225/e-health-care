package com.healthcare.services;

import com.healthcare.entities.Patient;

import java.util.Optional;

public interface PatientService {
    Optional<Patient> getByPatientId(Integer id);
    Patient savePatient(Patient patient);
}
