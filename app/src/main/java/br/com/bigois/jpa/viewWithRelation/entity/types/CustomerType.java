package br.com.bigois.jpa.viewWithRelation.entity.types;

import lombok.Getter;

@Getter
public enum CustomerType {
	F ("F = Pessoa Física"),
	J ("J = Pessoa Jurídica");

	private final String description;

	CustomerType(String description) {
		this.description = description;
	}
}
