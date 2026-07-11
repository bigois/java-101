package br.com.bigois.httprequest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class HttpRequestApp {
    public static void main(String[] args) {
        String title = getMovieTitle();
        URI uri = buildUri(title);
        String response = sendRequest(uri);
        IMDbMovie movie = parseResponse(response);

        System.out.println(movie);
    }

    // First, we need to get the API key
    public static String getApiKey() {
        return "afc8871";
    }

    // Next, we need to get the movie title from the user
    public static String getMovieTitle() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the movie title to search for: ");
            String movie = sc.nextLine();

            if (movie.isEmpty()) {
                System.out.println("Movie title cannot be empty. Please try again or type 'exit' to quit.");
                return getMovieTitle();
            }

            if (movie.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the application.");
                // Finalizes the program execution with a status code of 0, indicating
                // successful termination.
                System.exit(0);
            }

            return movie;
        }
    }

    // Then, we need to build the URI for the HTTP request
    public static URI buildUri(String title) {
        String apiKey = getApiKey();
        return URI.create("https://www.omdbapi.com/?t=" + title + "&apikey=" + apiKey);
    }

    // Next, we need to send the HTTP request and get the response
    public static String sendRequest(URI uri) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(uri).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error sending HTTP request: " + e.getMessage(), e);
        }
    }

    // Finally, we need to parse the response and display the movie information
    public static IMDbMovie parseResponse(String response) {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        return gson.fromJson(response, IMDbMovie.class);
    }
}
