package com.healthcare.entities;

import javax.persistence.*;

@Entity
@Table(name = "prescription")
public class Prescription {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
   // @Column(name = "patient_id")
    private Integer patientId;
   // @Column(name = "doctor_id")
    private Integer doctorId; 
    
    private String medicalCondition;
 
    

    public Prescription() {
    }

    public Prescription(Integer id, Integer patientId, Integer doctorId, String medicalCondition) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.medicalCondition = medicalCondition;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMedicalCondition() {
		return medicalCondition;
	}

	public void setMedicalCondition(String medicalCondition) {
		this.medicalCondition = medicalCondition;
	}

	public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    
}
