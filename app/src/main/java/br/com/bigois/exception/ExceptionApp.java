package br.com.bigois.exception;

import br.com.bigois.interfaces.classicinterface.BankAccount;
import br.com.bigois.interfaces.defaultmethod.PersonalAccount;

import java.math.BigDecimal;

public class ExceptionApp {
	public static void main(String[] args) {
		BankAccount account = new PersonalAccount(1L);
		Long userId = 2L;

		if (account.getId().equals(userId)) {
			System.out.println("User is authorized to access the account");
		} else {
			// Checked exceptions REQUIRE the use of try/catch blocks or the throws declaration in the method signature
			try {
				throw new UnauthorizedAccessException("User is not authorized to access this account");
			} catch (UnauthorizedAccessException e) {
				System.err.println(e.getMessage());
			}
		}

		// Unchecked exceptions DO NOT REQUIRE the use of try/catch or throws, but they can be caught if desired
		account.withdraw(new BigDecimal("-100"));
		// try {
		//     account.withdraw(new BigDecimal("-100"));
		// } catch (IllegalArgumentException e) {
		//     System.err.println(e.getMessage());
		// }
	}
}
