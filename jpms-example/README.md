# JPMS: exported API and internal implementation

This example uses two Gradle subprojects, each with its own Java source root
and `module-info.java`. Use JDK 21 and reload the Gradle project in IntelliJ IDEA.

## Responsibilities

1. **Provider — `com.organacode`**: exports `com.organacode.financial.util`.
   `FinancialUtils` can call `FinancialService` because both are in this module.
2. **Consumer — `br.com.bigois.jpms`**: requires `com.organacode` and calls
   `FinancialUtils`. It cannot directly access `FinancialService` because
   `com.organacode.financial.service` is not exported.

The provider descriptor is at `organacode/src/main/java/module-info.java`.
The consumer descriptor is at `jpms-example/src/main/java/module-info.java`.
Both paths are relative to the repository root.

## Run the allowed call

From the repository root in PowerShell:

```powershell
.\gradlew.bat :jpms-example:run
```

Expected output:

```text
FinancialUtils is running!
```

## Try the blocked call

In `jpms-example/src/main/java/br/com/bigois/jpms/JPMSApp.java`, uncomment the
`FinancialService` import and the two commented statements that use it. Run:

```powershell
.\gradlew.bat :jpms-example:compileJava
```

Compilation must fail: `com.organacode.financial.service` is not visible because
module `com.organacode` does not export it. Comment those three lines again to
restore the working example.

## Learning Notes

- `implementation project(':organacode')` makes the Gradle dependency available.
- `requires com.organacode` declares the consumer module's readability.
- `exports` determines which provider packages are accessible to other modules.
- A public class in a package that is not exported is still internal to its module.
- Exporting one package does not export its subpackages.
- Omitting all exports would hide every provider package from the consumer.
- Module rules require compilation and execution on the module path. The
  application plugin's `mainModule` configures modular execution here.
- Gradle subprojects are an organization choice; JPMS itself does not require Gradle.

References: [Gradle modular libraries](https://docs.gradle.org/current/userguide/java_library_plugin.html#sec:java_library_modular)
and [modular applications](https://docs.gradle.org/current/userguide/application_plugin.html#sec:application_modular).
