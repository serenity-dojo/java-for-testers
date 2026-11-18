# Module 7 — Conditional Logic

**Lessons**

- 7.1 Simple Conditional Logic
- 7.2 Nested Conditionals

**Run all the tests for this module**

```
mvn test -Dtest="**/module07conditionals/*"
```

The code for this module is in the `com.serenitydojo.module07conditionals` package, under `src/main/java` and `src/test/java`.

---

## Exercise 7.1 — Simple conditional logic

_Lesson 7.1_

**Edit:** [`GradeCalculator.java`](../../src/main/java/com/serenitydojo/module07conditionals/GradeCalculator.java), [`NumberChecks.java`](../../src/main/java/com/serenitydojo/module07conditionals/NumberChecks.java)

**Your task**

Use `if`, `else if` and `else` to implement:

- `GradeCalculator.gradeFor(int score)`: converts a score into the grade `A`, `B`, `C`, `D` or `F`, or `Invalid`.
- `NumberChecks`: `isEven()`, `largestOf()`, `isLeapYear()` and `fizzBuzz()`.

The rules for each method are in its Javadoc comment.

**Hints**

- Combine conditions with `&&` (and) and `||` (or).
- Think about the order of your checks: a number divisible by 15 is also divisible by 3 and by 5.

**Check your work**

```
mvn test -Dtest=WhenUsingSimpleConditionalsTest
```

**Done when:** All the tests in `WhenUsingSimpleConditionalsTest` pass.

---

## Exercise 7.2 — Nested conditionals

_Lesson 7.2_

**Edit:** [`ShippingCalculator.java`](../../src/main/java/com/serenitydojo/module07conditionals/ShippingCalculator.java), [`TicketPricer.java`](../../src/main/java/com/serenitydojo/module07conditionals/TicketPricer.java)

**Your task**

Some decisions depend on other decisions. Implement:

- `ShippingCalculator.shippingCost()`: the cost depends on the weight, and on whether the parcel is international
  or express. The price table is in the Javadoc.
- `TicketPricer.priceFor()`: the price of a cinema ticket depends on the person's age, whether they are a student,
  and whether it is the weekend.

**Hints**

- Handle invalid input first, and throw an `IllegalArgumentException`.
- Work out the base price first, then apply the extras.

**Check your work**

```
mvn test -Dtest=WhenUsingNestedConditionalsTest
```

**Done when:** All the tests in `WhenUsingNestedConditionalsTest` pass.

---
