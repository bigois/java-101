package br.com.bigois.jpa.simpleInsert.repository;

import br.com.bigois.jpa.simpleInsert.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetRepository extends JpaRepository<Pet, Long> {
}
