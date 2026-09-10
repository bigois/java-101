package br.com.bigois.web.crud.dto;

import br.com.bigois.web.crud.model.Ingredient;

public record IngredientDTO(
		String name
) {
	public IngredientDTO(Ingredient ingredient) {
		this(
				ingredient.getName()
		);
	}
}
