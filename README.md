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

- **interfaces** — interfaces and functional programming
- **streams** — data processing with the Stream API
- **optional** — optional values with `Optional`
- **comparable** — object comparison and sorting
- **exception** — exception handling
- **autocloseable** — resource management with `AutoCloseable`
- **methodreference** — method references
- **polymorphism** — object-oriented polymorphism
- **mapper** — object mapping
- **io** — input and output operations
- **scanner** — console input
- **httprequest** — HTTP communication
- **jsonschema** — JSON validation
- **openai** — OpenAI API integration
- **springboot** — application development with Spring Boot
- **jpa** — data persistence with Spring Data JPA
- **web** — web development with Spring Boot

Each package is self-contained and can be explored independently.

## Running it

```bash
./gradlew build
./gradlew test
```

## Purpose

Serves as a personal study reference, with no fixed roadmap — new topics and refactors get added as learning progresses.
