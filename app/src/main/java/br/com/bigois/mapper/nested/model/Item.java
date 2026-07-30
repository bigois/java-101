package br.com.bigois.mapper.nested.model;

import java.math.BigDecimal;
import java.util.List;

public record Item(
		Long id,
		String name,
		String description,
		BigDecimal price,
		boolean available,
		int preparationTimeMinutes,
		List<String> tags,
		List<Ingredient> ingredients
) {
}
