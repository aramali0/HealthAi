package fsts.ma.HealthAi.service.imp;

import fsts.ma.HealthAi.service.PatientService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class PatientServiceImpl implements PatientService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
