package br.com.bigois.consumer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ConsumerAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> ConsumerApp.main(new String[0]));
	}
}
