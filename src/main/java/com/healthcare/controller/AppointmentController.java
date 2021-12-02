package com.healthcare.controller;

import com.healthcare.entities.Appointment;
import com.healthcare.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/appointment")
@RestController
public class AppointmentController {

    @Autowired
    AppointmentRepository appointmentRepository;

    @GetMapping("patient/{patientId}")
    public ResponseEntity<Appointment> getAppointmentDetails(@PathVariable Integer patientId){
        Appointment appointment = appointmentRepository.findByPatientId(patientId);
        if (appointment != null){
            return ResponseEntity.status(HttpStatus.OK).body(appointment);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/schedule")
    public ResponseEntity<String> scheduleAppointment(@RequestBody Appointment appointment){
        appointmentRepository.save(appointment);
        return new ResponseEntity<String>("Appointment Scheduled Successfully", HttpStatus.OK);
    }
}
