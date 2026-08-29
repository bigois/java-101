package br.com.bigois.jpa.linkedinsert.repository;

import br.com.bigois.jpa.linkedinsert.entity.PoliticalParty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoliticalPartyRepository extends JpaRepository<PoliticalParty, Long> {
}
