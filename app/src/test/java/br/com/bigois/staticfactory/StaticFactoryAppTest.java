package br.com.bigois.staticfactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class StaticFactoryAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> StaticFactoryApp.main(new String[0]));
	}
}
