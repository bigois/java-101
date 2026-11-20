package br.com.bigois.designpatterns.chainofresponsability.domain;

import lombok.NonNull;

import java.math.BigDecimal;

public record Reimbursement(
		@NonNull BigDecimal amount,
		@NonNull String description
) {
	public Reimbursement {
		if (amount.signum() <= 0) {
			throw new IllegalArgumentException("Reimbursement amount must be positive");
		}

		if (description.isBlank()) {
			throw new IllegalArgumentException("Reimbursement description must not be blank");
		}
	}
}
