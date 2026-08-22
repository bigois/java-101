
package br.com.bigois.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionAppTest {
	@Test
	void shouldThrowIntentionalUncheckedException() {
		IllegalArgumentException exception = assertThrows(
				IllegalArgumentException.class,
				() -> ExceptionApp.main(new String[0]));

		assertEquals("Withdrawal amount must be positive", exception.getMessage());
	}
}
