package br.com.bigois.streams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class StreamsAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> StreamsApp.main(new String[0]));
	}
}
