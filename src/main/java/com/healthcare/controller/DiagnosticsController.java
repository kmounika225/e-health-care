package com.healthcare.controller;

import com.healthcare.entities.Appointment;
import com.healthcare.entities.Diagnostics;
import com.healthcare.repository.DiagnosticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/diagnostics")
public class DiagnosticsController {

    @Autowired
    DiagnosticsRepository diagnosticsRepository;

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<Diagnostics> getDiagnostics(@PathVariable Integer patientId){
        Diagnostics diagnostics = diagnosticsRepository.findByPatientId(patientId);
        if (diagnostics != null){
            return ResponseEntity.status(HttpStatus.OK).body(diagnostics);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/create")
    public ResponseEntity<String> createDiagnostics(@RequestBody Diagnostics diagnostics){
        diagnosticsRepository.save(diagnostics);
        return new ResponseEntity<String>("Diagnostics created successfully", HttpStatus.OK);
    }
}
