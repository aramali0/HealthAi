package fsts.ma.HealthAi.service;

import fsts.ma.HealthAi.DTO.AuthenticationDTO;
import fsts.ma.HealthAi.Exceptions.ActivationException;
import fsts.ma.HealthAi.Exceptions.RefreshTokenExpiredException;
import fsts.ma.HealthAi.entities.Patient;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Map;

public interface PatientService extends UserDetailsService {
    public Patient registerPatient(Patient patient);
    public void activationAccount(Map<String, String> code) throws ActivationException;
    public Map <String,String> connexion(AuthenticationDTO authenticationDTO) throws RefreshTokenExpiredException;
}
