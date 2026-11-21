package br.com.bigois.mapper.databind;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DatabindMapperAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> DatabindMapperApp.main(new String[0]));
	}
}
