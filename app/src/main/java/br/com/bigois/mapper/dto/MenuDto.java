package br.com.bigois.mapper.dto;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MenuDto(
		Long id,
		@JsonAlias("name") String title,
		String description
) {
}
