package br.com.bigois.designpatterns.strategy.dto;

public record CustomerRegistrationRequest(
		String name,
		String birthDate,
		String gender,
		String email,
		String phone
) {
}
