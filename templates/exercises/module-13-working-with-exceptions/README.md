# Module 13 — Working with Exceptions

**Lessons**

- 13.1 Introduction to Java Exceptions
- 13.2 Checked and Unchecked Exceptions
- 13.3 Catching Exceptions
- 13.4 Custom Exceptions

**Run all the tests for this module**

```
mvn test -Dtest="**/module13exceptions/*"
```

The code for this module is in the `com.serenitydojo.module13exceptions` package, under `src/main/java` and `src/test/java`.

---

## Exercise 13.1-13.2 — Introduction to exceptions, and checked and unchecked exceptions

_Lessons 13.1 and 13.2_

**Edit:** [`WhenWorkingWithExceptionsTest.java`](../../src/test/java/com/serenitydojo/module13exceptions/WhenWorkingWithExceptionsTest.java)

**Your task**

Each test does something that makes Java throw an exception. Replace the placeholder exception class
with the one that is actually thrown. If you are not sure, run the test: the failure message tells you what was thrown!

Then decide which exceptions are _checked_ (the compiler forces you to handle them) and which are _unchecked_.

**Hints**

- Checked exceptions extend `Exception` but not `RuntimeException`. `IOException` is the best known example.

**Check your work**

```
mvn test -Dtest=WhenWorkingWithExceptionsTest
```

**Done when:** All the tests in `WhenWorkingWithExceptionsTest` pass.

---

## Exercise 13.3 — Catching exceptions

_Lesson 13.3_

**Edit:** [`SafeReader.java`](../../src/main/java/com/serenitydojo/module13exceptions/SafeReader.java)

**Read:** [`MissingWelcomeFileException.java`](../../src/main/java/com/serenitydojo/module13exceptions/MissingWelcomeFileException.java) (already complete)

**Your task**

Implement the methods of `SafeReader`, which each have to deal with something going wrong:

- `parseIntOrDefault()`: catch the `NumberFormatException`.
- `divide()`: catch the `ArithmeticException`, and return an empty `Optional`.
- `firstLineOrDefault()`: catch the checked `IOException` when reading a file.
- `welcomeMessage()`: catch an `IOException`, and throw a `MissingWelcomeFileException` which has the original exception as its _cause_.
- `countLines()`: use try-with-resources to make sure the file is always closed.

**Hints**

- `try { ... } catch (SomeException e) { ... }`
- Pass the original exception to the constructor of the new one, so that it is not lost.

**Check your work**

```
mvn test -Dtest=WhenCatchingExceptionsTest
```

**Done when:** All the tests in `WhenCatchingExceptionsTest` pass.

---

## Exercise 13.4 — Custom exceptions

_Lesson 13.4_

**Edit:** [`InsufficientFundsException.java`](../../src/main/java/com/serenitydojo/module13exceptions/InsufficientFundsException.java), [`Wallet.java`](../../src/main/java/com/serenitydojo/module13exceptions/Wallet.java)

**Your task**

Create your own exception that describes a problem in your domain.

1. Complete `InsufficientFundsException`: it is created with the balance and the amount requested, has the message
   `Insufficient funds: balance 50.00, requested 80.00`, and can report the `getShortfall()`.
2. Complete `Wallet.spend()`: throw an `IllegalArgumentException` for negative amounts, throw an `InsufficientFundsException`
   if there is not enough money, and otherwise reduce the balance.

**Hints**

- Use `super(message)` to pass the message to the `Exception` parent class.
- Use `String.format(Locale.ROOT, "%.2f", value)` to format a number with two decimal places.

**Check your work**

```
mvn test -Dtest=WhenUsingCustomExceptionsTest
```

**Done when:** All the tests in `WhenUsingCustomExceptionsTest` pass.

---
