package br.com.bigois.mapper.dto;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class DtoMapperAppTest {
    @Test
    void shouldRunMain() {
        assertDoesNotThrow(() -> DtoMapperApp.main(new String[0]));
    }
}
