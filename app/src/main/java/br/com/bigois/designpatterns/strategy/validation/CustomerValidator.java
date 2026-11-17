package br.com.bigois.designpatterns.strategy.validation;

import br.com.bigois.designpatterns.strategy.dto.CustomerRegistrationRequest;

public interface CustomerValidator {
	boolean validate(CustomerRegistrationRequest request);
}
