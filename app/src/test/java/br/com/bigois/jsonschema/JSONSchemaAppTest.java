package br.com.bigois.jsonschema;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class JSONSchemaAppTest {
    @Test
    void shouldRunMain() {
        assertDoesNotThrow(() -> JSONSchemaApp.main(new String[0]));
    }
}
