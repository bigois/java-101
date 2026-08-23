# java-101

This is a study project where I collect practical examples of language features and ecosystem libraries, from basics to more advanced topics, as I learn (or review) each subject.

It's not an application with a single purpose — it's a living repository, meant to keep growing with new packages and examples over time.

## Stack

- Java 21
- Gradle
- Spring Boot/Spring Data JPA
- JUnit 5
- Lombok
- Topic-specific libraries: Apache POI, Gson/Jackson, JSON Schema Validator, Eclipse Collections, OpenAI Java SDK

## Structure

Examples are organized by topic under `app/src/main/java/br/com/bigois`, each with its corresponding tests under `app/src/test`:

- **interfaces** — classic interfaces, default methods, static methods and functional interfaces
- **streams** — Stream API
- **optional** — `Optional`
- **comparable** — `Comparable`/sorting
- **exception** — custom exception handling
- **autocloseable** — `AutoCloseable`/try-with-resources
- **methodReference** — method references
- **polymorphism** — polymorphism
- **mapper** — object-to-object mapping (simple, DTO, nested)
- **io** — file reading and writing (`InputStream`, `FileWriter`)
- **scanner** — input via `Scanner`
- **httprequest** — HTTP calls
- **jsonschema** — JSON validation against a schema
- **openai** — integration with the OpenAI API
- **springboot** — sample Spring Boot application
- **jpa** — Spring Data JPA: simple insert, insert with relationship and views with relationship

Each package is self-contained and can be explored independently.

## Running it

```bash
./gradlew build
./gradlew test
```

## Purpose

Serves as a personal study reference, with no fixed roadmap — new topics and refactors get added as learning progresses.
