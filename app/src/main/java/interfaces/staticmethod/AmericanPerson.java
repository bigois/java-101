package interfaces.staticmethod;

public class AmericanPerson implements Greeting {
    @Override
    public String sayHello(String phrase) {
        return "Hello! " + phrase;
    }
}
