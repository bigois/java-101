package br.com.bigois.io.read.inputstream;

import br.com.bigois.io.FileReaderService;
import org.json.JSONObject;

import java.io.IOException;

public class InputStreamApp {
	public static void main(String[] args) {
		try {
			String data = FileReaderService.readWithInputStream("sample.json");
			JSONObject json = new JSONObject(data);

			System.out.println(json);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
	}
}
