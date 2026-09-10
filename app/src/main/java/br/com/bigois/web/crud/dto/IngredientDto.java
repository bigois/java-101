package br.com.bigois.web.crud.dto;

import br.com.bigois.web.crud.model.Ingredient;

public record IngredientDto(
		String name
) {
	public IngredientDto(Ingredient ingredient) {
		this(
				ingredient.getName()
		);
	}
}
