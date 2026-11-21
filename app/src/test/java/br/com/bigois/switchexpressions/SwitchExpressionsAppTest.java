package br.com.bigois.switchexpressions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class SwitchExpressionsAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> SwitchExpressionsApp.main(new String[0]));
	}
}
