
package br.com.bigois.mapper.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class SimpleMapperAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> SimpleMapperApp.main(new String[0]));
	}
}
