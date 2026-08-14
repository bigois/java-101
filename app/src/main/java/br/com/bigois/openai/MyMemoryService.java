package br.com.bigois.openai;

import br.com.bigois.httprequest.HttpRequestApp;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class MyMemoryService {
	public MyMemoryService() {
	}

	public String translateToBrazilianPortuguese(String text) {
		String langPair = URLEncoder.encode("en|pt-br", StandardCharsets.UTF_8);
		URI uri = URI.create("https://api.mymemory.translated.net/get?q=" + URLEncoder.encode(text, StandardCharsets.UTF_8) + "&langpair=" + langPair);
		String responseBody = HttpRequestApp.sendRequest(uri);

		String translation = "";
		Gson gson = new Gson();
		JsonObject jsonResponse = gson.fromJson(responseBody, JsonObject.class);
		if (jsonResponse.has("responseData") && jsonResponse.getAsJsonObject("responseData").has("translatedText")) {
			translation = jsonResponse.getAsJsonObject("responseData").get("translatedText").getAsString();
		}

		return translation;
	}
}
