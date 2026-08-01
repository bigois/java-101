package br.com.bigois.streams;

import br.com.bigois.io.FileReaderService;
import br.com.bigois.mapper.EntityMapper;
import br.com.bigois.mapper.nested.model.Menu;

import java.io.IOException;

public class StreamsApp {
	public static void main(String[] args) throws IOException {
		EntityMapper mapper = new EntityMapper();
		String data = FileReaderService.readWithInputStream("menu.json");

		Menu menu = mapper.mapEntity(data, Menu.class);
		StreamService streamService = new StreamService(menu);

		System.out.println("All items:\n" + streamService.getAllItems());
		System.out.println("\nItems with price over 40:\n" + streamService.getItemsWithPriceOver40());
		System.out.println("\nTags to remove:\n" + streamService.getTagsToRemove());
		System.out.println("\nTop expensive items:\n" + streamService.getTopExpensiveItems());
		System.out.println("\nTime to prepare all items:\n" + streamService.getTimeToPrepareAllItems());
	}
}
