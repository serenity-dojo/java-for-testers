# Module 15 — Introduction to Unit Testing with JUnit 6

**Lessons**

- 15.1 Introduction to JUnit 6
- 15.2 Installing The Sample Project
- 15.3 Your First JUnit 6 Test
- 15.4 The JUnit 6 Test Lifecycle
- 15.5 Writing Good Assertions
- 15.6 Naming Your Tests
- 15.7 Grouping Tests With @Nested
- 15.8 Data Driven Tests In JUnit 6
- 15.9 Testing Exceptions in JUnit 6
- 15.10 Using Tags In JUnit 6
- 15.11 JUnit 6 Comprehensive Exercise
- 15.12 JUnit 6 Comprehensive Exercise (part 2)

In this module you stop writing the code, and start writing the tests. The classes under test are already written: `Basket`, `PasswordValidator` and `ParkingFeeCalculator`. Read them first, so that you know what they should do. Several of these exercises (15.6, 15.7 and 15.10) are about the _structure_ of tests, so they come with an extra test which checks that you have restructured the tests correctly.

**Run all the tests for this module**

```
mvn test -Dtest="**/module15junit/*"
```

The code for this module is in the `com.serenitydojo.module15junit` package, under `src/main/java` and `src/test/java`.

---

## Exercise 15.1-15.2 — Introduction to JUnit 6, and installing the sample project

_Lessons 15.1 and 15.2_

**Your task**

Make sure that JUnit 6 is working in your project. Run `WhenSettingUpJUnitTest` from your IDE, and from the command line.
You do not need to change any code in this exercise.

**Check your work**

```
mvn test -Dtest=WhenSettingUpJUnitTest
```

**Done when:** Both tests pass.

---

## Exercise 15.3 — Your first JUnit 6 test

_Lesson 15.3_

**Edit:** [`WhenCreatingABasketTest.java`](../../src/test/java/com/serenitydojo/module15junit/WhenCreatingABasketTest.java)

**Read:** [`Basket.java`](../../src/main/java/com/serenitydojo/module15junit/Basket.java) (already complete)

**Your task**

Write four tests for the `Basket` class. Each `TODO` comment describes the test to write.
Replace the `fail(...)` line with your test, using the `@Test` annotation (already there) and AssertJ assertions.

**Hints**

- Structure your tests as _arrange_ (set up), _act_ (do something) and _assert_ (check the result).

**Check your work**

```
mvn test -Dtest=WhenCreatingABasketTest
```

**Done when:** All the tests in `WhenCreatingABasketTest` pass.

---

## Exercise 15.4 — The JUnit 6 test lifecycle

_Lesson 15.4_

**Edit:** [`WhenUsingTheTestLifecycleTest.java`](../../src/test/java/com/serenitydojo/module15junit/WhenUsingTheTestLifecycleTest.java)

**Your task**

The tests in this class need a `Basket` that has been created _before each test_, and some bookkeeping which
records when the lifecycle methods run. Add the four lifecycle methods described in the class comment:
`@BeforeAll`, `@BeforeEach`, `@AfterEach` and `@AfterAll`.

**Hints**

- `@BeforeAll` and `@AfterAll` methods must be `static`.
- JUnit creates a new instance of the test class for each test, so fields are not shared between tests.

**Check your work**

```
mvn test -Dtest=WhenUsingTheTestLifecycleTest
```

**Done when:** All the tests in `WhenUsingTheTestLifecycleTest` pass.

---

## Exercise 15.5 — Writing good assertions

_Lesson 15.5_

**Edit:** [`WhenWritingGoodAssertionsTest.java`](../../src/test/java/com/serenitydojo/module15junit/WhenWritingGoodAssertionsTest.java)

**Your task**

Write assertions about a `Basket` that contains some items. Choose the clearest assertion for each case:
`extracting()`, `isCloseTo()`, `allMatch()`, `filteredOn()`, descriptions with `as()`, `SoftAssertions`, `isEmpty()`
and checking for an exception.

**Hints**

- Good assertions say what you mean: `assertThat(list).isEmpty()` is clearer than `assertThat(list.size()).isEqualTo(0)`.

**Check your work**

```
mvn test -Dtest=WhenWritingGoodAssertionsTest
```

**Done when:** All the tests in `WhenWritingGoodAssertionsTest` pass.

---

## Exercise 15.6 — Naming your tests

_Lesson 15.6_

**Edit:** [`WhenNamingTestsTest.java`](../../src/test/java/com/serenitydojo/module15junit/WhenNamingTestsTest.java)

**Your task**

The tests in `WhenNamingTestsTest` work, but they are called `test1`, `test2` and `test3`. Rename each of them so the name says what
behaviour is being tested (for example `shouldIncreaseTheItemCountWhenAnItemIsAdded`), and add a `@DisplayName` which describes
the test as a readable sentence.

Run `TestNamingStandardsTest` to check your work.

**Hints**

- A good test name tells you what is wrong when the test fails, without having to read the test.

**Check your work**

```
mvn test -Dtest=TestNamingStandardsTest
```

**Done when:** All the tests in `TestNamingStandardsTest` pass.

---

## Exercise 15.7 — Grouping tests with @Nested

_Lesson 15.7_

**Edit:** [`WhenCheckingOutABasketTest.java`](../../src/test/java/com/serenitydojo/module15junit/WhenCheckingOutABasketTest.java)

**Your task**

