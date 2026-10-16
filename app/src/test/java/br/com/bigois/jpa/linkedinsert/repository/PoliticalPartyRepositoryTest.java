package br.com.bigois.jpa.linkedinsert.repository;

import br.com.bigois.jpa.linkedinsert.entity.PoliticalParty;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@ActiveProfiles("test")
// Use the test configuration instead of starting JpaInsertWithRelationApp and its CommandLineRunner.
@ContextConfiguration(classes = PoliticalPartyRepositoryTest.Config.class)
class PoliticalPartyRepositoryTest {
	@Autowired
	private PoliticalPartyRepository partyRepository;

	@Autowired
	private EntityManager entityManager;

	@Test
	void shouldReturnPoliticalPartyWhenFindById() {
		// Create a political party and save it to the repository
		PoliticalParty politicalParty = new PoliticalParty("PL");
		Long candidateId = partyRepository.saveAndFlush(politicalParty).getId();

		// Clear the persistence context to ensure we fetch a fresh entity from the database
		entityManager.clear();

		// Retrieve the political party by ID and assert the result
		PoliticalParty foundPoliticalParty = partyRepository.findById(candidateId)
				.orElseThrow(() -> new EntityNotFoundException("Political party not found"));
		assertEquals(politicalParty.getId(), foundPoliticalParty.getId());
		assertEquals(politicalParty.getName(), foundPoliticalParty.getName());
	}

	// Configure JPA for this test without running the entire application
	@Configuration
	// Locate entities in the PoliticalParty package so Hibernate can map them
	@EntityScan(basePackageClasses = PoliticalParty.class)
	// Register repositories from the PoliticalPartyRepository package so Spring can create and inject them
	@EnableJpaRepositories(basePackageClasses = PoliticalPartyRepository.class)
	static class Config {
	}
}
