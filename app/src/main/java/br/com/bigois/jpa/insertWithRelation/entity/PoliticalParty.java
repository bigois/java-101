
package br.com.bigois.jpa.insertWithRelation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "political_parties")
public class PoliticalParty {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;

	public PoliticalParty() {
	}

	public PoliticalParty(String name) {
		this.name = name;
	}

	public PoliticalParty(Long id, String name) {
		this.id = id;
		this.name = name;
	}
}
