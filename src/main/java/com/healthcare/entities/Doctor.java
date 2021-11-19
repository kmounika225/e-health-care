package com.healthcare.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Doctor {

	@Id
	private int id;
	private String doctor_name;
	private String mobile_number;
	private String email_id;
	private String address;
	private String gender;
	private String specialization;
    private int userId;

	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;
	

	public Doctor(int doctor_Id, String doctor_name, String mobile_number, String email_id, String address,
			String gender, String specialization, int user_id) {
		super();
		this.id = doctor_Id;
		this.doctor_name = doctor_name;
		this.mobile_number = mobile_number;
		this.email_id = email_id;
		this.address = address;
		this.gender = gender;
		this.specialization = specialization;
		this.userId = user_id;
	}

	public int getDoctor_Id() {
		return id;
	}

	public void setDoctor_Id(int doctor_Id) {
		this.id = doctor_Id;
	}

	public String getDoctor_name() {
		return doctor_name;
	}

	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getUser_id() {
		return userId;
	}

	public void setUser_id(int user_id) {
		this.userId = user_id;
	}

}
