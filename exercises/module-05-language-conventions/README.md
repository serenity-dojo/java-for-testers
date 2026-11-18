# Module 5 — Java Language Conventions

**Lessons**

- 5.1 Java Conventions

Java developers follow a set of naming conventions so that everybody can read each other's code.

**Run all the tests for this module**

```
mvn test -Dtest="**/module05conventions/*"
```

The code for this module is in the `com.serenitydojo.module05conventions` package, under `src/main/java` and `src/test/java`.

---

## Exercise 5.1 — Fix the naming conventions

_Lesson 5.1_

**Edit:** [`OrderSummary.java`](../../src/main/java/com/serenitydojo/module05conventions/OrderSummary.java)

**Your task**

`OrderSummary` works, but it breaks the naming conventions. Rename its fields, constant and methods until
`WhenFollowingJavaConventionsTest` passes. The conventions are:

| Element | Convention | Example |
|---|---|---|
| Classes | `PascalCase` | `OrderSummary` |
| Methods and fields | `camelCase` | `getTotalPrice`, `itemCount` |
| Constants (`static final`) | `UPPER_SNAKE_CASE` | `MAX_ITEMS` |
| Packages | `lowercase` | `com.serenitydojo` |
| Methods returning a boolean | start with `is`, `has` or `can` | `isFull()` |

Fields should also be `private`. Use your IDE's rename refactoring (`Shift+F6` in IntelliJ) so that every usage is updated.

**Hints**

- Do not change the behaviour of the class - only the names and visibility.

**Check your work**

```
mvn test -Dtest=WhenFollowingJavaConventionsTest
```

**Done when:** All the tests in `WhenFollowingJavaConventionsTest` pass.

---
