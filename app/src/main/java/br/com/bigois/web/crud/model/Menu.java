package br.com.bigois.web.crud.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "menus")
public class Menu {
	@Id
	private Long id;

	@Column(nullable = false)
	private String country;

	@Column(nullable = false)
	private String description;

	@OneToMany(mappedBy = "menu")
	private List<Dish> dishes;
}
