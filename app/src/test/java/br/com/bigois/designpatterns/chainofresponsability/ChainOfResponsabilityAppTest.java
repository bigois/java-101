package br.com.bigois.designpatterns.chainofresponsability;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ChainOfResponsabilityAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> ChainOfResponsabilityApp.main(new String[0]));
	}
}
