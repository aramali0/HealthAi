package fsts.ma.HealthAi;

import fsts.ma.HealthAi.entities.Analyse;
import fsts.ma.HealthAi.entities.Consultation;
import fsts.ma.HealthAi.entities.Patient;
import fsts.ma.HealthAi.repositories.AnalyseRepo;
import fsts.ma.HealthAi.repositories.ConsultationRepo;
import fsts.ma.HealthAi.repositories.PatientRepo;
import fsts.ma.HealthAi.security.RsaKeyConfig;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.Date;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyConfig.class)
@AllArgsConstructor
public class HealthAiApplication implements CommandLineRunner {
	private final AnalyseRepo analyseRepo;
	private final ConsultationRepo consultationRepo ;
	private final PatientRepo patientRepo;
	public static void main(String[] args) {
		SpringApplication.run(HealthAiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Analyse analyse = Analyse.builder()
				.text("something something")
				.build();

		Consultation consultation = Consultation.builder()
				.conseils("some thing")
				.conversation("Conversation")
				.date(new Date())
				.summer("summarize")
				.build();

		Patient patient = Patient.builder()
				.age(23)
				.email("simo@gmail.com")
				.build();

		patientRepo.save(patient);
		analyseRepo.save(analyse);
		consultationRepo.save(consultation);
	}


}
