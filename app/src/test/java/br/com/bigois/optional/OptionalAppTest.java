package br.com.bigois.optional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class OptionalAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> OptionalApp.main(new String[0]));
	}
}
