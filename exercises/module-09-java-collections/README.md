# Module 9 — Java Collections

**Lessons**

- 9.1 Arrays
- 9.2 Lists and Sets
- 9.3 Live Coding: Advanced Lists

**Run all the tests for this module**

```
mvn test -Dtest="**/module09collections/*"
```

The code for this module is in the `com.serenitydojo.module09collections` package, under `src/main/java` and `src/test/java`.

---

## Exercise 9.1 — Arrays

_Lesson 9.1_

**Edit:** [`ArrayExercises.java`](../../src/main/java/com/serenitydojo/module09collections/ArrayExercises.java)

**Your task**

Implement the methods of `ArrayExercises`: `sum()`, `largest()`, `reverse()`, `contains()` and `countOccurrences()`.
Use loops - do not use any other collection classes.

**Hints**

- Array indexes start at 0, and the last index is `array.length - 1`.

**Check your work**

```
mvn test -Dtest=WhenWorkingWithArraysTest
```

**Done when:** All the tests in `WhenWorkingWithArraysTest` pass.

---

## Exercise 9.2 — Lists and sets

_Lesson 9.2_

**Edit:** [`ListExercises.java`](../../src/main/java/com/serenitydojo/module09collections/ListExercises.java), [`SetExercises.java`](../../src/main/java/com/serenitydojo/module09collections/SetExercises.java)

**Your task**

Implement `ListExercises.combine()`, and the three methods of `SetExercises`: `uniqueWords()`,
`hasDuplicates()` and `commonElements()`.

**Hints**

- A `Set` never contains duplicates. A `TreeSet` also keeps its elements in sorted order.
- Copy a list with `new ArrayList<>(otherList)`.

**Check your work**

```
mvn test -Dtest=WhenWorkingWithListsAndSetsTest
```

**Done when:** All the tests in `WhenWorkingWithListsAndSetsTest` pass.

---

## Exercise 9.3 — Advanced lists

_Lesson 9.3_

**Edit:** [`ListExercises.java`](../../src/main/java/com/serenitydojo/module09collections/ListExercises.java)

**Your task**

Implement the remaining methods of `ListExercises`: `sortedAlphabetically()`, `namesStartingWith()`,
`longestName()`, `removeShortNames()` and `replaceName()`. None of the methods should change the list that is passed in.

**Hints**

- `Collections.sort()`, `Collections.replaceAll()` and `List.removeIf()` are useful here.
- To avoid changing the original list, make a copy first.

**Check your work**

```
mvn test -Dtest=WhenWorkingWithAdvancedListsTest
```

**Done when:** All the tests in `WhenWorkingWithAdvancedListsTest` pass.

---
