package br.com.bigois.designpatterns.strategy.validation;

import br.com.bigois.designpatterns.strategy.dto.CustomerRegistrationRequest;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CustomerEmailValidator implements CustomerValidator {
	@Override
	public boolean validate(CustomerRegistrationRequest customer) {
		return customer.email() != null
				&& customer.email().matches("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$");
	}
}
