package br.com.bigois.httprequest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.com.bigois.MainAppRunner;

class HttpRequestAppTest {
    @Test
    void shouldRunMainAndExitWithoutCallingApi() throws Exception {
        int exitCode = MainAppRunner.runInNewProcess(HttpRequestApp.class, "exit%n".formatted());

        assertEquals(0, exitCode);
    }
}
