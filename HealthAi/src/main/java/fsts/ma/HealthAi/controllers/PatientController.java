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
    public ResponseEntity<?> getUserByid(@PathVariable Long id)
    {
        Optional<Patient> patient = patientService.getPatient(id);
        if(patient.isPresent())
        {
            return new ResponseEntity<>(patientMapper.fromEntity(patient.get()), HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("user not found !",HttpStatus.NOT_FOUND);
        }
    }


}
