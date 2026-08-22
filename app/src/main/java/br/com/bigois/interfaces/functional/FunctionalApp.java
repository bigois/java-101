
package br.com.bigois.interfaces.functional;

import java.time.LocalDate;

public class FunctionalApp {
	public static void main(String[] args) {
		User user1 = new User("guilherme.bigois@organacode.com.br", LocalDate.of(1996, 2, 4));
		User user2 = new User("bernardo.bigois@gmail.com", LocalDate.of(2015, 8, 21));

		// Uses a block lambda to validate the email domain
		Validator<User> emailValidator = (user) -> {
			boolean isValid = user.getEmail().contains("@organacode.com.br");
			return isValid;
		};

		// Uses a lambda expression to validate whether the user is at least 18 years old
		Validator<User> minAgeValidator = user -> !user.getBirthDate().isAfter(LocalDate.now().minusYears(18));

		// Uses the Validator static method to show each result
		System.out.println("----- Email validation -----");
		Validator.showValidatorResult(user1, emailValidator);
		Validator.showValidatorResult(user2, emailValidator);

		System.out.println(); // Prints a blank line

		System.out.println("----- Birth date validation -----");
		Validator.showValidatorResult(user1, minAgeValidator);
		Validator.showValidatorResult(user2, minAgeValidator);
	}
}
