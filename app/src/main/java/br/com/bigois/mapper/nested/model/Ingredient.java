
package br.com.bigois.mapper.nested.model;

import java.util.List;

public record Ingredient(
		Long id,
		String name,
		double quantity,
		MeasureUnit unit,
		boolean optional,
		List<Allergen> allergens
) {
}
