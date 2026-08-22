package br.com.bigois.mapper.simple;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Address(
		@JsonAlias("logradouro") String street,
		@JsonAlias("localidade") String city,
		@JsonAlias("bairro") String neighborhood,
		@JsonAlias("uf") String state
) {
}
