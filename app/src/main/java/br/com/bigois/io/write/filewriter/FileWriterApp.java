package br.com.bigois.io.write.filewriter;

import java.io.File;
import java.io.FileWriter;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.bigois.httprequest.HttpRequestApp;

public class FileWriterApp {
    public static void main(String[] args) {
        Path filePath = Paths.get("docs", "matrix.json");
        File file = filePath.toFile();

        // Ensure the parent directories exist before writing to the file
        if (!file.getParentFile().exists()) {
            file.getParentFile().mkdirs();
        }

        // Check if the file already exists and print a message if it does
        if (file.exists()) {
            System.out.println("File already exists at " + file.getAbsolutePath());
            return;
        }

        try (FileWriter writer = new FileWriter(file)) {
            writer.write(getMatrixJson());
            System.out.println("File written successfully to " + file.getAbsolutePath());
        } catch (Exception e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static String getMatrixJson() {
        URI uri = HttpRequestApp.buildUri("Matrix");
        String body = HttpRequestApp.sendRequest(uri);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Object formattedJson = gson.fromJson(body, Object.class);
        return gson.toJson(formattedJson);
    }
}
