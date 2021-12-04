package com.healthcare.controller;

import com.healthcare.entities.PrescriptionDetails;
import com.healthcare.repository.PrescriptionDetailsRepository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/")
@RestController
public class PrescriptionDetailsController {

    @Autowired
    PrescriptionDetailsRepository prescriptionDetailsRepository;

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
   /* @GetMapping("prescription/{patientId}")
    public ResponseEntity<Prescription> getPatientPrescriptionDetails(@PathVariable Integer patientId){
        Prescription prescription = prescriptionRepository.findByPatientId(patientId);
        if (prescription != null){
            return ResponseEntity.status(HttpStatus.OK).body(prescription);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }*/
    
    
    @GetMapping("prescriptionDetails/{prescriptionId}")
    public ResponseEntity<List<PrescriptionDetails>> getPrescriptionDetails(@PathVariable Integer prescriptionId){
    	List<PrescriptionDetails> prescriptionDetails = prescriptionDetailsRepository.findByPrescriptionId(prescriptionId);
        if (prescriptionDetails != null){
            return ResponseEntity.status(HttpStatus.OK).body(prescriptionDetails);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PostMapping("prescriptionDetails")
    public ResponseEntity<String> createPrescription(@RequestBody List<PrescriptionDetails> prescriptiondetails){
    	prescriptionDetailsRepository.saveAll(prescriptiondetails);
        return new ResponseEntity<String>("prescription created Successfully", HttpStatus.OK);
    } 
}
