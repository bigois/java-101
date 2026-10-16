# Command Pattern

Encapsulates a request in an object so the invoker can execute commands through a shared interface.

## Responsibilities

1. **Client (`MenuClient`):** creates the objects, connects each command to the receiver, and sends the selected command to the invoker.
2. **Invoker (`CommandInvoker`):** calls `execute()` without knowing the operation's details.
3. **Command (`Command` interface):** defines the shared `execute()` method.
4. **Concrete Commands (`TimeCommand`, `DateCommand`, `DayOfWeekCommand`):** hold a reference to the receiver and delegate to `showTime()`, `showDate()`, or `showDayOfWeek()`.
5. **Receiver (`DateTimeReceiver`):** performs the operations to retrieve and display the time, date, and day of the week.
6. **Application Entry Point (`CommandApp`):** starts the menu and closes it using `try-with-resources`.

## Pattern Roles

```mermaid
flowchart LR
    Client --> Invoker
    Invoker --> ConcreteCommand["Concrete Command"]
    ConcreteCommand --> Receiver
```

## Implementation Flow

```mermaid
flowchart LR
    MenuClient -->|executeCommand| CommandInvoker
    CommandInvoker -->|execute| TimeCommand
    TimeCommand -->|showTime| DateTimeReceiver
```
