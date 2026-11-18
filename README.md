# Java for Testers — Exercises

Hands-on exercises for the **Java for Testers** course by [Serenity Dojo](https://www.serenity-dojo.com).

> **You are on the `master` branch, which does not contain the exercises.**
> Check out the `starter` branch to do them (see below).

## How the repository is organised

The course has 16 modules, and the exercises for all of them live in one Maven project (Java 21, JUnit 6, AssertJ).
Each module has its own Java package (`module01firststeps`, `module02datatypes`, … `module16fruitshop`) and its own
instructions README under `exercises/`.

The exercises are provided on two branches, which have exactly the same layout:

| Branch | What it contains | Use it to |
|---|---|---|
| **`starter`** | The exercises, ready to complete. Most tests fail until you have done the work. | Do the exercises |
| **`solutions`** | The same project with every exercise completed. All tests pass. | Compare your work, or get unstuck |
| `master` | An empty project skeleton, and this README. | Nothing — start from `starter` |

## Getting started

1. Make sure you have **Java 21 or newer**, **Maven 3.9 or newer**, **Git** and a Java IDE
   ([IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/download/) is recommended).
   The _Setting Up Java_ lesson (Module 1, lesson 2) walks you through this.

2. Clone the repository and switch to the `starter` branch:

   ```
   git clone <the URL of this repository>
   cd java-for-testers
   git checkout starter
   ```

3. Open the project in your IDE as a Maven project, and follow the instructions in
   `exercises/module-01-first-steps/README.md` on the `starter` branch.

The `README.md` on the `starter` and `solutions` branches has the full instructions: how the different styles of
exercise work, how to run the tests from your IDE and from the command line, a map of all the modules, and troubleshooting tips.

## Comparing your work with the solutions

When you have genuinely tried an exercise, you can compare your file with the solution:

```
git diff starter solutions -- src/main/java/com/serenitydojo/module04methods/Cat.java
```

or browse the `solutions` branch on GitHub.
