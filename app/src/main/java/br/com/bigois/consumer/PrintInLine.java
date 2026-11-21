package br.com.bigois.consumer;

import java.util.function.Consumer;

public class PrintInLine implements Consumer<String> {
	public static void printAsUnorderedList(String s) {
		System.out.println("- " + s);
	}

	@Override
	public void accept(String s) {
		System.out.println("Printing: " + s);
	}
}
