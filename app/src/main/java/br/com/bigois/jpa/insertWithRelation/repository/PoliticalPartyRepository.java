
package br.com.bigois.jpa.insertWithRelation.repository;

import br.com.bigois.jpa.insertWithRelation.entity.PoliticalParty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoliticalPartyRepository extends JpaRepository<PoliticalParty, Long> {
}
