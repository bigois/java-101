
package br.com.bigois.mapper.dto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DtoMapperAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> DtoMapperApp.main(new String[0]));
	}
}
