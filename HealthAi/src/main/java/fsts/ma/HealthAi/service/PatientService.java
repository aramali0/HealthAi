package fsts.ma.HealthAi.service;

import fsts.ma.HealthAi.dto.PatientDto;
import fsts.ma.HealthAi.entities.Patient;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;
import java.util.Optional;

public interface PatientService extends UserDetailsService {
    UserDetails loadUserByUsername(String username);

    Optional<Patient> getPatient(Long id);
    List<Patient> getAllPatient();
    String addPatient(PatientDto patientDto);
    String deletePatient(Long id);

}
