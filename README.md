# Java for Testers — Exercises

Hands-on exercises for the **Java for Testers** course by [Serenity Dojo](https://www.serenity-dojo.com).

The course has 16 modules. After most lessons there is a short exercise: you write a little Java code, run the tests,
and watch them go from red to green.

## Contents

- [Branches](#branches)
- [Before you start](#before-you-start)
- [Getting started](#getting-started)
- [How the exercises work](#how-the-exercises-work)
- [Running the tests](#running-the-tests)
- [Exercise map](#exercise-map)
- [Project layout](#project-layout)
- [Getting stuck](#getting-stuck)

## Branches

| Branch | What it contains | Use it to |
|---|---|---|
| **`starter`** | The exercises, ready for you to complete. Most tests fail until you have done the work. | Do the exercises |
| **`solutions`** | The same project, with every exercise completed. All tests pass. | Compare your work, or get unstuck |

Both branches have exactly the same layout, so a file in one branch is in the same place in the other.

## Before you start

You will need:

- **Java 21 or newer** (JDK). The _Setting Up Java_ lesson (1.2) shows you how to install it.
- **Maven 3.9 or newer**, to build the project and run the tests from the command line. Your IDE can also do this for you.
- **A Java IDE**. [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/) is recommended, and is used in the lessons.
- **Git**.

Check that your tools are installed:

```
java -version
mvn -version
```

## Getting started

1. Clone the repository, and switch to the `starter` branch:

   ```
   git clone <the URL of this repository>
   cd java-for-testers
   git checkout starter
   ```

2. Open the project folder in your IDE. Choose "open as a Maven project" if your IDE asks. The first time, it will download the
   libraries that the project needs, which can take a minute.

3. Check that everything works. Run the setup test from the command line:

   ```
   mvn test -Dtest=JavaSetupTest
   ```

   You should see `BUILD SUCCESS`. (This is Exercise 1.2.)

4. Open [`exercises/module-01-first-steps/README.md`](exercises/module-01-first-steps/README.md) and begin!

**Tip:** make a copy of your work on your own branch, or commit often, so that you can always see what you have changed
(`git diff`), and so that you can compare your work with the `solutions` branch.

## How the exercises work

Every module has a folder under [`exercises/`](exercises) containing a README, with the instructions for each exercise:
the lesson it belongs to, the files to edit, what to do, hints, and the command that checks your work.

The code is in one Maven project. Each module has its own Java package, so you can find the files you need quickly:
`com.serenitydojo.module03classes`, `com.serenitydojo.module04methods` and so on.
Application code is under `src/main/java`, and the tests are under `src/test/java`.

The exercises come in four styles. The module README tells you which style you are looking at.

| Style | What you see | What you do |
|---|---|---|
| **Fill in the blanks** | A test with a `// TODO` comment, and a placeholder value such as `int age = 0;` | Replace the placeholder with your own code, so that the test passes |
| **Implement the class** | A class with methods that return dummy values (such as `return 0;`), and a complete test | Write the real code, so that the test passes |
| **Create the class** | An empty class, and a test that starts with `fail("TODO ...")` and has the real test code in comments | Write the class. Then delete the `fail(...)` line and uncomment the test |
| **Write the tests** | A test that starts with `fail("TODO ...")` and a comment saying what to check | Write the test or assertion, and delete the `fail(...)` line |

A few exercises (5.1, 15.6, 15.7 and 15.10) are about the structure of your code or tests. They come with a "checker" test
that looks at your code and tells you whether you have followed the instructions.

> **You should not edit the tests unless the exercise says so.** The tests describe what the code must do.
> If a test fails, the aim is to fix the code, not to change the test.

## Running the tests

### In your IDE

Click the green arrow next to a test method, or next to a test class, to run it. The IDE shows which tests pass or fail,
and the reason for each failure.

### From the command line

Run the commands from the root folder of the project (the one that contains `pom.xml`).

| To run… | Command |
|---|---|
| One test class | `mvn test -Dtest=WhenUsingDataTypesTest` |
| One test method | `mvn test -Dtest=WhenUsingDataTypesTest#declaringAnInt` |
| All the tests of one module | `mvn test -Dtest="**/module02datatypes/*"` |
| Every test in the project | `mvn test` |
| Only the tests with a tag (Module 15) | `mvn test -Dgroups=smoke` |

**Windows PowerShell:** wrap the whole option in quotes, e.g. `mvn test "-Dtest=**/module02datatypes/*"`.

On the `starter` branch, `mvn test` will report failures: that is expected, because the exercises are not done yet.
Run the tests for the exercise that you are working on.

## Exercise map

| Module | Topic | Lessons | Exercises | Code package |
|---|---|---|---|---|
| 1 | [Your First Steps With Java](exercises/module-01-first-steps/README.md) | 1.1 – 1.3 | 1.2, 1.3 | `module01firststeps` |
| 2 | [Java Data Types and Variables](exercises/module-02-data-types-and-variables/README.md) | 2.1 – 2.4 | 2.1, 2.2, 2.3, 2.4 | `module02datatypes` |
| 3 | [Java Classes and Objects](exercises/module-03-classes-and-objects/README.md) | 3.1 – 3.3 | 3.2, 3.3 | `module03classes` |
| 4 | [Java Fields and Methods](exercises/module-04-fields-and-methods/README.md) | 4.1 – 4.3 | 4.1, 4.2, 4.3 | `module04methods` |
| 5 | [Java Language Conventions](exercises/module-05-language-conventions/README.md) | 5.1 | 5.1 | `module05conventions` |
| 6 | [Inheritance and Polymorphism](exercises/module-06-inheritance-and-polymorphism/README.md) | 6.1 – 6.2 | 6.1, 6.2 | `module06inheritance` |
| 7 | [Conditional Logic](exercises/module-07-conditional-logic/README.md) | 7.1 – 7.2 | 7.1, 7.2 | `module07conditionals` |
| 8 | [Switches and Enums](exercises/module-08-switches-and-enums/README.md) | 8.1 – 8.2 | 8.1a, 8.1b, 8.2 | `module08enums` |
| 9 | [Java Collections](exercises/module-09-java-collections/README.md) | 9.1 – 9.3 | 9.1, 9.2, 9.3 | `module09collections` |
| 10 | [Maps](exercises/module-10-maps/README.md) | 10.1 – 10.4 | 10.1-10.2, 10.3, 10.4 | `module10maps` |
| 11 | [Making Assertions in Java](exercises/module-11-making-assertions/README.md) | 11.1 – 11.3 | 11.1, 11.2, 11.3 | `module11assertions` |
| 12 | [Using Interfaces](exercises/module-12-using-interfaces/README.md) | 12.1 | 12.1, 12.2 | `module12interfaces` |
| 13 | [Working with Exceptions](exercises/module-13-working-with-exceptions/README.md) | 13.1 – 13.4 | 13.1-13.2, 13.3, 13.4 | `module13exceptions` |
| 14 | [Advanced Java Topics](exercises/module-14-advanced-java-topics/README.md) | 14.1 – 14.7 | 14.1 – 14.7 | `module14advanced` |
| 15 | [Introduction to Unit Testing with JUnit 6](exercises/module-15-unit-testing-with-junit-6/README.md) | 15.1 – 15.12 | 15.1-15.2, 15.3 – 15.12 | `module15junit` |
| 16 | [Capstone Project — The Java Fruit Shop](exercises/module-16-capstone-java-fruit-shop/README.md) | 16.1 | 16.1 | `module16fruitshop` |

## Project layout

```
java-for-testers
├── pom.xml                     Maven build: Java 21, JUnit 6, AssertJ and Apache POI
├── README.md                   This file
├── exercises/                  The instructions: one folder (and README) for each module
│   ├── module-01-first-steps/
│   ├── module-02-data-types-and-variables/
│   └── ...
└── src
    ├── main/java/com/serenitydojo/
    │   ├── module01firststeps/     Code you write or complete
    │   ├── module02datatypes/
    │   └── ...
    └── test/
        ├── java/com/serenitydojo/
        │   ├── module01firststeps/ The tests that check your code
        │   └── ...
        └── resources/              Test data, such as the Excel file used in Module 14
```

## Getting stuck

1. **Read the failure message.** It shows what the test expected, and what it got.
2. **Read the hints** in the exercise README, and the comments in the code.
3. **Re-watch the lesson**, and try the examples in the video yourself.
4. **Take a break**, and try again. It often helps.
5. **Look at the solution** on the `solutions` branch when you have genuinely tried. You can compare a file with:

   ```
   git diff starter solutions -- src/main/java/com/serenitydojo/module04methods/Cat.java
   ```

   or browse the `solutions` branch on GitHub. Try to understand the solution rather than copy it, and then close it and write it again yourself.

Common problems:

| Problem | Solution |
|---|---|
| `release version 21 not supported` | Your JDK is older than 21. Install JDK 21 or newer, and make sure that `java -version` and `mvn -version` both report it |
| `mvn` is not recognised | Maven is not installed, or its `bin` folder is not on your `PATH` |
| The IDE shows red underlines everywhere | Reload the Maven project (in IntelliJ: _Maven_ tool window, then the _Reload All Maven Projects_ button) |
| `No tests matching pattern ... were executed` | Check the spelling of the test class name, and that you are in the project root folder |
| A test is not found in the IDE | Make sure that the project SDK is set to Java 21 (_File > Project Structure_) |
