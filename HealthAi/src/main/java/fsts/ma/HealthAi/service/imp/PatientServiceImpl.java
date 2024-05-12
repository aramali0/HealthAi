package fsts.ma.HealthAi.service.imp;

import fsts.ma.HealthAi.dto.PatientDto;
import fsts.ma.HealthAi.entities.Patient;
import fsts.ma.HealthAi.mappers.PatientMapper;
import fsts.ma.HealthAi.repositories.PatientRepo;
import fsts.ma.HealthAi.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class PatientServiceImpl implements PatientService {
    private final PatientRepo patientRepo;
    private final PatientMapper patientMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    @Override
    public Optional<Patient> getPatient(Long id) {
        return patientRepo.findById(id);
    }

    @Override
    public List<Patient> getAllPatient() {
        return patientRepo.findAll();
    }

    @Override
    public String addPatient(PatientDto patientDto) {
        patientRepo.save(patientMapper.fromDTO(patientDto));
        return "patient saved successfully";
    }

    @Override
    public String deletePatient(Long id) {
        patientRepo.deleteById(id);
        return "deleted successfully";
    }
}
