package br.com.bigois.web.crud.dto;

import br.com.bigois.web.crud.model.Dish;
import br.com.bigois.web.crud.model.Menu;

import java.util.List;

public record MenuDishesDto(
		Long id,
		String country,
		String description,
		List<DishDto> dishes
) {
	public MenuDishesDto(Menu menu, List<Dish> dishes) {
		this(
				menu.getId(),
				menu.getCountry(),
				menu.getDescription(),
				dishes.stream().map(DishDto::new).toList()
		);
	}
}
