# Module 4 — Java Fields and Methods

**Lessons**

- 4.1 Defining Methods
- 4.2 Static Fields
- 4.3 Static Methods

All three exercises use the `Cat` class in this module, and `TemperatureConverter`. Read the Javadoc comment above each method to see what it should do.

**Run all the tests for this module**

```
mvn test -Dtest="**/module04methods/*"
```

The code for this module is in the `com.serenitydojo.module04methods` package, under `src/main/java` and `src/test/java`.

---

## Exercise 4.1 — Defining methods

_Lesson 4.1_

**Edit:** [`Cat.java`](../../src/main/java/com/serenitydojo/module04methods/Cat.java)

**Your task**

Implement the instance methods of `Cat`: `makeNoise()`, `haveBirthday()`, `isAdult()`, `describe()` and `feed(String)`.

**Hints**

- A method which returns a value uses `return`. A `void` method changes state instead.
- Instance methods can use the fields of the object, such as `name` and `age`.

**Check your work**

```
mvn test -Dtest=WhenDefiningMethodsTest
```

**Done when:** All the tests in `WhenDefiningMethodsTest` pass.

---

## Exercise 4.2 — Static fields

_Lesson 4.2_

**Edit:** [`Cat.java`](../../src/main/java/com/serenitydojo/module04methods/Cat.java)

**Your task**

Static fields belong to the class, not to any one object.

- Give the `CAT_NOISE` constant the value `"Meow"`.
- Make the constructor count how many cats have been created, by increasing the static `numberOfCats` field.

**Hints**

- Constants are declared `static final` and are named in `UPPER_SNAKE_CASE`.

**Check your work**

```
mvn test -Dtest=WhenUsingStaticFieldsTest
```

**Done when:** All the tests in `WhenUsingStaticFieldsTest` pass.

---

## Exercise 4.3 — Static methods

_Lesson 4.3_

**Edit:** [`Cat.java`](../../src/main/java/com/serenitydojo/module04methods/Cat.java), [`TemperatureConverter.java`](../../src/main/java/com/serenitydojo/module04methods/TemperatureConverter.java)

**Your task**

Static methods are called on the class, not on an object.

- Implement `Cat.usualFood()`.
- Implement the three methods of `TemperatureConverter`: `toFahrenheit()`, `toCelsius()` and `isFreezing()`.

**Hints**

- Celsius to Fahrenheit: multiply by 9, divide by 5, add 32.
- Fahrenheit to Celsius: subtract 32, multiply by 5, divide by 9.

**Check your work**

```
mvn test -Dtest=WhenUsingStaticMethodsTest
```

**Done when:** All the tests in `WhenUsingStaticMethodsTest` pass.

---
