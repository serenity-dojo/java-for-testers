# Module 14 — Advanced Java Topics

**Lessons**

- 14.1 Lambda Expressions Deep Dive
- 14.2 Working With Streams
- 14.3 Introduction To Lambda Expressions
- 14.4 Working With The Java Date APIs
- 14.5 Working With Vars and Records
- 14.6 Advanced Enums
- 14.7 Working With Excel Spreadsheets

The exercises in this module follow the order of the lessons in the course outline. The lessons were recorded as live coding sessions, so you can also use these exercises to practise along with them.

**Run all the tests for this module**

```
mvn test -Dtest="**/module14advanced/*"
```

The code for this module is in the `com.serenitydojo.module14advanced` package, under `src/main/java` and `src/test/java`.

---

## Exercise 14.1 — Lambda expressions deep dive

_Lesson 14.1_

**Edit:** [`WhenUsingLambdasTest.java`](../../src/test/java/com/serenitydojo/module14advanced/WhenUsingLambdasTest.java)

**Your task**

Write lambda expressions for the main functional interfaces: `Function`, `BiFunction`, `Predicate`, `Supplier`
and `Consumer`. Then use method references, combine functions with `andThen()`, combine predicates with `negate()` and `and()`,
and use a variable from the surrounding code inside a lambda.

**Hints**

- `x -> x * 2` is a lambda with one parameter. `(a, b) -> a + b` has two. `() -> "Hello"` has none.

**Check your work**

```
mvn test -Dtest=WhenUsingLambdasTest
```

**Done when:** All the tests in `WhenUsingLambdasTest` pass.

---

## Exercise 14.2 — Working with streams

_Lesson 14.2_

**Edit:** [`TransactionAnalyser.java`](../../src/main/java/com/serenitydojo/module14advanced/TransactionAnalyser.java)

**Read:** [`Transaction.java`](../../src/main/java/com/serenitydojo/module14advanced/Transaction.java) (already complete)

**Your task**

`TransactionAnalyser` analyses a list of bank `Transaction`s (deposits are positive, withdrawals are negative).
Implement each method using the Stream API (`transactions.stream()`) rather than loops.

**Hints**

- `filter()`, `map()`, `mapToDouble()`, `sum()`, `count()`, `max()`, `min()`, `distinct()`, `sorted()`, `allMatch()`.
- `Collectors.groupingBy(classifier, Collectors.summingDouble(...))` groups items into a map.
- `Comparator.comparingDouble(Transaction::amount)` compares transactions by amount.

**Check your work**

```
mvn test -Dtest=WhenWorkingWithStreamsTest
```

**Done when:** All the tests in `WhenWorkingWithStreamsTest` pass.

---

## Exercise 14.3 — Introduction to lambda expressions

_Lesson 14.3_

**Edit:** [`LambdaExercises.java`](../../src/main/java/com/serenitydojo/module14advanced/LambdaExercises.java)

**Your task**

The methods of `LambdaExercises` take a lambda as a parameter: for example `filter(items, condition)`.
Implement them using ordinary loops. The tests pass in different lambdas, and your code applies them.

**Hints**

- A `Predicate` is used with `test(item)`, a `Function` with `apply(item)`, and a `Consumer` with `accept(item)`.

**Check your work**

```
mvn test -Dtest=WhenUsingLambdasWithCollectionsTest
```

**Done when:** All the tests in `WhenUsingLambdasWithCollectionsTest` pass.

---

## Exercise 14.4 — Working with the Java date APIs

_Lesson 14.4_

**Edit:** [`WhenWorkingWithDatesTest.java`](../../src/test/java/com/serenitydojo/module14advanced/WhenWorkingWithDatesTest.java)

**Your task**

Use the classes of the `java.time` package: `LocalDate`, `LocalTime`, `LocalDateTime`, `Period`, `Duration`,
`ChronoUnit` and `DateTimeFormatter`. Create dates, do date arithmetic, compare and measure dates, and format them.

**Hints**

- The `java.time` classes are immutable: `date.plusDays(1)` returns a new date and does not change `date`.
- Months are numbered from 1 (January) in `LocalDate.of(2024, 3, 15)`.

**Check your work**

```
mvn test -Dtest=WhenWorkingWithDatesTest
```

**Done when:** All the tests in `WhenWorkingWithDatesTest` pass.

---

## Exercise 14.5 — Working with var and records

_Lesson 14.5_

**Edit:** [`Book.java`](../../src/main/java/com/serenitydojo/module14advanced/Book.java), [`WhenUsingRecordsTest.java`](../../src/test/java/com/serenitydojo/module14advanced/WhenUsingRecordsTest.java), [`WhenUsingVarTest.java`](../../src/test/java/com/serenitydojo/module14advanced/WhenUsingVarTest.java)

**Your task**

**Records:** turn the `Book` class into a record with the components `title`, `author` and `pages`.
Add a compact constructor which rejects books with no pages, and an `isLong()` method (more than 500 pages).
Then enable the tests in `WhenUsingRecordsTest`.

**var:** in `WhenUsingVarTest`, declare each variable with `var` instead of writing out its type.

**Hints**

- `public record Book(String title, String author, int pages) { }`
- A record automatically gets accessors (`title()`), `equals()`, `hashCode()` and `toString()`.

**Check your work**

```
mvn test -Dtest=WhenUsingRecordsTest
mvn test -Dtest=WhenUsingVarTest
```

**Done when:** All the tests in `WhenUsingRecordsTest` and `WhenUsingVarTest` pass.

---

## Exercise 14.6 — Advanced enums

_Lesson 14.6_

**Edit:** [`Operation.java`](../../src/main/java/com/serenitydojo/module14advanced/Operation.java)

**Your task**

Complete the `Operation` enum so that each constant has a symbol and its own behaviour, using a `DoubleBinaryOperator`:
`ADD("+", (a, b) -> a + b)`. Implement `getSymbol()`, `apply()` and `fromSymbol()`.
`DIVIDE` should throw an `ArithmeticException` when dividing by zero.

**Hints**

- The enum constructor takes the symbol and the operator, and stores them in private final fields.

**Check your work**

```
mvn test -Dtest=WhenUsingAdvancedEnumsTest
```

**Done when:** All the tests in `WhenUsingAdvancedEnumsTest` pass.

---

## Exercise 14.7 — Working with Excel spreadsheets

_Lesson 14.7_

**Edit:** [`FruitPriceSheet.java`](../../src/main/java/com/serenitydojo/module14advanced/FruitPriceSheet.java)

**Your task**

Use [Apache POI](https://poi.apache.org/) to read and write spreadsheets. Implement `FruitPriceSheet`:

- `readPrices()` reads the fruit names (column A) and prices (column B) from a spreadsheet, skipping the header row.
  The test reads [`fruit-prices.xlsx`](../../src/test/resources/spreadsheets/fruit-prices.xlsx).
- `writePrices()` writes a map of prices to a new `.xlsx` file, with a header row.

**Hints**

- `new XSSFWorkbook(inputStream)` opens an `.xlsx` file, and `new XSSFWorkbook()` creates a new one.
- `sheet.getRow(n)`, `row.getCell(n)`, `cell.getStringCellValue()`, `cell.getNumericCellValue()`.
- Use try-with-resources so that the workbook is always closed.

**Check your work**

```
mvn test -Dtest=WhenWorkingWithExcelSpreadsheetsTest
```

**Done when:** All the tests in `WhenWorkingWithExcelSpreadsheetsTest` pass.

---
