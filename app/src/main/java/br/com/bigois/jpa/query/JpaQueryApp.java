package br.com.bigois.jpa.query;

import br.com.bigois.jpa.query.entity.Planet;
import br.com.bigois.jpa.query.repository.PlanetRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaQueryApp implements ApplicationRunner {
	private final PlanetRepository planetRepository;

	public JpaQueryApp(PlanetRepository planetRepository) {
		this.planetRepository = planetRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaQueryApp.class, args);
	}

	@Override
	public void run(@NonNull ApplicationArguments args) {
		Planet biggerPlanet = planetRepository.getBiggerPlanetWithNativeQuery();
		System.out.println("Bigger Planet: " + biggerPlanet);

		Planet smallerPlanet = planetRepository.getSmallerPlanetWithJpql();
		System.out.println("Smaller Planet: " + smallerPlanet);
	}
}
