package br.com.bigois.interfaces.defaultmethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DefaultMethodAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> DefaultMethodApp.main(new String[0]));
	}
}
