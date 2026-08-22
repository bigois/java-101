package br.com.bigois.interfaces.staticmethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class StaticMethodAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> StaticMethodApp.main(new String[0]));
	}
}
