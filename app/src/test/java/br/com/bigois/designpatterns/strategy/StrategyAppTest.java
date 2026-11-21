package br.com.bigois.designpatterns.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class StrategyAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> StrategyApp.main(new String[0]));
	}
}
