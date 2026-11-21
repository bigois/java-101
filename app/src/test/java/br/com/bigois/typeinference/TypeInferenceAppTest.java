package br.com.bigois.typeinference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class TypeInferenceAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> TypeInferenceApp.main(new String[0]));
	}
}
