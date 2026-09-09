package br.com.bigois.web.crud.dto;

import br.com.bigois.web.crud.model.Menu;

public record MenuDTO(
		Long id,
		String country,
		String description
) {
	public MenuDTO(Menu menu) {
		this(
				menu.getId(),
				menu.getCountry(),
				menu.getDescription()
		);
	}
}
