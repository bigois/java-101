package br.com.bigois.interfaces.staticmethod;

public interface Greeting {
    String sayHello(String phrase);

    static Greeting silence() {
        return phrase -> "...";
    }
}
