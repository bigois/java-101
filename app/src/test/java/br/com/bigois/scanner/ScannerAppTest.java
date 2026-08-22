
package br.com.bigois.scanner;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ScannerAppTest {
	@Test
	void shouldRunMainWithProvidedInput() {
		InputStream standardInput = System.in;

		try {
			System.setIn(new ByteArrayInputStream("Guilherme%n30%n".formatted().getBytes(StandardCharsets.UTF_8)));

			assertDoesNotThrow(() -> ScannerApp.main(new String[0]));
		} finally {
			System.setIn(standardInput);
		}
	}
}
