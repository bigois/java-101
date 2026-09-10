package br.com.bigois.jsonschema;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class JsonSchemaAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> JsonSchemaApp.main(new String[0]));
	}
}
