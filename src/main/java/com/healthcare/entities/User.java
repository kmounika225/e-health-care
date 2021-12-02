package com.healthcare.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "users")
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	
	private String role;
	private String password;
	public String email;

	@OneToOne(mappedBy = "user", fetch = FetchType.LAZY,
    cascade = CascadeType.ALL)
	private Doctor doctor;

	

	@OneToOne(mappedBy = "user", fetch = FetchType.LAZY,
	            cascade = CascadeType.ALL)
	private Patient patient;

	@OneToOne(mappedBy = "user", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
	private Admin admin;
	
	public User() {
		super();
	}



	public User(String role, String password,String email) {
		super();
		this.role = role;
		this.password = password;
		this.email = email;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Doctor getDoctor() {
		return doctor;
	}



	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


    @JsonManagedReference
	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
