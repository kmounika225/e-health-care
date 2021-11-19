package com.healthcare.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int id;

	private String role;
	private String password;
	
	 @OneToOne(mappedBy = "Doctor")
	    private Doctor doctor;

	 @OneToOne(mappedBy = "Patient")
	    private Patient patient;
	 
	public User(int user_id, String role, String password) {
		super();
		this.id = user_id;
		this.role = role;
		this.password = password;
	}

	public int getUser_id() {
		return id;
	}

	public void setUser_id(int user_id) {
		this.id = user_id;
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
