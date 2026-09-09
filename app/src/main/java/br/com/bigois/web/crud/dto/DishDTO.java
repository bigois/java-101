package br.com.bigois.web.crud.dto;

import br.com.bigois.web.crud.entity.Dish;

import java.math.BigDecimal;

public record DishDTO(
		Long id,
		String name,
		String description,
		BigDecimal price
) {
	public DishDTO(Dish dish) {
		this(dish.getId(), dish.getName(), dish.getDescription(), dish.getPrice());
	}
}
