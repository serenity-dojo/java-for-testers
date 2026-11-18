# Module 11 — Making Assertions in Java

**Lessons**

- 11.1 Basic Assertions
- 11.2 Assertions about Strings
- 11.3 Assertions about collections

These exercises use [AssertJ](https://assertj.github.io/doc/), which makes assertions easy to read. Every assertion starts with `assertThat(...)`. Each test sets up some values and describes in a comment what to check. In the starter project, each test contains a `fail("TODO ...")` line: replace it with your assertion. Your IDE's code completion shows all the assertions that are available after `assertThat(value).`.

**Run all the tests for this module**

```
mvn test -Dtest="**/module11assertions/*"
```

The code for this module is in the `com.serenitydojo.module11assertions` package, under `src/main/java` and `src/test/java`.

---

## Exercise 11.1 — Basic assertions

_Lesson 11.1_

**Edit:** [`WhenWritingBasicAssertionsTest.java`](../../src/test/java/com/serenitydojo/module11assertions/WhenWritingBasicAssertionsTest.java)

**Your task**

Write assertions about numbers, booleans and `null` values.

**Hints**

- `isEqualTo()`, `isGreaterThan()`, `isBetween()`, `isCloseTo()`, `isTrue()`, `isNull()`.

**Check your work**

```
mvn test -Dtest=WhenWritingBasicAssertionsTest
```

**Done when:** All the tests in `WhenWritingBasicAssertionsTest` pass.

---

## Exercise 11.2 — Assertions about strings

_Lesson 11.2_

**Edit:** [`WhenWritingAssertionsAboutStringsTest.java`](../../src/test/java/com/serenitydojo/module11assertions/WhenWritingAssertionsAboutStringsTest.java)

**Your task**

Write assertions about text: equality, ignoring case, digits, prefixes, suffixes, patterns and length.

**Hints**

- `startsWith()`, `endsWith()`, `contains()`, `containsOnlyDigits()`, `isEqualToIgnoringCase()`, `matches()`.

**Check your work**

```
mvn test -Dtest=WhenWritingAssertionsAboutStringsTest
```

**Done when:** All the tests in `WhenWritingAssertionsAboutStringsTest` pass.

---

## Exercise 11.3 — Assertions about collections

_Lesson 11.3_

**Edit:** [`WhenWritingAssertionsAboutCollectionsTest.java`](../../src/test/java/com/serenitydojo/module11assertions/WhenWritingAssertionsAboutCollectionsTest.java)

**Your task**

Write assertions about lists and maps: contents, size, order, emptiness, conditions on every element and filtering.

**Hints**

- `contains()`, `containsExactly()` (in order), `containsExactlyInAnyOrder()`, `hasSize()`, `isEmpty()`, `allMatch()`.

**Check your work**

```
mvn test -Dtest=WhenWritingAssertionsAboutCollectionsTest
```

**Done when:** All the tests in `WhenWritingAssertionsAboutCollectionsTest` pass.

---
