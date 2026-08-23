package br.com.bigois.jpa.simpleInsert.entity;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
@Table(name = "pets")
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;

	@Column(nullable = false)
	String name;

	@Column(nullable = false)
	int age;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	AnimalType type;

	@Transient
	boolean hasHealthPlan;

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
