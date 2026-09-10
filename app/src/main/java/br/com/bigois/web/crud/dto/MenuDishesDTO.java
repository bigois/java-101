package br.com.bigois.web.crud.dto;

import br.com.bigois.web.crud.model.Dish;
import br.com.bigois.web.crud.model.Menu;

import java.util.List;

public record MenuDishesDTO(
		Long id,
		String country,
		String description,
		List<DishDTO> dishes
) {
	public MenuDishesDTO(Menu menu, List<Dish> dishes) {
		this(
				menu.getId(),
				menu.getCountry(),
				menu.getDescription(),
				dishes.stream().map(DishDTO::new).toList()
		);
	}
}
