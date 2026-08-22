package br.com.bigois.mapper.nested;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class NestedMapperAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> NestedMapperApp.main(new String[0]));
	}
}
