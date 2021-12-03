package com.healthcare.controller;

import com.healthcare.entities.User;
import com.healthcare.repository.UserRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RequestMapping("/")
@RestController
@CrossOrigin
public class UserController {

    UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("user/")
    List<User> getUser(){
    	return userRepository.findAll();
    
    }
    
    @GetMapping("user/{id}")
    Optional<User> getUser(@PathVariable Integer id){
    	return userRepository.findById(id);
    
    }
    
    @GetMapping("user/{email}/{password}")
    Optional<User> getUserByMailPassword(@PathVariable String email,@PathVariable String password){
    	List<User> u= userRepository.findUserByemailAndPassword(email,password);
    	return u.stream().findFirst();
    
    }
    
 
    @RequestMapping(method = RequestMethod.POST, value = "user")
    public User addUser(@RequestBody User user) {
    	return userRepository.save(user);
    	
    }
}
