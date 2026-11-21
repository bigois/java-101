package br.com.bigois.jpa.viewrelation;

import br.com.bigois.MainAppRunner;
import org.junit.jupiter.api.Test;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ViewWithRelationAppTest {
	@Test
	void shouldFailFastWithoutPassword() throws Exception {
		assertNotEquals(0, MainAppRunner.runInNewProcess(ViewWithRelationApp.class, "", null, Set.of("DB_PASSWORD")));
	}
}
