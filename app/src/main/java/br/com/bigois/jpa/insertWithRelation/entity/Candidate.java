package br.com.bigois.jpa.insertWithRelation.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "candidates")
public class Candidate {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String name;

	@ManyToOne
	@JoinColumn(name = "party_id")
	private PoliticalParty party;

	public Candidate() {
	}

	public Candidate(String name, PoliticalParty party) {
		this.name = name;
		this.party = party;
	}

	public Candidate(Long id, String name, PoliticalParty party) {
		this.id = id;
		this.name = name;
		this.party = party;
	}
}
