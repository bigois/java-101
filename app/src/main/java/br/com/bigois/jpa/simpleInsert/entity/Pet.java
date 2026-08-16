package br.com.bigois.jpa.simpleInsert.entity;

import jakarta.persistence.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Entity
@Table(name = "pets")
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(nullable = false)
	String name;

	@Column(nullable = false)
	int age;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	AnimalType type;

	public Pet() {
	}

	public Pet(String name, int age, AnimalType type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}

	public Pet(Long id, String name, int age, AnimalType type) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.type = type;
	}
}
