package br.com.bigois.staticfactory;

import java.util.*;

@SuppressWarnings({"unused", "Java9CollectionFactory"})
public class StaticFactoryApp {
	public static void main(String[] args) {
		// AVAILABLE BEFORE JAVA 9: Collections.unmodifiableList() returns an unmodifiable view of the backing list.
		// Changes made directly to fruits are reflected in unmodifiableFruits.
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		List<String> unmodifiableFruits = Collections.unmodifiableList(fruits);

		// SINCE JAVA 9: List.of() creates an unmodifiable list that rejects null elements and allows duplicates.
		List<String> names = List.of("Alice", "Bob", "Charlie");

		// AVAILABLE BEFORE JAVA 9: Collections.unmodifiableSet() returns an unmodifiable view of the backing set.
		// Changes made directly to colors are reflected in immutableColors; the view preserves the TreeSet's sorted order.
		Set<String> colors = new TreeSet<>();
		colors.add("Blue");
		colors.add("Green");
		colors.add("Red");
		Set<String> immutableColors = Collections.unmodifiableSet(colors);

		// SINCE JAVA 9: Set.of() creates an unmodifiable set that rejects nulls and duplicate elements.
		// Its iteration order is unspecified.
		Set<String> planets = Set.of("Mercury", "Venus", "Earth");

		// AVAILABLE BEFORE JAVA 9: Collections.unmodifiableMap() returns an unmodifiable view of the backing map.
		// Changes made directly to ages are reflected in immutableAges.
		Map<String, Integer> ages = new HashMap<>();
		ages.put("Alice", 30);
		ages.put("Bob", 25);
		Map<String, Integer> immutableAges = Collections.unmodifiableMap(ages);

		// SINCE JAVA 9: Map.of() creates an unmodifiable map that rejects null keys/values and duplicate keys.
		// Duplicate values are allowed, and iteration order is unspecified.
		Map<String, Integer> scores = Map.of("Alice", 90, "Bob", 80, "Charlie", 70);

		// Unmodifiable collections do not make their elements (or map keys/values) immutable.
	}
}
