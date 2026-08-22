package br.com.bigois.jsonschema;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class JSONSchemaAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> JSONSchemaApp.main(new String[0]));
	}
}
