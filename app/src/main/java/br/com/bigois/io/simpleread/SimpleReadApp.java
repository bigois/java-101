package br.com.bigois.io.simpleread;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.json.JSONObject;

public class SimpleReadApp {
    public static void main(String[] args) {
        Path filePath = Paths.get("app", "src", "test", "resources", "sample.json");

        try {
            byte[] bytes = Files.readAllBytes(filePath);
            String string = new String(bytes);
            JSONObject json = new JSONObject(string);

            System.out.println(json);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
