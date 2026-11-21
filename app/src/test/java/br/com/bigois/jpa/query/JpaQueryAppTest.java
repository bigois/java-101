package br.com.bigois.jpa.query;

import br.com.bigois.MainAppRunner;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class JpaQueryAppTest {
	@Test
	void shouldFailFastWithoutPassword() throws Exception {
		assertNotEquals(0, MainAppRunner.runInNewProcess(JpaQueryApp.class, "", null, Set.of("DB_PASSWORD")));
	}
}