All the tests in `WhenCheckingOutABasketTest` are in one flat list. Reorganise them into two `@Nested` classes:
one for the tests where the basket is empty, and one for the tests where the basket has items.
Move the setup code into a `@BeforeEach` method in each nested class.

Run `NestedTestStructureTest` to check your work, and run `WhenCheckingOutABasketTest` to make sure all five tests still pass.

**Hints**

- A nested class is a non-static inner class annotated with `@Nested`.
- Each nested class can have its own `@BeforeEach`.

**Check your work**

```
mvn test -Dtest=NestedTestStructureTest
mvn test -Dtest=WhenCheckingOutABasketTest*
```

**Done when:** All the tests in `NestedTestStructureTest` and `WhenCheckingOutABasketTest*` pass.

---

## Exercise 15.8 — Data driven tests

_Lesson 15.8_

**Edit:** [`WhenValidatingPasswordsTest.java`](../../src/test/java/com/serenitydojo/module15junit/WhenValidatingPasswordsTest.java)

**Read:** [`PasswordValidator.java`](../../src/main/java/com/serenitydojo/module15junit/PasswordValidator.java) (already complete)

**Your task**

The `PasswordValidator` should accept strong passwords (at least 8 characters, with an upper case letter,
a lower case letter, a digit and a special character) and reject everything else.

Turn each of the five placeholder tests into a parameterized test, which runs once for each data value:
`@ValueSource`, `@NullAndEmptySource`, `@CsvSource` and `@MethodSource`.

**Hints**

- Replace `@Test` with `@ParameterizedTest`, and add a parameter to the method for the test data.
- Use `@ParameterizedTest(name = "...")` with `{0}` and `{1}` to make the test names readable.

**Check your work**

```
mvn test -Dtest=WhenValidatingPasswordsTest
```

**Done when:** All the tests in `WhenValidatingPasswordsTest` pass.

---

## Exercise 15.9 — Testing exceptions

_Lesson 15.9_

**Edit:** [`WhenTestingExceptionsTest.java`](../../src/test/java/com/serenitydojo/module15junit/WhenTestingExceptionsTest.java)

**Your task**

Write tests that check that `Basket` rejects bad input, using `assertThrows()` and AssertJ's `assertThatThrownBy()`.
Check the type of the exception, and its message.

**Hints**

- `assertThrows(SomeException.class, () -> codeThatThrows());`
- `assertThatThrownBy(() -> code()).isInstanceOf(...).hasMessage(...)`

**Check your work**

```
mvn test -Dtest=WhenTestingExceptionsTest
```

**Done when:** All the tests in `WhenTestingExceptionsTest` pass.

---

## Exercise 15.10 — Using tags

_Lesson 15.10_

**Edit:** [`WhenUsingTagsTest.java`](../../src/test/java/com/serenitydojo/module15junit/WhenUsingTagsTest.java)

**Your task**

Tag the tests in `WhenUsingTagsTest`: the two quick tests as `@Tag("smoke")`, and the two long-running ones as `@Tag("slow")`.

Then run just some of the tests from the command line:

```
mvn test -Dtest=WhenUsingTagsTest -Dgroups=smoke
mvn test -Dtest=WhenUsingTagsTest -DexcludedGroups=slow
```

Run `TagsAreAppliedTest` to check your work.

**Hints**

- Tags can be put on a method or on a whole class.

**Check your work**

```
mvn test -Dtest=TagsAreAppliedTest
```

**Done when:** All the tests in `TagsAreAppliedTest` pass.

---

## Exercise 15.11 — Comprehensive exercise (part 1)

_Lesson 15.11_

**Edit:** [`ParkingFeeCalculatorTest.java`](../../src/test/java/com/serenitydojo/module15junit/ParkingFeeCalculatorTest.java)

**Read:** [`ParkingFeeCalculator.java`](../../src/main/java/com/serenitydojo/module15junit/ParkingFeeCalculator.java) (already complete)

**Your task**

Write a complete set of tests for `ParkingFeeCalculator.feeFor(int hours)`. The rules are in the Javadoc of the class:

- The first hour is free.
- Each extra hour costs 2.50.
- The fee for a day never exceeds 20.00 (test the boundary: the number of hours where the cap starts to apply).
- Stays of fewer than 1 or more than 24 hours are rejected with an `IllegalArgumentException`.

Use everything from this module: clear names and `@DisplayName`s, `@Nested` groups, parameterized tests,
exception tests, and precise assertions.

**Check your work**

```
mvn test -Dtest=ParkingFeeCalculatorTest
```

**Done when:** Your tests pass, and they would fail if any of the rules in `ParkingFeeCalculator` were broken.

---

## Exercise 15.12 — Comprehensive exercise (part 2): test-driven development

_Lesson 15.12_

**Edit:** [`ParkingFeeCalculator.java`](../../src/main/java/com/serenitydojo/module15junit/ParkingFeeCalculator.java)

**Your task**

The tests for the weekend rates are already written in `WhenParkingAtTheWeekendTest`, and they fail. Read them,
and then implement `feeFor(int hours, DayOfWeek day)` in `ParkingFeeCalculator` until they all pass.
The weekend rules are in the Javadoc of the class.

This is _test-driven development_: write a failing test first, and then write the simplest code that makes it pass.

**Hints**

- Saturdays and Sundays use the weekend rates. All other days use the existing `feeFor(int hours)` method.
- The test cases are a specification: look at the edge cases they test.

**Check your work**

```
mvn test -Dtest=WhenParkingAtTheWeekendTest
```

**Done when:** All the tests in `WhenParkingAtTheWeekendTest` pass.

---
