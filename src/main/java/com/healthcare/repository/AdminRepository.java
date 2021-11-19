package com.healthcare.repository;

import com.healthcare.entities.Admin;
import com.healthcare.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
}
