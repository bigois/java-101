package br.com.bigois.web.crud.dto;

import br.com.bigois.web.crud.model.Dish;

import java.math.BigDecimal;
import java.util.List;

public record DishIngredientsDto(
		Long id,
		String name,
		String description,
		BigDecimal price,
		List<IngredientDto> ingredients
) {
	public DishIngredientsDto(Dish dish) {
		this(
				dish.getId(),
				dish.getName(),
				dish.getDescription(),
				dish.getPrice(),
				dish.getIngredients().stream().map(IngredientDto::new).toList()
		);
	}
}
