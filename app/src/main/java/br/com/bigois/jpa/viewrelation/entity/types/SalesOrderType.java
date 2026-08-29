package br.com.bigois.jpa.viewrelation.entity.types;

import lombok.Getter;

@Getter
public enum SalesOrderType {
	N ("Normal"),
	D ("Devolução de Compras"),
	C ("Complemento de Preço/Quantidade"),
	P ("Complemento de IPI"),
	I ("Complemento de ICMS"),
	B ("Beneficiamento");

	private final String description;

	SalesOrderType(String description) {
		this.description = description;
	}
}
