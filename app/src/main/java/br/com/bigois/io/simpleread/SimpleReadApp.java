package br.com.bigois.io.simpleread;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.json.JSONObject;

public class SimpleReadApp {
    public static void main(String[] args) {
        try (InputStream inputStream = SimpleReadApp.class.getResourceAsStream("/sample.json")) {
            if (inputStream == null) {
                throw new IOException("Resource not found: sample.json");
            }

            byte[] bytes = inputStream.readAllBytes();
            String string = new String(bytes, StandardCharsets.UTF_8);
            JSONObject json = new JSONObject(string);

            System.out.println(json);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
