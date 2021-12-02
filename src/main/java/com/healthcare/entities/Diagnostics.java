package com.healthcare.entities;

import javax.persistence.*;

@Entity
@Table(name = "diagnostics_details")
public class Diagnostics {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String testName;
    private Integer patientId;
    private Integer doctorId;

    public Diagnostics() {
    }

    public Diagnostics(Integer id, String testName, Integer patientId, Integer doctorId) {
        this.id = id;
        this.testName = testName;
        this.patientId = patientId;
        this.doctorId = doctorId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
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
