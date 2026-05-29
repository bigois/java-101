package br.com.bigois.autocloseable;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import br.com.bigois.optional.Person;

public class ReportData {
    private List<Person> personList;
    private List<String> columns;
    private Path reportPath;

    public ReportData() {
        this.personList = initiatePersonList();
        this.columns = initiateColumns();
        this.reportPath = initiateReportPath();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public List<String> getColumns() {
        return columns;
    }

    public Path getReportPath() {
        return reportPath;
    }

    private List<Person> initiatePersonList() {
        List<Person> people = new ArrayList<Person>();

        people.add(new Person("Guilherme", "Bigois"));
        people.add(new Person("Danna", "Bigois"));
        people.add(new Person("Zenaide", "Ferreira", "Bigois"));
        people.add(new Person("Paulo", "Fernando", "Bigois"));
        people.add(new Person("Bernardo", "Bigois"));
        people.add(new Person("Henrique", "Bigois"));

        return people;
    }

    public List<String> initiateColumns() {
        List<String> columns = new ArrayList<>();

        columns.add("First name");
        columns.add("Middle name");
        columns.add("Last name");

        return columns;
    }

    private Path initiateReportPath() {
        Path folder = Paths.get("C:\\sk-java\\git\\java-101\\docs");
        Path report = folder.resolve("people-report.xlsx");

        return report;
    }
}
