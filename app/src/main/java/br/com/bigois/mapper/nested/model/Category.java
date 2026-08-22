
package br.com.bigois.mapper.nested.model;

import java.util.List;

public record Category(
		Long id,
		String name,
		int displayOrder,
		List<Item> items
) {
}
