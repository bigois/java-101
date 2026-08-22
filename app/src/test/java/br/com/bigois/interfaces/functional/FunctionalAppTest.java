
package br.com.bigois.interfaces.functional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class FunctionalAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> FunctionalApp.main(new String[0]));
	}
}
