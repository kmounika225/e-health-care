package com.healthcare.repository;

import com.healthcare.entities.User;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
	List<User> findUserByemailAndPassword(String email,String password);
}
