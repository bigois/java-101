package br.com.bigois.web.exception.controller;

import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ExceptionControllerTest {
	@Test
	void shouldReturnOk() {
		assertEquals("{\"message\":\"OK\"}", new ExceptionController().getOK().getBody());
	}

	@Test
	void shouldThrowWhenEntityIsNotFound() {
		assertThrows(EntityNotFoundException.class, () -> new ExceptionController().throwEntityNotFoundException());
	}
}
