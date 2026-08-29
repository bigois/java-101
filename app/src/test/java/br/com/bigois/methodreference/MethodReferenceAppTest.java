package br.com.bigois.methodreference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class MethodReferenceAppTest {
	@Test
	void shouldRunMain() {
		assertDoesNotThrow(() -> MethodReferenceApp.main(new String[0]));
	}
}
