package br.com.bigois.jpa.linkedinsert.repository;

import br.com.bigois.jpa.linkedinsert.entity.Candidate;
import br.com.bigois.jpa.linkedinsert.entity.PoliticalParty;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CandidateRepositoryTest {
	private final CandidateRepository candidateRepository = mock(CandidateRepository.class);

	@Test
	void shouldReturnCandidateWhenFindById() {
		// Create a mock candidate and political party
		PoliticalParty politicalParty = new PoliticalParty(1L, "PL");
		Candidate candidate = new Candidate(1L, "John Doe", politicalParty);

		// Mock the behavior of the repository
		when(candidateRepository.findById(1L)).thenReturn(Optional.of(candidate));

		// Call the method and assert the result
		Optional<Candidate> result = candidateRepository.findById(1L);
		assertTrue(result.isPresent());
		assertEquals("John Doe", result.get().getName());
	}
}
