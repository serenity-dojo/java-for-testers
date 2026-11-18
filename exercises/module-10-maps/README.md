# Module 10 — Maps

**Lessons**

- 10.1 Basic Maps
- 10.2 Creating Maps more concisely with Map.of()
- 10.3 Reading and writing Map entries
- 10.4 Iterating over maps

These tests all use TODO comments: replace the placeholder code with your own.

**Run all the tests for this module**

```
mvn test -Dtest="**/module10maps/*"
```

The code for this module is in the `com.serenitydojo.module10maps` package, under `src/main/java` and `src/test/java`.

---

## Exercise 10.1-10.2 — Creating maps

_Lessons 10.1 and 10.2_

**Edit:** [`WhenCreatingMapsTest.java`](../../src/test/java/com/serenitydojo/module10maps/WhenCreatingMapsTest.java)

**Your task**

Create maps with `new HashMap<>()` and `put()`, then more concisely with `Map.of(...)`.
Learn that a `Map.of()` map cannot be changed, and how to make a modifiable copy of it.

**Hints**

- `Map.of("red", 3, "green", 6)` takes alternating keys and values.

**Check your work**

```
mvn test -Dtest=WhenCreatingMapsTest
```

**Done when:** All the tests in `WhenCreatingMapsTest` pass.

---

## Exercise 10.3 — Reading and writing map entries

_Lesson 10.3_

**Edit:** [`WhenReadingAndWritingMapEntriesTest.java`](../../src/test/java/com/serenitydojo/module10maps/WhenReadingAndWritingMapEntriesTest.java)

**Your task**

Work with the entries of a map: `get()`, `getOrDefault()`, `containsKey()`, `containsValue()`, `put()`,
`putIfAbsent()`, `replace()`, `remove()` and `merge()`.

**Hints**

- `get()` returns `null` if the key is missing - `getOrDefault()` lets you choose a different value.

**Check your work**

```
mvn test -Dtest=WhenReadingAndWritingMapEntriesTest
```

**Done when:** All the tests in `WhenReadingAndWritingMapEntriesTest` pass.

---

## Exercise 10.4 — Iterating over maps

_Lesson 10.4_

**Edit:** [`WhenIteratingOverMapsTest.java`](../../src/test/java/com/serenitydojo/module10maps/WhenIteratingOverMapsTest.java), [`WordCounter.java`](../../src/main/java/com/serenitydojo/module10maps/WordCounter.java)

**Your task**

Loop over the keys, values and entries of a map, use `forEach`, and keep a map sorted with a `TreeMap`.
Then implement `WordCounter.countWords()`, which counts how many times each word appears in a piece of text.

**Hints**

- A `Map.Entry` has `getKey()` and `getValue()`.
- `counts.merge(word, 1, Integer::sum)` adds one to the count of a word.

**Check your work**

```
mvn test -Dtest=WhenIteratingOverMapsTest
```

**Done when:** All the tests in `WhenIteratingOverMapsTest` pass.

---
