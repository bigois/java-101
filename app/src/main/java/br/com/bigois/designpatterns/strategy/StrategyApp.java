package br.com.bigois.designpatterns.strategy;

import br.com.bigois.designpatterns.strategy.domain.Customer;
import br.com.bigois.designpatterns.strategy.dto.CustomerRegistrationRequest;
import br.com.bigois.designpatterns.strategy.validation.CustomerGenderValidator;
import br.com.bigois.designpatterns.strategy.validation.CustomerValidator;
import br.com.bigois.designpatterns.strategy.validation.strategy.QuickRegistrationValidator;
import br.com.bigois.designpatterns.strategy.validation.strategy.StandardRegistrationValidator;

import java.util.List;

public class StrategyApp {
	private StrategyApp() {
	}

	public static void main(String[] args) {
		CustomerValidator genderValidator = new CustomerGenderValidator();
		QuickRegistrationValidator quickValidator = new QuickRegistrationValidator();
		CustomerValidator standardValidator = new StandardRegistrationValidator(quickValidator);

		List<Customer> customersToCreate = sampleRegistrations().stream()
				.filter(genderValidator::validate)
				.filter(request -> {
					CustomerValidator validator = switch (request.gender()) {
						case "M" -> quickValidator;
						case "F" -> standardValidator;
						default -> standardValidator;
					};
					return validator.validate(request);
				})
				.map(Customer::new)
				.toList();

		customersToCreate.forEach(customer -> System.out.println("Customer created: " + customer));
	}

	private static List<CustomerRegistrationRequest> sampleRegistrations() {
		return List.of(
				new CustomerRegistrationRequest("Jane Smith", "1985-05-15",
						"F", "invalid-email", "987-654-3210"),
				new CustomerRegistrationRequest("Jane Smith", "1985-05-15",
						"F", "invalid-email", "987-654-3210"),
				new CustomerRegistrationRequest("John Doe", "1990-01-01",
						"M", "john.doe@example.com", "123-456-7890"),
				new CustomerRegistrationRequest("Alex Johnson", "2000-12-31",
						"OTHER", "alex.johnson@example.com", "555-555-5555")
		);
	}
}
