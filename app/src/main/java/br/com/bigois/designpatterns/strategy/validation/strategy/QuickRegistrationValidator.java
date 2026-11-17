package br.com.bigois.designpatterns.strategy.validation.strategy;

import br.com.bigois.designpatterns.strategy.dto.CustomerRegistrationRequest;
import br.com.bigois.designpatterns.strategy.validation.CustomerBirthDateValidator;
import br.com.bigois.designpatterns.strategy.validation.CustomerNameValidator;
import br.com.bigois.designpatterns.strategy.validation.CustomerValidator;

import java.util.List;

public class QuickRegistrationValidator implements CustomerValidator {
	private final List<CustomerValidator> validators = List.of(
			new CustomerNameValidator(),
			new CustomerBirthDateValidator()
	);

	@Override
	public boolean validate(CustomerRegistrationRequest request) {
		return validators.stream().allMatch(validator -> validator.validate(request));
	}
}
