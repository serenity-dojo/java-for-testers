# Module 3 — Java Classes and Objects

**Lessons**

- 3.1 Understanding Java Classes (no exercise)
- 3.2 Classes and fields
- 3.3 Private fields

In this module you write your own classes. The tests for these exercises start out "switched off": each one contains a `fail("TODO ...")` line and the real test code in comments. Write the class, then delete the `fail(...)` line and uncomment the test code (in IntelliJ, select the lines and press `Ctrl+/` or `Cmd+/`).

**Run all the tests for this module**

```
mvn test -Dtest="**/module03classes/*"
```

The code for this module is in the `com.serenitydojo.module03classes` package, under `src/main/java` and `src/test/java`.

---

## Exercise 3.2 — Classes and fields

_Lesson 3.2_

**Edit:** [`Cat.java`](../../src/main/java/com/serenitydojo/module03classes/Cat.java), [`WhenCreatingACatTest.java`](../../src/test/java/com/serenitydojo/module03classes/WhenCreatingACatTest.java)

**Your task**

Add three public fields to the `Cat` class: a `String` called `name`, a `String` called `favoriteFood`,
and an `int` called `age`. Then enable the tests in `WhenCreatingACatTest`.

**Hints**

- `public String name;` declares a public field.
- Fields that you do not set have default values: `null` for objects, `0` for numbers.

**Check your work**

```
mvn test -Dtest=WhenCreatingACatTest
```

**Done when:** All the tests in `WhenCreatingACatTest` pass.

---

## Exercise 3.3 — Private fields

_Lesson 3.3_

**Edit:** [`Dog.java`](../../src/main/java/com/serenitydojo/module03classes/Dog.java), [`Hamster.java`](../../src/main/java/com/serenitydojo/module03classes/Hamster.java), [`WhenUsingPrivateFieldsTest.java`](../../src/test/java/com/serenitydojo/module03classes/WhenUsingPrivateFieldsTest.java)

**Your task**

Public fields can be changed by anybody. Make your classes safer by hiding their fields.

1. Complete `Dog`: three **private** fields (`name`, `favoriteToy`, `age`), a constructor taking all three,
   and a getter for each, e.g. `getName()`.
2. Complete `Hamster`: a private `name` and `age`, a constructor, getters, and a `setAge(int)` method that ignores
   negative ages. A hamster's name can never change, so do not add a `setName()`.
3. Enable the tests in `WhenUsingPrivateFieldsTest`.

**Hints**

- Use `this.name = name;` in a constructor to store the parameter in the field.
- A setter can contain logic. That is one of the reasons we do not make fields public.

**Check your work**

```
mvn test -Dtest=WhenUsingPrivateFieldsTest
```

**Done when:** All the tests in `WhenUsingPrivateFieldsTest` pass.

---
