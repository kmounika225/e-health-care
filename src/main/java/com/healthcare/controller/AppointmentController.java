package com.healthcare.controller;

import com.healthcare.entities.Appointment;
import com.healthcare.repository.AppointmentRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@RestController
@CrossOrigin
public class AppointmentController {

    @Autowired
    AppointmentRepository appointmentRepository;

    @GetMapping("appointment/{patientId}")
    public ResponseEntity<List<Appointment>> getAppointmentDetails(@PathVariable Integer patientId){
        List<Appointment> appointment = appointmentRepository.findByPatientId(patientId);
        if (appointment != null){
            return ResponseEntity.status(HttpStatus.OK).body(appointment);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("appointment/schedule")
    public void scheduleAppointment(@RequestBody Appointment appointment){
        appointmentRepository.save(appointment);
       
    }
}
