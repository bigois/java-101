package br.com.bigois.designpatterns.strategy.validation;

import br.com.bigois.designpatterns.strategy.dto.CustomerRegistrationRequest;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

@NoArgsConstructor
public class CustomerBirthDateValidator implements CustomerValidator {
	@Override
	public boolean validate(CustomerRegistrationRequest customer) {
		if (customer.birthDate() == null || customer.birthDate().isBlank()) {
			return false;
		}

		try {
			LocalDate birthDate = LocalDate.parse(customer.birthDate());
			return !birthDate.isAfter(LocalDate.now());
		} catch (DateTimeParseException exception) {
			return false;
		}
	}
}
