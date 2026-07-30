package br.com.bigois.interfaces.staticmethod;

public interface Greeting {
	static Greeting silence() {
		return phrase -> "...";
	}

	String sayHello(String phrase);
}
