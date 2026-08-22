package br.com.bigois.mapper.nested;

import br.com.bigois.io.FileReaderService;
import br.com.bigois.mapper.EntityMapper;
import br.com.bigois.mapper.nested.model.Menu;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

public class NestedMapperApp {
	public static void main(String[] args) {
		EntityMapper mapper = new EntityMapper();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		try {
			String data = FileReaderService.readWithInputStream("menu.json");
			Menu menu = mapper.mapEntity(data, Menu.class);
			System.out.println(gson.toJson(menu));
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
