package com.example.webservice;

import com.example.webservice.entities.Compte;
import com.example.webservice.repository.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class WebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebserviceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CompteRepository compteRepository) {
		return args -> {
			compteRepository.save(new Compte(null, 1000.0, new Date(), Compte.TypeCompte.COURANT));
			compteRepository.save(new Compte(null, 1500.0, new Date(), Compte.TypeCompte.EPARGNE));
			compteRepository.save(new Compte(null, 2000.0, new Date(), Compte.TypeCompte.COURANT));

			compteRepository.findAll().forEach(c -> {
				System.out.println(c.toString());
			});
		};
	}
}
