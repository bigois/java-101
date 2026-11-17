package br.com.bigois.designpatterns.strategy.validation;

import br.com.bigois.designpatterns.strategy.dto.CustomerRegistrationRequest;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CustomerPhoneValidator implements CustomerValidator {
	@Override
	public boolean validate(CustomerRegistrationRequest customer) {
		if (customer.phone() == null || !customer.phone().matches("^\\+?[0-9 ()-]+$")) {
			return false;
		}

		String digits = customer.phone().replaceAll("[^0-9]", "");
		return digits.length() >= 10 && digits.length() <= 15;
	}
}
