package br.com.bigois.mapper.nested.model;

import java.util.Currency;
import java.util.List;

public record Menu(
		Long id,
		String name,
		String description,
		Currency currency,
		boolean active,
		List<Category> categories
) {
}
