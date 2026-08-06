package br.com.bigois.streams;

import br.com.bigois.io.FileReaderService;
import br.com.bigois.mapper.EntityMapper;
import br.com.bigois.mapper.nested.model.Menu;
import org.eclipse.collections.impl.collector.BigDecimalSummaryStatistics;

import java.io.IOException;
import java.math.RoundingMode;

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

		BigDecimalSummaryStatistics priceStatistics = streamService.getPriceStatistics();
		System.out.println("\nPrice statistics:");
		System.out.println("- Average: " + priceStatistics.getAverage().setScale(2, RoundingMode.HALF_UP));
		System.out.println("- Max: " + priceStatistics.getMax());
		System.out.println("- Min: " + priceStatistics.getMin());
		System.out.println("- Sum: " + priceStatistics.getSum());
	}
}
