package br.com.bigois.jpa.query.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "galaxies")
public class Galaxy {
	@Id
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "size")
	private Long size;

	@OneToMany(mappedBy = "galaxy")
	private List<Planet> planets;
}
