package br.com.bigois.jpa.linkedinsert.repository;

import br.com.bigois.jpa.linkedinsert.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
