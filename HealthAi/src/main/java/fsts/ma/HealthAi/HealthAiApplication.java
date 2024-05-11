package fsts.ma.HealthAi;

import fsts.ma.HealthAi.security.RsaKeyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyConfig.class)
public class HealthAiApplication {
	public static void main(String[] args) {
		SpringApplication.run(HealthAiApplication.class, args);
	}
}
