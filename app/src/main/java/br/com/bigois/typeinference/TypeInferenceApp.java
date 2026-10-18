package br.com.bigois.typeinference;

import java.util.HashMap;

@SuppressWarnings({"unused", "MismatchedQueryAndUpdateOfCollection", "Convert2Diamond"})
public class TypeInferenceApp {
	// var cannot declare fields; it is allowed only for local variables with an initializer
	// var name = "Guilherme";

	public static void main(String[] args) {
		// Since Java 10, var infers the local variable's type from its initializer
		var name = "Guilherme";

		// Before Java 7, constructor type arguments had to be repeated explicitly
		HashMap<Integer, String> planetMap = new HashMap<Integer, String>();
		planetMap.put(1, "Mercury");
		planetMap.put(2, "Venus");

		// Since Java 7, the diamond operator (<>) infers constructor type arguments from the declaration
		HashMap<String, Integer> peopleMap = new HashMap<>();
		peopleMap.put("Alice", 30);
		peopleMap.put("Bob", 25);

		// With var, explicit constructor type arguments make the inferred type HashMap<String, String>
		var cityMap = new HashMap<String, String>();
		cityMap.put("New York", "USA");
		cityMap.put("New Zealand", "USA");

		// With var and an empty diamond, no specific key or value types are provided
		// The inferred type is HashMap<Object, Object>, so these mixed types are accepted
		var countryMap = new HashMap<>();
		countryMap.put("USA", 1);
		countryMap.put(2, "Canada");
	}
}
