# Module 6 — Inheritance and Polymorphism

**Lessons**

- 6.1 Basic Inheritance
- 6.2 Advanced Inheritance (abstract methods, classes and polymorphism)

**Run all the tests for this module**

```
mvn test -Dtest="**/module06inheritance/*"
```

The code for this module is in the `com.serenitydojo.module06inheritance` package, under `src/main/java` and `src/test/java`.

---

## Exercise 6.1 — Basic inheritance

_Lesson 6.1_

**Edit:** [`Dog.java`](../../src/main/java/com/serenitydojo/module06inheritance/Dog.java), [`Cat.java`](../../src/main/java/com/serenitydojo/module06inheritance/Cat.java), [`WhenUsingBasicInheritanceTest.java`](../../src/test/java/com/serenitydojo/module06inheritance/WhenUsingBasicInheritanceTest.java)

**Read:** [`Pet.java`](../../src/main/java/com/serenitydojo/module06inheritance/Pet.java) (already complete)

**Your task**

`Pet` is already written: it has a name, a `goForWalks()` method and a default `makeNoise()` method.
Make `Dog` and `Cat` extend it.

- `Dog` has a `favoriteToy`, and makes the noise `Woof`.
- `Cat` has a `favoriteFood`, makes the noise `Meow`, and overrides `goForWalks()` to return `Cats don't go for walks`.

Then delete the `fail(...)` lines and uncomment the tests in `WhenUsingBasicInheritanceTest`.

**Hints**

- `public class Dog extends Pet`
- Call the parent constructor with `super(name);` as the first line of your constructor.
- Use `@Override` when you replace a method of the parent class.

**Check your work**

```
mvn test -Dtest=WhenUsingBasicInheritanceTest
```

**Done when:** All the tests in `WhenUsingBasicInheritanceTest` pass.

---

## Exercise 6.2 — Abstract methods, abstract classes and polymorphism

_Lesson 6.2_

**Edit:** [`Circle.java`](../../src/main/java/com/serenitydojo/module06inheritance/Circle.java), [`Rectangle.java`](../../src/main/java/com/serenitydojo/module06inheritance/Rectangle.java), [`Square.java`](../../src/main/java/com/serenitydojo/module06inheritance/Square.java), [`WhenUsingPolymorphismTest.java`](../../src/test/java/com/serenitydojo/module06inheritance/WhenUsingPolymorphismTest.java)

**Read:** [`Shape.java`](../../src/main/java/com/serenitydojo/module06inheritance/Shape.java) (already complete)

**Your task**

`Shape` is an abstract class: every shape has an `area()`, but each kind of shape calculates it differently.

1. Implement `area()` in `Circle` and `Rectangle`.
2. Create `Square` as a subclass of `Rectangle`. Its constructor takes one side length and passes it to the `Rectangle`
   constructor as both the width and the height.
3. Enable the `Square` test in `WhenUsingPolymorphismTest`.

Notice how the last tests treat a `List<Shape>` without caring which kind of shapes are in it. That is polymorphism.

**Hints**

- The area of a circle is `Math.PI * radius * radius`.

**Check your work**

```
mvn test -Dtest=WhenUsingPolymorphismTest
```

**Done when:** All the tests in `WhenUsingPolymorphismTest` pass.

---
