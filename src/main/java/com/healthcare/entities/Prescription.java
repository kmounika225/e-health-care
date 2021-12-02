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
 
    

    public Prescription() {
    }

    public Prescription(Integer id, Integer patientId, Integer doctorId) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
