# Module 2 — Java Data Types and Variables

**Lessons**

- 2.1 Understanding Java Data Types
- 2.2 Working with Whole Numbers
- 2.3 Working with Floating Point Decimals
- 2.4 Working with Strings

These exercises are all in the same style: each test declares a variable and checks its value. Read the `TODO` comment above each variable and replace the placeholder value with your own code. The test fails until the value is right.

**Run all the tests for this module**

```
mvn test -Dtest="**/module02datatypes/*"
```

The code for this module is in the `com.serenitydojo.module02datatypes` package, under `src/main/java` and `src/test/java`.

---

## Exercise 2.1 — Understanding Java data types

_Lesson 2.1_

**Edit:** [`WhenUsingDataTypesTest.java`](../../src/test/java/com/serenitydojo/module02datatypes/WhenUsingDataTypesTest.java)

**Your task**

Declare variables of each of the basic Java types - `int`, `long`, `double`, `boolean`, `char` and `String` -
and a constant, using the values described in the `TODO` comments.

**Hints**

- `long` values need an `L` at the end, e.g. `8_000_000_000L`.
- `char` values use single quotes (`'A'`), while `String` values use double quotes (`"A"`).

**Check your work**

```
mvn test -Dtest=WhenUsingDataTypesTest
```

**Done when:** All the tests in `WhenUsingDataTypesTest` pass.

---

## Exercise 2.2 — Working with whole numbers

_Lesson 2.2_

**Edit:** [`WhenWorkingWithWholeNumbersTest.java`](../../src/test/java/com/serenitydojo/module02datatypes/WhenWorkingWithWholeNumbersTest.java)

**Your task**

Practise arithmetic with `int` and `long`: operator precedence, integer division and the remainder (`%`),
`++` and `+=`, integer overflow, `Integer.parseInt()` and the `Math` class.

**Hints**

- Integer division throws away the remainder: `17 / 5` is `3`. The `%` operator gives the remainder.
- An `int` cannot hold numbers larger than `Integer.MAX_VALUE`. Convert to `long` _before_ you add.

**Check your work**

```
mvn test -Dtest=WhenWorkingWithWholeNumbersTest
```

**Done when:** All the tests in `WhenWorkingWithWholeNumbersTest` pass.

---

## Exercise 2.3 — Working with floating point decimals

_Lesson 2.3_

**Edit:** [`WhenWorkingWithDecimalsTest.java`](../../src/test/java/com/serenitydojo/module02datatypes/WhenWorkingWithDecimalsTest.java)

**Your task**

Practise working with `double` values: calculating prices, why `7 / 2` is not `3.5`,
why `0.1 + 0.2` is not exactly `0.3`, rounding, casting and `BigDecimal`.

**Hints**

- Floating point numbers are approximate, so we compare them within a small tolerance, with `isCloseTo(expected, within(0.0001))`.

**Check your work**

```
mvn test -Dtest=WhenWorkingWithDecimalsTest
```

**Done when:** All the tests in `WhenWorkingWithDecimalsTest` pass.

---

## Exercise 2.4 — Working with strings

_Lesson 2.4_

**Edit:** [`WhenWorkingWithStringsTest.java`](../../src/test/java/com/serenitydojo/module02datatypes/WhenWorkingWithStringsTest.java)

**Your task**

Explore the methods of the `String` class: `length()`, `toUpperCase()`, `substring()`, `indexOf()`,
`contains()`, `replace()`, `split()`, `String.join()`, `trim()`, `equals()` and `StringBuilder`.

**Hints**

- Use your IDE's code completion (press `.` after a String variable) to discover the available methods.
- Always compare the _content_ of strings with `equals()`, never with `==`.

**Check your work**

```
mvn test -Dtest=WhenWorkingWithStringsTest
```

**Done when:** All the tests in `WhenWorkingWithStringsTest` pass.

---
