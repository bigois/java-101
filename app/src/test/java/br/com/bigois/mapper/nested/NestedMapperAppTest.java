package br.com.bigois.mapper.nested;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class NestedMapperAppTest {
    @Test
    void shouldRunMain() {
        assertDoesNotThrow(() -> NestedMapperApp.main(new String[0]));
    }
}
