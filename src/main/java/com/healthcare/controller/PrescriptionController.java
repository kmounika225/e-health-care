package com.healthcare.controller;

import com.healthcare.entities.Prescription;
import com.healthcare.repository.PrescriptionRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@RestController
@CrossOrigin
public class PrescriptionController {

    @Autowired
    PrescriptionRepository prescriptionRepository;

   /* @GetMapping("patient/{patientId}")
    public ResponseEntity<Appointment> getAppointmentDetails(@PathVariable Integer patientId){
        Appointment appointment = appointmentRepository.findByPatientId(patientId);
        if (appointment != null){
            return ResponseEntity.status(HttpStatus.OK).body(appointment);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
*/
    @GetMapping("prescription/{patientId}")
    public ResponseEntity<List<Prescription>> getPatientPrescriptionDetails(@PathVariable Integer patientId){
        List<Prescription> prescription = prescriptionRepository.findByPatientId(patientId);
        if (prescription != null){
            return ResponseEntity.status(HttpStatus.OK).body(prescription);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    
    @GetMapping("prescriptionByDoctor/{doctorId}")
    public ResponseEntity<List<Prescription>> getAppointmentDetails(@PathVariable Integer doctorId){
    	List<Prescription> prescription = prescriptionRepository.findByDoctorId(doctorId);
        if (prescription != null){
            return ResponseEntity.status(HttpStatus.OK).body(prescription);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("prescription")
    public Prescription createPrescription(@RequestBody Prescription prescription){
       return  prescriptionRepository.save(prescription);
       // return new ResponseEntity<String>("prescription created Successfully", HttpStatus.OK);
    } 
}
