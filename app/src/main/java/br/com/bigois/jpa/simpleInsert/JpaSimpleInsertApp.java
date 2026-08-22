
package br.com.bigois.jpa.simpleInsert;

import br.com.bigois.jpa.simpleInsert.entity.AnimalType;
import br.com.bigois.jpa.simpleInsert.entity.Pet;
import br.com.bigois.jpa.simpleInsert.repository.PetRepository;
import org.jspecify.annotations.NonNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class JpaSimpleInsertApp implements CommandLineRunner {
	private final PetRepository petRepository;

	public JpaSimpleInsertApp(PetRepository petRepository) {
		this.petRepository = petRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(JpaSimpleInsertApp.class, args);
	}

	@Override
	public void run(String @NonNull ... args) throws Exception {
		Pet cat = new Pet("Nagato", 1, AnimalType.CAT);
		Pet hamster = new Pet("Kushina", 1, AnimalType.HAMSTER);

		List<Pet> pets = new ArrayList<Pet>();
		pets.add(cat);
		pets.add(hamster);

		petRepository.saveAll(pets);
	}
}
