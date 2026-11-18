# Module 1 — Your First Steps With Java

**Lessons**

- 1.1 Course Introduction & Roadmap (no exercise)
- 1.2 Setting Up Java (Windows)
- 1.3 Writing Your First Java Code

In this module you set up your tools, and write your first Java code.

**Run all the tests for this module**

```
mvn test -Dtest="**/module01firststeps/*"
```

The code for this module is in the `com.serenitydojo.module01firststeps` package, under `src/main/java` and `src/test/java`.

---

## Exercise 1.2 — Check your Java setup

_Lesson 1.2_

**Your task**

Make sure your machine is ready for the course.

1. Install a JDK, version 21 or newer, and Maven (see the setup lesson).
2. Open this project in your IDE (IntelliJ IDEA is recommended).
3. Run `JavaSetupTest`, either with the green arrow next to the test in your IDE, or on the command line.

You do not need to change any code in this exercise.

**Check your work**

```
mvn test -Dtest=JavaSetupTest
```

**Done when:** `JavaSetupTest` passes and prints the version of Java it is running on.

---

## Exercise 1.3 — Write your first Java code

_Lesson 1.3_

**Edit:** [`HelloWorldWriter.java`](../../src/main/java/com/serenitydojo/module01firststeps/HelloWorldWriter.java)

**Your task**

Open `HelloWorldWriter` and complete its two methods:

- `greeting()` returns the text `Hello, World!`
- `greet(String name)` returns a greeting for a particular person, e.g. `greet("Sarah")` returns `Hello, Sarah!`

Then run the `main` method of `HelloWorldWriter` to see the greetings printed in the console.

**Hints**

- Text values in Java are written in double quotes, e.g. `"Hello"`.
- You can join text together with the `+` operator.

**Check your work**

```
mvn test -Dtest=HelloWorldWriterTest
```

**Done when:** All the tests in `HelloWorldWriterTest` pass.

---
