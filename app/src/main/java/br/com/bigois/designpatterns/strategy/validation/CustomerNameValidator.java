package br.com.bigois.designpatterns.strategy.validation;

import br.com.bigois.designpatterns.strategy.dto.CustomerRegistrationRequest;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CustomerNameValidator implements CustomerValidator {
	@Override
	public boolean validate(CustomerRegistrationRequest customer) {
		return customer.name() != null && customer.name().strip().length() >= 5;
	}
}
