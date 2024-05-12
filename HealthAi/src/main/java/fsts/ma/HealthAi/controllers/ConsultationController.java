package fsts.ma.HealthAi.controllers;

import fsts.ma.HealthAi.entities.Consultation;
import fsts.ma.HealthAi.mappers.ConsultationMapper;
import fsts.ma.HealthAi.service.ConsultationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/consultation")
@AllArgsConstructor
public class ConsultationController {
    private final ConsultationService consultationService;
    private final ConsultationMapper consultationMapper;
    @GetMapping("/{id}")
    public ResponseEntity<?> getConsultationById(@PathVariable Long id)
    {
        Optional<Consultation> consltation = consultationService.getConsultation(id);
        if(consltation.isPresent())
        {
            return new ResponseEntity<>(consltation, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("consultation not found !",HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<?> addConsultation(@RequestBody Consultation consultation)
    {
        String data = consultationService.addConsultation(consultation);
        if(data != null)
        {
            return new ResponseEntity<>(data, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("something went wrong !",HttpStatus.NOT_FOUND);
        }
    }
 @GetMapping
    public ResponseEntity<?> getAll()
    {
        List<Consultation> analyses = consultationService.getAllConsultation();
        if(analyses.isEmpty())
        {
            return new ResponseEntity<>(analyses, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("there is no Consultations here ",HttpStatus.NOT_FOUND);
        }
    }
}
