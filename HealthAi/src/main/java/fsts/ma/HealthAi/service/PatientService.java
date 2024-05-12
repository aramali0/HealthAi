package fsts.ma.HealthAi.service;

import fsts.ma.HealthAi.dto.AuthenticationDTO;
import fsts.ma.HealthAi.entities.Patient;
import fsts.ma.HealthAi.exceptions.ActivationException;
import fsts.ma.HealthAi.exceptions.RefreshTokenExpiredException;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Map;

public interface PatientService extends UserDetailsService {
    public Patient registerUser( Patient userApp);
    public void activationAccount(Map<String, String> code) throws ActivationException;
    public Map <String,String> connexion(AuthenticationDTO authenticationDTO) throws RefreshTokenExpiredException;
    public Patient savePatient(Patient patient);
}
