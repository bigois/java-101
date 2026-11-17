package br.com.bigois.designpatterns.strategy.validation;

import br.com.bigois.designpatterns.strategy.domain.Gender;
import br.com.bigois.designpatterns.strategy.dto.CustomerRegistrationRequest;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CustomerGenderValidator implements CustomerValidator {
	@Override
	public boolean validate(CustomerRegistrationRequest customer) {
		if (customer.gender() == null || customer.gender().isBlank()) {
			return false;
		}

		try {
			Gender.valueOf(customer.gender());
			return true;
		} catch (IllegalArgumentException exception) {
			return false;
		}
	}
}
