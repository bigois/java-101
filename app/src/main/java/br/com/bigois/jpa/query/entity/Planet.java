package br.com.bigois.jpa.query.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "planets")
public class Planet {
	@Id
	private Long id;

	@Column(name = "name")
	private String name;

	@Column(name = "size")
	private Long size;

	@Column(name = "moon_count")
	private Integer moonCount;
}
