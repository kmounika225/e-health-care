package com.healthcare.repository;

import com.healthcare.entities.PrescriptionDetails;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PrescriptionDetailsRepository extends JpaRepository<PrescriptionDetails, Integer> {
	List<PrescriptionDetails> findByPrescriptionId(Integer id);

	//void save(List<PrescriptionDetails> prescriptiondetails);
}
