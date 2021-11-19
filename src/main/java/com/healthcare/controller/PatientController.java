package com.healthcare.controller;

import com.healthcare.entities.Patient;
import com.healthcare.repository.EHealthCareRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequestMapping("/")
@RestController
public class PatientController {

    EHealthCareRepository eHealthCareRepository;

    public PatientController(EHealthCareRepository eHealthCareRepository) {
        this.eHealthCareRepository = eHealthCareRepository;
    }

    @GetMapping("patient/{id}")
    Optional<Patient> getPatient(@PathVariable Integer id){
       Optional<Patient> patient = eHealthCareRepository.findById(id);
       return patient;
       //return patient.map(p -> p.getFirstName());
    }
    
 
    @RequestMapping(method = RequestMethod.POST, value = "patients")
    public void createNewAddress(@RequestBody Patient patient) {
    	try {
         eHealthCareRepository.save(patient);
    	}
    	catch(Exception e) {
    		throw e;
    	}
    }
}
