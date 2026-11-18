# Module 8 — Switches and Enums

**Lessons**

- 8.1 Switches
- 8.2 Enums

**Run all the tests for this module**

```
mvn test -Dtest="**/module08enums/*"
```

The code for this module is in the `com.serenitydojo.module08enums` package, under `src/main/java` and `src/test/java`.

---

## Exercise 8.1a — Switch statements

_Lesson 8.1_

**Edit:** [`Feeder.java`](../../src/main/java/com/serenitydojo/module08enums/Feeder.java)

**Your task**

Implement `Feeder.feeds(AnimalType, boolean isPremium)` using a `switch` on the animal.
The food for each animal is in the Javadoc. The `AnimalType` and `FoodType` enums are already written.

**Hints**

- Do not forget the `default` case, for animals that the feeder does not know about.

**Check your work**

```
mvn test -Dtest=WhenFeedingTheAnimalsTest
```

**Done when:** All the tests in `WhenFeedingTheAnimalsTest` pass.

---

## Exercise 8.1b — Switch expressions

_Lesson 8.1_

**Edit:** [`CalendarHelper.java`](../../src/main/java/com/serenitydojo/module08enums/CalendarHelper.java)

**Your task**

Modern Java has _switch expressions_, which return a value and use `->` instead of `:`. Implement the three methods of
`CalendarHelper` using them.

**Hints**

- `case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;` lists several values for one result.

**Check your work**

```
mvn test -Dtest=WhenUsingSwitchExpressionsTest
```

**Done when:** All the tests in `WhenUsingSwitchExpressionsTest` pass.

---

## Exercise 8.2 — Enums

_Lesson 8.2_

**Edit:** [`TShirtSize.java`](../../src/main/java/com/serenitydojo/module08enums/TShirtSize.java), [`WhenWorkingWithEnumsTest.java`](../../src/test/java/com/serenitydojo/module08enums/WhenWorkingWithEnumsTest.java)

**Your task**

An enum can have fields, a constructor and methods. Give each `TShirtSize` a maximum chest measurement
(`SMALL` = 90, `MEDIUM` = 100, `LARGE` = 110, `EXTRA_LARGE` = 120), add the `getMaxChestCm()` getter, and implement
`forChest()`, which finds the smallest size that fits.

**Hints**

- `SMALL(90)` calls the enum constructor. An enum constructor is always private.
- `TShirtSize.values()` returns all the constants, in the order they are declared.

**Check your work**

```
mvn test -Dtest=WhenWorkingWithEnumsTest
```

**Done when:** All the tests in `WhenWorkingWithEnumsTest` pass.

---
