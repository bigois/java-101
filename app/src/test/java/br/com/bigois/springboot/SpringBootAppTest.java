package br.com.bigois.springboot;

import br.com.bigois.MainAppRunner;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

class SpringBootAppTest {
	@Test
	void shouldFailFastWithoutTouchingTheDatabaseWhenPasswordIsMissing() throws Exception {
		int exitCode = MainAppRunner.runInNewProcess(SpringBootApp.class, "", null, Set.of("DB_PASSWORD"));

		assertNotEquals(0, exitCode);
	}
}
