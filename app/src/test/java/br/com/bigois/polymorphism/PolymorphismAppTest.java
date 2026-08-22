
package br.com.bigois.polymorphism;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class PolymorphismAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> PolymorphismApp.main(new String[0]));
	}
}
