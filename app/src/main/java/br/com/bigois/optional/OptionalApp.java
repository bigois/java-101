package br.com.bigois.optional;

import util.Person;

public class OptionalApp {
    public static void main(String[] args) {
        Person person = new Person("Guilherme", "Bigois");
        System.out.println("First name: " + person.getFirstName());
        System.out.println("Middle name: " + person.getMiddleName().orElse(""));
        System.out.println("Last Name: " + person.getLastName());
    }
}
