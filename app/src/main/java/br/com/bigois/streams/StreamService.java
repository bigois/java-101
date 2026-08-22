
package br.com.bigois.streams;

import br.com.bigois.mapper.nested.model.Item;
import br.com.bigois.mapper.nested.model.Menu;
import org.eclipse.collections.impl.collector.BigDecimalSummaryStatistics;
import org.eclipse.collections.impl.collector.Collectors2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamService {
	private final Menu menu;

	public StreamService(Menu menu) {
		this.menu = menu;
	}

	/*
	 * Step 1: create a mutable list to store all menu items
	 * Step 2: iterate over each category
	 * Step 3: add the items from each category to the same list
	 */
	public List<Item> getAllItems() {
		List<Item> allItems = new ArrayList<>();
		menu.categories().forEach(category -> {
			allItems.addAll(category.items());
		});

		return allItems;
	}

	/*
	 * Step 1: create a stream from the menu categories
	 * Step 2: use flatMap to turn multiple item lists into one item stream
	 * Step 3: keep only items with price greater than 40
	 * Step 4: count how many items matched the filter
	 */
	public Long getItemsWithPriceOver40() {
		return menu.categories().stream()
				.flatMap(category -> category.items().stream())
				.filter(item -> item.price().compareTo(new BigDecimal("40")) > 0)
				.count();
	}

	/*
	 * Step 1: create a stream from the menu categories
	 * Step 2: use flatMap to turn multiple item lists into one item stream
	 * Step 3: keep only unavailable items
	 * Step 4: use flatMap again to turn multiple tag lists into one tag stream
	 * Step 5: remove duplicate tags
	 * Step 6: collect the remaining tags into a list
	 */
	public List<String> getTagsToRemove() {
		return menu.categories().stream()
				.flatMap(category -> category.items().stream())
				.filter(item -> !item.available())
				.flatMap(item -> item.tags().stream())
				.distinct()
				.toList();
	}

	/*
	 * Step 1: create a stream from the menu categories
	 * Step 2: use flatMap to turn multiple item lists into one item stream
	 * Step 3: sort items by price from highest to lowest
	 * Step 4: keep only the first three items
	 * Step 5: collect the most expensive items into a list
	 */
	public List<Item> getTopExpensiveItems() {
		return menu.categories().stream()
				.flatMap(category -> category.items().stream())
				.sorted(Comparator.comparing(Item::price).reversed())
				.limit(3)
				.toList();
	}

	/*
	 * Step 1: create a stream from the menu categories
	 * Step 2: use flatMap to turn multiple item lists into one item stream
	 * Step 3: map each item to its preparation time
	 * Step 4: reduce the preparation times to a single value by summing them up
	 */
	public Integer getTimeToPrepareAllItems() {
		return menu.categories().stream()
				.flatMap(category -> category.items().stream())
				.map(Item::preparationTimeMinutes)
				.reduce(0, Integer::sum);
	}

	/*
	 * Step 1: get all menu items from every category
	 * Step 2: create a stream from the item list
	 * Step 3: collect price statistics using each item price
	 */
	public BigDecimalSummaryStatistics getPriceStatistics() {
		List<Item> menuItems = getAllItems();
		return menuItems.stream().collect(Collectors2.summarizingBigDecimal(Item::price));
	}
}
