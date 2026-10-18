package br.com.bigois.consumer;

import java.util.Comparator;

public class OrderByLength implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		// noinspection UseCompareMethod
		if (s1.length() < s2.length()) {
			return 1;
		} else if (s1.length() > s2.length()) {
			return -1;
		} else {
			return 0;
		}

		// return Integer.compare(o1.length(), o2.length());
	}
}
