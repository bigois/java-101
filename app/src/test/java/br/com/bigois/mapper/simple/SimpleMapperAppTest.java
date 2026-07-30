package br.com.bigois.mapper.simple;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class SimpleMapperAppTest {
    @Test
    void shouldRunMain() {
        assertDoesNotThrow(() -> SimpleMapperApp.main(new String[0]));
    }
}
