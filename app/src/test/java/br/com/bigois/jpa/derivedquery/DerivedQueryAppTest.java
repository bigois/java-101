package br.com.bigois.jpa.derivedquery;

import br.com.bigois.MainAppRunner;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class DerivedQueryAppTest {
	@Test
	void shouldFailFastWithoutPassword() throws Exception {
		assertNotEquals(0, MainAppRunner.runInNewProcess(DerivedQueryApp.class, "", null, Set.of("DB_PASSWORD")));
	}
}
