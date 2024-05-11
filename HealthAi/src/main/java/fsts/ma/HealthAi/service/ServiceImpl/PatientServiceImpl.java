package fsts.ma.HealthAi.service.ServiceImpl;

import fsts.ma.HealthAi.DTO.AuthenticationDTO;
import fsts.ma.HealthAi.Exceptions.ActivationException;
import fsts.ma.HealthAi.Exceptions.RefreshTokenExpiredException;
import fsts.ma.HealthAi.entities.Patient;
import fsts.ma.HealthAi.service.PatientService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PatientServiceImpl implements PatientService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
    @Override
    public Patient registerPatient(Patient patient) {
        return null;
    }
    @Override
    public void activationAccount(Map<String, String> code) throws ActivationException {

    }

    @Override
    public Map<String, String> connexion(AuthenticationDTO authenticationDTO) throws RefreshTokenExpiredException {
        return null;
    }
}
