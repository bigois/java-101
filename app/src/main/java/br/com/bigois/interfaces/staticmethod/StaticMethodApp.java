
package br.com.bigois.interfaces.staticmethod;

public class StaticMethodApp {
	public static void main(String[] args) {
		Greeting brazilianPerson = new BrazilianPerson();
		Greeting americanPerson = new AmericanPerson();
		Greeting silentPerson = Greeting.silence();

		System.out.println("Brazilian says: " + brazilianPerson.sayHello("Tudo bem?"));
		System.out.println("American says: " + americanPerson.sayHello("How are you?"));
		System.out.println("Silent says: " + silentPerson.sayHello("Is anyone there?"));
	}
}
