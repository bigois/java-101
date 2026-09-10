package br.com.bigois.web.crud.dto;

import br.com.bigois.web.crud.model.Dish;

import java.math.BigDecimal;
import java.util.List;

public record DishIngredientsDTO(
		Long id,
		String name,
		String description,
		BigDecimal price,
		List<IngredientDTO> ingredients
) {
	public DishIngredientsDTO(Dish dish) {
		this(
				dish.getId(),
				dish.getName(),
				dish.getDescription(),
				dish.getPrice(),
				dish.getIngredients().stream().map(IngredientDTO::new).toList()
		);
	}
}
