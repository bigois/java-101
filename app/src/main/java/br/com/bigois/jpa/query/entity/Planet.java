package br.com.bigois.jpa.query.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
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

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "galaxy_id", referencedColumnName = "id")
	private Galaxy galaxy;

	@Override
	public String toString() {
		return "Planet(" +
				"id=" + id +
				", name='" + name + '\'' +
				", size=" + size +
				", moonCount=" + moonCount +
				", galaxy=" + galaxy.getName() +
				')';
	}
}
