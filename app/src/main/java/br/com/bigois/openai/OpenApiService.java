package br.com.bigois.openai;

import com.openai.client.OpenAIClient;
import com.openai.client.okhttp.OpenAIOkHttpClient;
import com.openai.models.ChatModel;
import com.openai.models.ReasoningEffort;
import com.openai.models.chat.completions.ChatCompletion;
import com.openai.models.chat.completions.ChatCompletionCreateParams;

public class OpenApiService {
	private final String openApiKey;
	private final OpenAIClient client;

	public OpenApiService() {
		openApiKey = System.getenv("OPENAI_API_KEY");
		if (openApiKey == null || openApiKey.isEmpty()) {
			throw new RuntimeException("Environment variable OPENAI_API_KEY must be set");
		}

		client = OpenAIOkHttpClient.fromEnv();
	}

	public String getOpenApiKey() {
		return openApiKey;
	}

	public String sendPrompt(String prompt) {
		ChatCompletionCreateParams params = ChatCompletionCreateParams.builder()
				.model(ChatModel.GPT_5_4_MINI)
				.verbosity(ChatCompletionCreateParams.Verbosity.LOW)
				.reasoningEffort(ReasoningEffort.LOW)
				.maxCompletionTokens(1000)
				.addUserMessage(prompt)
				.build();
		ChatCompletion chatCompletion = client.chat().completions().create(params);
		return chatCompletion.choices().getFirst().message().content().orElse("");
	}

	public String translateToBrazilianPortuguese(String text) {
		String prompt = "Translate the following text to Brazilian Portuguese: " + text;
		return sendPrompt(prompt);
	}
}
