package br.com.bigois.web.crud.dto;

import br.com.bigois.web.crud.model.Menu;

public record MenuDto(
		Long id,
		String country,
		String description
) {
	public MenuDto(Menu menu) {
		this(
				menu.getId(),
				menu.getCountry(),
				menu.getDescription()
		);
	}
}
