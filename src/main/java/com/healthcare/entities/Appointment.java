package com.healthcare.entities;

import javax.persistence.*;

@Entity
@Table(name = "appointment_details")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
   // @Column(name = "patient_id")
    private Integer patientId;
   // @Column(name = "doctor_id")
    private Integer doctorId;
   // @Column(name = "appointment_date")
    private String appointmentDate;

    public Appointment() {
    }

    public Appointment(Integer id, Integer patientId, Integer doctorId, String appointmentDate) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
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

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}
