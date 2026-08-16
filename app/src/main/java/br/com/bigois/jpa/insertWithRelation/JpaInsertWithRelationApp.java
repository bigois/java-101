package br.com.bigois.jpa.insertWithRelation;

import br.com.bigois.jpa.insertWithRelation.entity.Candidate;
import br.com.bigois.jpa.insertWithRelation.entity.PoliticalParty;
import br.com.bigois.jpa.insertWithRelation.repository.CandidateRepository;
import br.com.bigois.jpa.insertWithRelation.repository.PoliticalPartyRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaInsertWithRelationApp implements CommandLineRunner {
	private final CandidateRepository candidateRepository;
	private final PoliticalPartyRepository politicalPartyRepository;

	public JpaInsertWithRelationApp(CandidateRepository candidateRepository, PoliticalPartyRepository politicalPartyRepository) {
		this.candidateRepository = candidateRepository;
		this.politicalPartyRepository = politicalPartyRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaInsertWithRelationApp.class, args);
	}

	@Override
	public void run(String @NonNull ... args) throws Exception {
		PoliticalParty pl = politicalPartyRepository.findById(2L).orElseThrow(() -> new RuntimeException("Political party (PL) not found"));
		PoliticalParty pt = politicalPartyRepository.findById(1L).orElseThrow(() -> new RuntimeException("Political party (PT) not found"));

		Candidate flavioBolsonaro = new Candidate("Flávio Bolsonaro", pl);
		Candidate fernandoHaddad = new Candidate("Fernando Haddad", pt);

		candidateRepository.save(flavioBolsonaro);
		candidateRepository.save(fernandoHaddad);
	}
}
