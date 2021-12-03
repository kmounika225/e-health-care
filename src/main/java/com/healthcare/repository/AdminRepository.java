package com.healthcare.repository;

import com.healthcare.entities.Admin;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
	Optional<Admin> findByuserId(Integer id);
}

