package br.com.bigois.web.crud.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "dishes")
public class Dish {
	@Id
	private Long id;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private String description;

	@Column(nullable = false)
	private BigDecimal price;

	@Column(nullable = false)
	private boolean available;

	@Column(name = "preparation_time", nullable = false)
	private Integer preparationTime;

	@ManyToOne
	@JoinColumn(name = "menu_id", nullable = false)
	private Menu menu;

	@OneToMany(mappedBy = "dish")
	private List<Ingredient> ingredients;
}
