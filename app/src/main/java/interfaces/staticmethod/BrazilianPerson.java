package interfaces.staticmethod;

public class BrazilianPerson implements Greeting {
    @Override
    public String sayHello(String phrase) {
        return "Olá! " + phrase;
    }
}
