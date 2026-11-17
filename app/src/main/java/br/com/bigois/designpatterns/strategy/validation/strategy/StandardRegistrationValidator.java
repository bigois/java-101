package br.com.bigois.designpatterns.strategy.validation.strategy;

import br.com.bigois.designpatterns.strategy.dto.CustomerRegistrationRequest;
import br.com.bigois.designpatterns.strategy.validation.CustomerEmailValidator;
import br.com.bigois.designpatterns.strategy.validation.CustomerPhoneValidator;
import br.com.bigois.designpatterns.strategy.validation.CustomerValidator;

import java.util.List;

public class StandardRegistrationValidator implements CustomerValidator {
	private final List<CustomerValidator> validators;

	public StandardRegistrationValidator(QuickRegistrationValidator quickValidator) {
		validators = List.of(
				quickValidator,
				new CustomerEmailValidator(),
				new CustomerPhoneValidator()
		);
	}

	@Override
	public boolean validate(CustomerRegistrationRequest request) {
		return validators.stream().allMatch(validator -> validator.validate(request));
	}
}
