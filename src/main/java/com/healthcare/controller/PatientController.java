package com.healthcare.controller;

import com.healthcare.entities.Patient;
import com.healthcare.entities.User;
import com.healthcare.services.PatientService;
import com.healthcare.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RequestMapping("/")
@RestController
public class PatientController {

    @Autowired
    PatientService patientService;
    @Autowired
    UserService userService;

    @GetMapping("patient/{patientId}")
    ResponseEntity<Optional<Patient>> getPatient(@PathVariable Integer patientId){
       Optional<Patient> patient = patientService.getByPatientId(patientId);
       if (patient.isPresent()){
           return ResponseEntity.status(HttpStatus.OK).body(patient);
       }else {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
    }

    @PostMapping("create/patient")
    ResponseEntity<String> createNewUser(@RequestBody Patient patient) {
        patientService.savePatient(patient);
        return ResponseEntity.status(HttpStatus.OK).body("Patient created successfully");
    }

    @PostMapping("create/user")
    ResponseEntity<String> createNewUser(@RequestBody User user) {
         userService.saveUser(user);
         return ResponseEntity.status(HttpStatus.OK).body("User created successfully");
    }
}
