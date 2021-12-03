package com.healthcare.controller;

import com.healthcare.entities.Doctor;
import com.healthcare.repository.DoctorRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequestMapping("/")
@RestController
@CrossOrigin
public class DoctorController {

    DoctorRepository doctorRepository;

    public DoctorController(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    @GetMapping("doctor")
    List<Doctor> getDoctor(){
    	return doctorRepository.findAll();
    
    }
    
    @GetMapping("doctor/{id}")
    Optional<Doctor> getDoctorID(@PathVariable Integer id){
    	return doctorRepository.findById(id);
    
    }
    
 
    @RequestMapping(method = RequestMethod.POST, value = "doctor")
    public void addDoctor(@RequestBody Doctor doctor) {
    	doctorRepository.save(doctor);
    }
}
