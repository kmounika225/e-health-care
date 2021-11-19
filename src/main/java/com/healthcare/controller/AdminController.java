package com.healthcare.controller;

import com.healthcare.entities.Admin;
import com.healthcare.entities.Patient;
import com.healthcare.repository.AdminRepository;
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
public class AdminController {

	AdminRepository adminRepository;

    public AdminController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @GetMapping("admin/{id}")
    Optional<Admin> getAdmin(@PathVariable Integer id){
       Optional<Admin> admin = adminRepository.findById(id);
       return admin;
    }
    
 
    @RequestMapping(method = RequestMethod.POST, value = "admins")
    public void createNewAddress(@RequestBody Admin admin) {
    	try {
    		adminRepository.save(admin);
    	}
    	catch(Exception e) {
    		throw e;
    	}
    }
}
