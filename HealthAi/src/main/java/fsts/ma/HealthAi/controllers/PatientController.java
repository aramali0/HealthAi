package fsts.ma.HealthAi.controllers;

import fsts.ma.HealthAi.dto.PatientDto;
import fsts.ma.HealthAi.entities.Patient;
import fsts.ma.HealthAi.mappers.PatientMapper;
import fsts.ma.HealthAi.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/patient")
@AllArgsConstructor
public class PatientController {

    private final PatientService patientService;
    private final PatientMapper patientMapper;

    @GetMapping("/{id}")
    public ResponseEntity<?> getUserByid(@PathVariable Long id) {
        Optional<Patient> patient = patientService.getPatient(id);
        if (patient.isPresent()) {
            return new ResponseEntity<>(patientMapper.fromEntity(patient.get()), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("user not found !", HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/username/{username}")
    public ResponseEntity<?> getUserByUser(@PathVariable String username ) {
        Patient patient = patientService.getPatientByusername(username);
        if (patient != null) {
            return new ResponseEntity<>(patientMapper.fromEntity(patient), HttpStatus.OK);
        } else {
            return new ResponseEntity<>("user not found !", HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/analyse/{username}")
    public ResponseEntity<?> getAllAnalyses(@PathVariable String username)
    {
        Patient patient = patientService.getPatientByusername(username);
        if(patient != null )
        {
            if(!patient.getAnalyses().isEmpty())
            {
                return  new ResponseEntity<>(patient.getAnalyses(),HttpStatus.OK);
            }
            else {
                return new ResponseEntity<>("this patient doesnt has any analyses",HttpStatus.ACCEPTED);
            }
        }
        else {

            return new ResponseEntity<>("this patient not found",HttpStatus.NOT_FOUND);
        }
    }
@GetMapping("/consultation/{username}")
    public ResponseEntity<?> getAllConsultation(@PathVariable String username)
    {
        Patient patient = patientService.getPatientByusername(username);
        if(patient !=null)
        {
            if(!patient.getConsultationList().isEmpty())
            {
                return  new ResponseEntity<>(patient.getConsultationList(),HttpStatus.OK);
            }
            else {
                return new ResponseEntity<>("this patient doesnt has any consultation",HttpStatus.ACCEPTED);
            }
        }
        else {

            return new ResponseEntity<>("this patient not found",HttpStatus.NOT_FOUND);
        }
    }
}