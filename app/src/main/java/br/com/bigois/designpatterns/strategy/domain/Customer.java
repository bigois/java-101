package br.com.bigois.designpatterns.strategy.domain;

import br.com.bigois.designpatterns.strategy.dto.CustomerRegistrationRequest;
import lombok.ToString;

import java.time.LocalDate;

@ToString
public class Customer {
	private final String name;
	private final LocalDate birthDate;
	private final Gender gender;
	private final String email;
	private final String phone;

	public Customer(CustomerRegistrationRequest request) {
		this.name = request.name();
		this.birthDate = LocalDate.parse(request.birthDate());
		this.gender = Gender.valueOf(request.gender());
		this.email = request.email();
		this.phone = request.phone();
	}
}
