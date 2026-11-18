#!/usr/bin/env python3
"""Generates exercises/<module>/README.md files from structured data."""
import sys
from pathlib import Path

OUT = Path(sys.argv[1])
ROOT = '../../'

MODULES = []


def module(num, slug, title, package, lessons, intro, exercises, notes=None):
    MODULES.append(dict(num=num, slug=slug, title=title, package=package, lessons=lessons,
                        intro=intro, exercises=exercises, notes=notes))


def ex(id, title, lesson, edit, run, task, hints=None, done=None, also=None):
    return dict(id=id, title=title, lesson=lesson, edit=edit, run=run, task=task,
                hints=hints or [], done=done, also=also or [])


# ---------------------------------------------------------------------------
module(1, 'first-steps', 'Your First Steps With Java', 'module01firststeps',
       ['1.1 Course Introduction & Roadmap (no exercise)', '1.2 Setting Up Java (Windows)',
        '1.3 Writing Your First Java Code'],
       'In this module you set up your tools, and write your first Java code.',
       [
           ex('1.2', 'Check your Java setup', 'Lesson 1.2',
              [], ['JavaSetupTest'],
              """Make sure your machine is ready for the course.

1. Install a JDK, version 21 or newer, and Maven (see the setup lesson).
2. Open this project in your IDE (IntelliJ IDEA is recommended).
3. Run `JavaSetupTest`, either with the green arrow next to the test in your IDE, or on the command line.

You do not need to change any code in this exercise.""",
              done='`JavaSetupTest` passes and prints the version of Java it is running on.'),
           ex('1.3', 'Write your first Java code', 'Lesson 1.3',
              ['m:HelloWorldWriter'], ['HelloWorldWriterTest'],
              """Open `HelloWorldWriter` and complete its two methods:

- `greeting()` returns the text `Hello, World!`
- `greet(String name)` returns a greeting for a particular person, e.g. `greet("Sarah")` returns `Hello, Sarah!`

Then run the `main` method of `HelloWorldWriter` to see the greetings printed in the console.""",
              hints=['Text values in Java are written in double quotes, e.g. `"Hello"`.',
                     'You can join text together with the `+` operator.'],
              done='All the tests in `HelloWorldWriterTest` pass.'),
       ])

module(2, 'data-types-and-variables', 'Java Data Types and Variables', 'module02datatypes',
       ['2.1 Understanding Java Data Types', '2.2 Working with Whole Numbers',
        '2.3 Working with Floating Point Decimals', '2.4 Working with Strings'],
       'These exercises are all in the same style: each test declares a variable and checks its value. '
       'Read the `TODO` comment above each variable and replace the placeholder value with your own code. '
       'The test fails until the value is right.',
       [
           ex('2.1', 'Understanding Java data types', 'Lesson 2.1',
              ['t:WhenUsingDataTypesTest'], ['WhenUsingDataTypesTest'],
              """Declare variables of each of the basic Java types - `int`, `long`, `double`, `boolean`, `char` and `String` -
and a constant, using the values described in the `TODO` comments.""",
              hints=['`long` values need an `L` at the end, e.g. `8_000_000_000L`.',
                     '`char` values use single quotes (`\'A\'`), while `String` values use double quotes (`"A"`).']),
           ex('2.2', 'Working with whole numbers', 'Lesson 2.2',
              ['t:WhenWorkingWithWholeNumbersTest'], ['WhenWorkingWithWholeNumbersTest'],
              """Practise arithmetic with `int` and `long`: operator precedence, integer division and the remainder (`%`),
`++` and `+=`, integer overflow, `Integer.parseInt()` and the `Math` class.""",
              hints=['Integer division throws away the remainder: `17 / 5` is `3`. The `%` operator gives the remainder.',
                     'An `int` cannot hold numbers larger than `Integer.MAX_VALUE`. Convert to `long` _before_ you add.']),
           ex('2.3', 'Working with floating point decimals', 'Lesson 2.3',
              ['t:WhenWorkingWithDecimalsTest'], ['WhenWorkingWithDecimalsTest'],
              """Practise working with `double` values: calculating prices, why `7 / 2` is not `3.5`,
why `0.1 + 0.2` is not exactly `0.3`, rounding, casting and `BigDecimal`.""",
              hints=['Floating point numbers are approximate, so we compare them within a small tolerance, '
                     'with `isCloseTo(expected, within(0.0001))`.']),
           ex('2.4', 'Working with strings', 'Lesson 2.4',
              ['t:WhenWorkingWithStringsTest'], ['WhenWorkingWithStringsTest'],
              """Explore the methods of the `String` class: `length()`, `toUpperCase()`, `substring()`, `indexOf()`,
`contains()`, `replace()`, `split()`, `String.join()`, `trim()`, `equals()` and `StringBuilder`.""",
              hints=['Use your IDE\'s code completion (press `.` after a String variable) to discover the available methods.',
                     'Always compare the _content_ of strings with `equals()`, never with `==`.']),
       ])

module(3, 'classes-and-objects', 'Java Classes and Objects', 'module03classes',
       ['3.1 Understanding Java Classes (no exercise)', '3.2 Classes and fields', '3.3 Private fields'],
       'In this module you write your own classes. The tests for these exercises start out "switched off": '
       'each one contains a `fail("TODO ...")` line and the real test code in comments. '
       'Write the class, then delete the `fail(...)` line and uncomment the test code (in IntelliJ, select the lines and press '
       '`Ctrl+/` or `Cmd+/`).',
       [
           ex('3.2', 'Classes and fields', 'Lesson 3.2',
              ['m:Cat', 't:WhenCreatingACatTest'], ['WhenCreatingACatTest'],
              """Add three public fields to the `Cat` class: a `String` called `name`, a `String` called `favoriteFood`,
and an `int` called `age`. Then enable the tests in `WhenCreatingACatTest`.""",
              hints=['`public String name;` declares a public field.',
                     'Fields that you do not set have default values: `null` for objects, `0` for numbers.']),
           ex('3.3', 'Private fields', 'Lesson 3.3',
              ['m:Dog', 'm:Hamster', 't:WhenUsingPrivateFieldsTest'], ['WhenUsingPrivateFieldsTest'],
              """Public fields can be changed by anybody. Make your classes safer by hiding their fields.

1. Complete `Dog`: three **private** fields (`name`, `favoriteToy`, `age`), a constructor taking all three,
   and a getter for each, e.g. `getName()`.
2. Complete `Hamster`: a private `name` and `age`, a constructor, getters, and a `setAge(int)` method that ignores
   negative ages. A hamster's name can never change, so do not add a `setName()`.
3. Enable the tests in `WhenUsingPrivateFieldsTest`.""",
              hints=['Use `this.name = name;` in a constructor to store the parameter in the field.',
                     'A setter can contain logic. That is one of the reasons we do not make fields public.']),
       ])

module(4, 'fields-and-methods', 'Java Fields and Methods', 'module04methods',
       ['4.1 Defining Methods', '4.2 Static Fields', '4.3 Static Methods'],
       'All three exercises use the `Cat` class in this module, and `TemperatureConverter`. '
       'Read the Javadoc comment above each method to see what it should do.',
       [
           ex('4.1', 'Defining methods', 'Lesson 4.1',
              ['m:Cat'], ['WhenDefiningMethodsTest'],
              """Implement the instance methods of `Cat`: `makeNoise()`, `haveBirthday()`, `isAdult()`, `describe()` and `feed(String)`.""",
              hints=['A method which returns a value uses `return`. A `void` method changes state instead.',
                     'Instance methods can use the fields of the object, such as `name` and `age`.']),
           ex('4.2', 'Static fields', 'Lesson 4.2',
              ['m:Cat'], ['WhenUsingStaticFieldsTest'],
              """Static fields belong to the class, not to any one object.

- Give the `CAT_NOISE` constant the value `"Meow"`.
- Make the constructor count how many cats have been created, by increasing the static `numberOfCats` field.""",
              hints=['Constants are declared `static final` and are named in `UPPER_SNAKE_CASE`.']),
           ex('4.3', 'Static methods', 'Lesson 4.3',
              ['m:Cat', 'm:TemperatureConverter'], ['WhenUsingStaticMethodsTest'],
              """Static methods are called on the class, not on an object.

- Implement `Cat.usualFood()`.
- Implement the three methods of `TemperatureConverter`: `toFahrenheit()`, `toCelsius()` and `isFreezing()`.""",
              hints=['Celsius to Fahrenheit: multiply by 9, divide by 5, add 32.',
                     'Fahrenheit to Celsius: subtract 32, multiply by 5, divide by 9.']),
       ])

module(5, 'language-conventions', 'Java Language Conventions', 'module05conventions',
       ['5.1 Java Conventions'],
       'Java developers follow a set of naming conventions so that everybody can read each other\'s code.',
       [
           ex('5.1', 'Fix the naming conventions', 'Lesson 5.1',
              ['m:OrderSummary'], ['WhenFollowingJavaConventionsTest'],
              """`OrderSummary` works, but it breaks the naming conventions. Rename its fields, constant and methods until
`WhenFollowingJavaConventionsTest` passes. The conventions are:

| Element | Convention | Example |
|---|---|---|
| Classes | `PascalCase` | `OrderSummary` |
| Methods and fields | `camelCase` | `getTotalPrice`, `itemCount` |
| Constants (`static final`) | `UPPER_SNAKE_CASE` | `MAX_ITEMS` |
| Packages | `lowercase` | `com.serenitydojo` |
| Methods returning a boolean | start with `is`, `has` or `can` | `isFull()` |

Fields should also be `private`. Use your IDE's rename refactoring (`Shift+F6` in IntelliJ) so that every usage is updated.""",
              hints=['Do not change the behaviour of the class - only the names and visibility.'],
              done='All the tests in `WhenFollowingJavaConventionsTest` pass.'),
       ])

module(6, 'inheritance-and-polymorphism', 'Inheritance and Polymorphism', 'module06inheritance',
       ['6.1 Basic Inheritance', '6.2 Advanced Inheritance (abstract methods, classes and polymorphism)'],
       '',
       [
           ex('6.1', 'Basic inheritance', 'Lesson 6.1',
              ['m:Dog', 'm:Cat', 't:WhenUsingBasicInheritanceTest'], ['WhenUsingBasicInheritanceTest'],
              """`Pet` is already written: it has a name, a `goForWalks()` method and a default `makeNoise()` method.
Make `Dog` and `Cat` extend it.

- `Dog` has a `favoriteToy`, and makes the noise `Woof`.
- `Cat` has a `favoriteFood`, makes the noise `Meow`, and overrides `goForWalks()` to return `Cats don't go for walks`.

Then delete the `fail(...)` lines and uncomment the tests in `WhenUsingBasicInheritanceTest`.""",
              hints=['`public class Dog extends Pet`', 'Call the parent constructor with `super(name);` as the first line of your constructor.',
                     'Use `@Override` when you replace a method of the parent class.'],
              also=['m:Pet']),
           ex('6.2', 'Abstract methods, abstract classes and polymorphism', 'Lesson 6.2',
              ['m:Circle', 'm:Rectangle', 'm:Square', 't:WhenUsingPolymorphismTest'], ['WhenUsingPolymorphismTest'],
              """`Shape` is an abstract class: every shape has an `area()`, but each kind of shape calculates it differently.

1. Implement `area()` in `Circle` and `Rectangle`.
2. Create `Square` as a subclass of `Rectangle`. Its constructor takes one side length and passes it to the `Rectangle`
   constructor as both the width and the height.
3. Enable the `Square` test in `WhenUsingPolymorphismTest`.

Notice how the last tests treat a `List<Shape>` without caring which kind of shapes are in it. That is polymorphism.""",
              hints=['The area of a circle is `Math.PI * radius * radius`.'],
              also=['m:Shape']),
       ])

module(7, 'conditional-logic', 'Conditional Logic', 'module07conditionals',
       ['7.1 Simple Conditional Logic', '7.2 Nested Conditionals'],
       '',
       [
           ex('7.1', 'Simple conditional logic', 'Lesson 7.1',
              ['m:GradeCalculator', 'm:NumberChecks'], ['WhenUsingSimpleConditionalsTest'],
              """Use `if`, `else if` and `else` to implement:

- `GradeCalculator.gradeFor(int score)`: converts a score into the grade `A`, `B`, `C`, `D` or `F`, or `Invalid`.
- `NumberChecks`: `isEven()`, `largestOf()`, `isLeapYear()` and `fizzBuzz()`.

The rules for each method are in its Javadoc comment.""",
              hints=['Combine conditions with `&&` (and) and `||` (or).',
                     'Think about the order of your checks: a number divisible by 15 is also divisible by 3 and by 5.']),
           ex('7.2', 'Nested conditionals', 'Lesson 7.2',
              ['m:ShippingCalculator', 'm:TicketPricer'], ['WhenUsingNestedConditionalsTest'],
              """Some decisions depend on other decisions. Implement:

- `ShippingCalculator.shippingCost()`: the cost depends on the weight, and on whether the parcel is international
  or express. The price table is in the Javadoc.
- `TicketPricer.priceFor()`: the price of a cinema ticket depends on the person's age, whether they are a student,
  and whether it is the weekend.""",
              hints=['Handle invalid input first, and throw an `IllegalArgumentException`.',
                     'Work out the base price first, then apply the extras.']),
       ])

module(8, 'switches-and-enums', 'Switches and Enums', 'module08enums',
       ['8.1 Switches', '8.2 Enums'],
       '',
       [
           ex('8.1a', 'Switch statements', 'Lesson 8.1',
              ['m:Feeder'], ['WhenFeedingTheAnimalsTest'],
              """Implement `Feeder.feeds(AnimalType, boolean isPremium)` using a `switch` on the animal.
The food for each animal is in the Javadoc. The `AnimalType` and `FoodType` enums are already written.""",
              hints=['Do not forget the `default` case, for animals that the feeder does not know about.']),
           ex('8.1b', 'Switch expressions', 'Lesson 8.1',
              ['m:CalendarHelper'], ['WhenUsingSwitchExpressionsTest'],
              """Modern Java has _switch expressions_, which return a value and use `->` instead of `:`. Implement the three methods of
`CalendarHelper` using them.""",
              hints=['`case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;` lists several values for one result.']),
           ex('8.2', 'Enums', 'Lesson 8.2',
              ['m:TShirtSize', 't:WhenWorkingWithEnumsTest'], ['WhenWorkingWithEnumsTest'],
              """An enum can have fields, a constructor and methods. Give each `TShirtSize` a maximum chest measurement
(`SMALL` = 90, `MEDIUM` = 100, `LARGE` = 110, `EXTRA_LARGE` = 120), add the `getMaxChestCm()` getter, and implement
`forChest()`, which finds the smallest size that fits.""",
              hints=['`SMALL(90)` calls the enum constructor. An enum constructor is always private.',
                     '`TShirtSize.values()` returns all the constants, in the order they are declared.']),
       ])

module(9, 'java-collections', 'Java Collections', 'module09collections',
       ['9.1 Arrays', '9.2 Lists and Sets', '9.3 Live Coding: Advanced Lists'],
       '',
       [
           ex('9.1', 'Arrays', 'Lesson 9.1',
              ['m:ArrayExercises'], ['WhenWorkingWithArraysTest'],
              """Implement the methods of `ArrayExercises`: `sum()`, `largest()`, `reverse()`, `contains()` and `countOccurrences()`.
Use loops - do not use any other collection classes.""",
              hints=['Array indexes start at 0, and the last index is `array.length - 1`.']),
           ex('9.2', 'Lists and sets', 'Lesson 9.2',
              ['m:ListExercises', 'm:SetExercises'], ['WhenWorkingWithListsAndSetsTest'],
              """Implement `ListExercises.combine()`, and the three methods of `SetExercises`: `uniqueWords()`,
`hasDuplicates()` and `commonElements()`.""",
              hints=['A `Set` never contains duplicates. A `TreeSet` also keeps its elements in sorted order.',
                     'Copy a list with `new ArrayList<>(otherList)`.']),
           ex('9.3', 'Advanced lists', 'Lesson 9.3',
              ['m:ListExercises'], ['WhenWorkingWithAdvancedListsTest'],
              """Implement the remaining methods of `ListExercises`: `sortedAlphabetically()`, `namesStartingWith()`,
`longestName()`, `removeShortNames()` and `replaceName()`. None of the methods should change the list that is passed in.""",
              hints=['`Collections.sort()`, `Collections.replaceAll()` and `List.removeIf()` are useful here.',
                     'To avoid changing the original list, make a copy first.']),
       ])

module(10, 'maps', 'Maps', 'module10maps',
       ['10.1 Basic Maps', '10.2 Creating Maps more concisely with Map.of()', '10.3 Reading and writing Map entries',
        '10.4 Iterating over maps'],
       'These tests all use TODO comments: replace the placeholder code with your own.',
       [
           ex('10.1-10.2', 'Creating maps', 'Lessons 10.1 and 10.2',
              ['t:WhenCreatingMapsTest'], ['WhenCreatingMapsTest'],
              """Create maps with `new HashMap<>()` and `put()`, then more concisely with `Map.of(...)`.
Learn that a `Map.of()` map cannot be changed, and how to make a modifiable copy of it.""",
              hints=['`Map.of("red", 3, "green", 6)` takes alternating keys and values.']),
           ex('10.3', 'Reading and writing map entries', 'Lesson 10.3',
              ['t:WhenReadingAndWritingMapEntriesTest'], ['WhenReadingAndWritingMapEntriesTest'],
              """Work with the entries of a map: `get()`, `getOrDefault()`, `containsKey()`, `containsValue()`, `put()`,
`putIfAbsent()`, `replace()`, `remove()` and `merge()`.""",
              hints=['`get()` returns `null` if the key is missing - `getOrDefault()` lets you choose a different value.']),
           ex('10.4', 'Iterating over maps', 'Lesson 10.4',
              ['t:WhenIteratingOverMapsTest', 'm:WordCounter'], ['WhenIteratingOverMapsTest'],
              """Loop over the keys, values and entries of a map, use `forEach`, and keep a map sorted with a `TreeMap`.
Then implement `WordCounter.countWords()`, which counts how many times each word appears in a piece of text.""",
              hints=['A `Map.Entry` has `getKey()` and `getValue()`.',
                     '`counts.merge(word, 1, Integer::sum)` adds one to the count of a word.']),
       ])

module(11, 'making-assertions', 'Making Assertions in Java', 'module11assertions',
       ['11.1 Basic Assertions', '11.2 Assertions about Strings', '11.3 Assertions about collections'],
       'These exercises use [AssertJ](https://assertj.github.io/doc/), which makes assertions easy to read. '
       'Every assertion starts with `assertThat(...)`. Each test sets up some values and describes in a comment what to check. '
       'In the starter project, each test contains a `fail("TODO ...")` line: replace it with your assertion. '
       'Your IDE\'s code completion shows all the assertions that are available after `assertThat(value).`.',
       [
           ex('11.1', 'Basic assertions', 'Lesson 11.1',
              ['t:WhenWritingBasicAssertionsTest'], ['WhenWritingBasicAssertionsTest'],
              """Write assertions about numbers, booleans and `null` values.""",
              hints=['`isEqualTo()`, `isGreaterThan()`, `isBetween()`, `isCloseTo()`, `isTrue()`, `isNull()`.']),
           ex('11.2', 'Assertions about strings', 'Lesson 11.2',
              ['t:WhenWritingAssertionsAboutStringsTest'], ['WhenWritingAssertionsAboutStringsTest'],
              """Write assertions about text: equality, ignoring case, digits, prefixes, suffixes, patterns and length.""",
              hints=['`startsWith()`, `endsWith()`, `contains()`, `containsOnlyDigits()`, `isEqualToIgnoringCase()`, `matches()`.']),
           ex('11.3', 'Assertions about collections', 'Lesson 11.3',
              ['t:WhenWritingAssertionsAboutCollectionsTest'], ['WhenWritingAssertionsAboutCollectionsTest'],
              """Write assertions about lists and maps: contents, size, order, emptiness, conditions on every element and filtering.""",
              hints=['`contains()`, `containsExactly()` (in order), `containsExactlyInAnyOrder()`, `hasSize()`, `isEmpty()`, `allMatch()`.']),
       ])

module(12, 'using-interfaces', 'Using Interfaces', 'module12interfaces',
       ['12.1 Using Interfaces to model domain behaviour'],
       'An interface describes _what_ something can do, without saying _how_. Code that uses the interface does not need to know '
       'which implementation it is working with.',
       [
           ex('12.1', 'Modelling interest-bearing products', 'Lesson 12.1',
              ['m:SavingsAccount', 'm:InterestYieldingBond', 'm:Portfolio'], ['WhenCalculatingMonthlyInterestTest'],
              """`InterestBearing` is an interface with a single method, `monthlyInterest()`. `SavingsAccount` and `InterestYieldingBond` both implement it.

1. Implement `monthlyInterest()` in each class (annual rate divided by 12, applied to the balance or the face value).
2. Implement `Portfolio`, which holds a list of `InterestBearing` things - of any kind - and can add up their interest and find the best.

Notice that `Portfolio` never mentions `SavingsAccount` or `InterestYieldingBond`.""",
              also=['m:InterestBearing']),
           ex('12.2', 'Choosing a pricing strategy', 'Lesson 12.1',
              ['m:StandardPricing', 'm:BlackFridayPricing', 'm:MemberPricing', 'm:Checkout'], ['WhenChoosingAPricingStrategyTest'],
              """A shop can charge for the same goods in different ways. The `PricingStrategy` interface models this.

1. Implement three strategies: `StandardPricing` (full price), `BlackFridayPricing` (30% off) and `MemberPricing` (a percentage discount).
2. Implement `Checkout`, which works out the total of a basket of prices using whichever strategy it is given.

A strategy with a single method can also be written as a lambda, as the last tests demonstrate.""",
              also=['m:PricingStrategy']),
       ])

module(13, 'working-with-exceptions', 'Working with Exceptions', 'module13exceptions',
       ['13.1 Introduction to Java Exceptions', '13.2 Checked and Unchecked Exceptions', '13.3 Catching Exceptions',
        '13.4 Custom Exceptions'],
       '',
       [
           ex('13.1-13.2', 'Introduction to exceptions, and checked and unchecked exceptions', 'Lessons 13.1 and 13.2',
              ['t:WhenWorkingWithExceptionsTest'], ['WhenWorkingWithExceptionsTest'],
              """Each test does something that makes Java throw an exception. Replace the placeholder exception class
with the one that is actually thrown. If you are not sure, run the test: the failure message tells you what was thrown!

Then decide which exceptions are _checked_ (the compiler forces you to handle them) and which are _unchecked_.""",
              hints=['Checked exceptions extend `Exception` but not `RuntimeException`. `IOException` is the best known example.']),
           ex('13.3', 'Catching exceptions', 'Lesson 13.3',
              ['m:SafeReader'], ['WhenCatchingExceptionsTest'],
              """Implement the methods of `SafeReader`, which each have to deal with something going wrong:

- `parseIntOrDefault()`: catch the `NumberFormatException`.
- `divide()`: catch the `ArithmeticException`, and return an empty `Optional`.
- `firstLineOrDefault()`: catch the checked `IOException` when reading a file.
- `welcomeMessage()`: catch an `IOException`, and throw a `MissingWelcomeFileException` which has the original exception as its _cause_.
- `countLines()`: use try-with-resources to make sure the file is always closed.""",
              hints=['`try { ... } catch (SomeException e) { ... }`',
                     'Pass the original exception to the constructor of the new one, so that it is not lost.'],
              also=['m:MissingWelcomeFileException']),
           ex('13.4', 'Custom exceptions', 'Lesson 13.4',
              ['m:InsufficientFundsException', 'm:Wallet'], ['WhenUsingCustomExceptionsTest'],
              """Create your own exception that describes a problem in your domain.

1. Complete `InsufficientFundsException`: it is created with the balance and the amount requested, has the message
   `Insufficient funds: balance 50.00, requested 80.00`, and can report the `getShortfall()`.
2. Complete `Wallet.spend()`: throw an `IllegalArgumentException` for negative amounts, throw an `InsufficientFundsException`
   if there is not enough money, and otherwise reduce the balance.""",
              hints=['Use `super(message)` to pass the message to the `Exception` parent class.',
                     'Use `String.format(Locale.ROOT, "%.2f", value)` to format a number with two decimal places.']),
       ])

module(14, 'advanced-java-topics', 'Advanced Java Topics', 'module14advanced',
       ['14.1 Lambda Expressions Deep Dive', '14.2 Working With Streams', '14.3 Introduction To Lambda Expressions',
        '14.4 Working With The Java Date APIs', '14.5 Working With Vars and Records', '14.6 Advanced Enums',
        '14.7 Working With Excel Spreadsheets'],
       'The exercises in this module follow the order of the lessons in the course outline. '
       'The lessons were recorded as live coding sessions, so you can also use these exercises to practise along with them.',
       [
           ex('14.1', 'Lambda expressions deep dive', 'Lesson 14.1',
              ['t:WhenUsingLambdasTest'], ['WhenUsingLambdasTest'],
              """Write lambda expressions for the main functional interfaces: `Function`, `BiFunction`, `Predicate`, `Supplier`
and `Consumer`. Then use method references, combine functions with `andThen()`, combine predicates with `negate()` and `and()`,
and use a variable from the surrounding code inside a lambda.""",
              hints=['`x -> x * 2` is a lambda with one parameter. `(a, b) -> a + b` has two. `() -> "Hello"` has none.']),
           ex('14.2', 'Working with streams', 'Lesson 14.2',
              ['m:TransactionAnalyser'], ['WhenWorkingWithStreamsTest'],
              """`TransactionAnalyser` analyses a list of bank `Transaction`s (deposits are positive, withdrawals are negative).
Implement each method using the Stream API (`transactions.stream()`) rather than loops.""",
              hints=['`filter()`, `map()`, `mapToDouble()`, `sum()`, `count()`, `max()`, `min()`, `distinct()`, `sorted()`, `allMatch()`.',
                     '`Collectors.groupingBy(classifier, Collectors.summingDouble(...))` groups items into a map.',
                     '`Comparator.comparingDouble(Transaction::amount)` compares transactions by amount.'],
              also=['m:Transaction']),
           ex('14.3', 'Introduction to lambda expressions', 'Lesson 14.3',
              ['m:LambdaExercises'], ['WhenUsingLambdasWithCollectionsTest'],
              """The methods of `LambdaExercises` take a lambda as a parameter: for example `filter(items, condition)`.
Implement them using ordinary loops. The tests pass in different lambdas, and your code applies them.""",
              hints=['A `Predicate` is used with `test(item)`, a `Function` with `apply(item)`, and a `Consumer` with `accept(item)`.']),
           ex('14.4', 'Working with the Java date APIs', 'Lesson 14.4',
              ['t:WhenWorkingWithDatesTest'], ['WhenWorkingWithDatesTest'],
              """Use the classes of the `java.time` package: `LocalDate`, `LocalTime`, `LocalDateTime`, `Period`, `Duration`,
`ChronoUnit` and `DateTimeFormatter`. Create dates, do date arithmetic, compare and measure dates, and format them.""",
              hints=['The `java.time` classes are immutable: `date.plusDays(1)` returns a new date and does not change `date`.',
                     'Months are numbered from 1 (January) in `LocalDate.of(2024, 3, 15)`.']),
           ex('14.5', 'Working with var and records', 'Lesson 14.5',
              ['m:Book', 't:WhenUsingRecordsTest', 't:WhenUsingVarTest'], ['WhenUsingRecordsTest', 'WhenUsingVarTest'],
              """**Records:** turn the `Book` class into a record with the components `title`, `author` and `pages`.
Add a compact constructor which rejects books with no pages, and an `isLong()` method (more than 500 pages).
Then enable the tests in `WhenUsingRecordsTest`.

**var:** in `WhenUsingVarTest`, declare each variable with `var` instead of writing out its type.""",
              hints=['`public record Book(String title, String author, int pages) { }`',
                     'A record automatically gets accessors (`title()`), `equals()`, `hashCode()` and `toString()`.']),
           ex('14.6', 'Advanced enums', 'Lesson 14.6',
              ['m:Operation'], ['WhenUsingAdvancedEnumsTest'],
              """Complete the `Operation` enum so that each constant has a symbol and its own behaviour, using a `DoubleBinaryOperator`:
`ADD("+", (a, b) -> a + b)`. Implement `getSymbol()`, `apply()` and `fromSymbol()`.
`DIVIDE` should throw an `ArithmeticException` when dividing by zero.""",
              hints=['The enum constructor takes the symbol and the operator, and stores them in private final fields.']),
           ex('14.7', 'Working with Excel spreadsheets', 'Lesson 14.7',
              ['m:FruitPriceSheet'], ['WhenWorkingWithExcelSpreadsheetsTest'],
              """Use [Apache POI](https://poi.apache.org/) to read and write spreadsheets. Implement `FruitPriceSheet`:

- `readPrices()` reads the fruit names (column A) and prices (column B) from a spreadsheet, skipping the header row.
  The test reads [`fruit-prices.xlsx`](../../src/test/resources/spreadsheets/fruit-prices.xlsx).
- `writePrices()` writes a map of prices to a new `.xlsx` file, with a header row.""",
              hints=['`new XSSFWorkbook(inputStream)` opens an `.xlsx` file, and `new XSSFWorkbook()` creates a new one.',
                     '`sheet.getRow(n)`, `row.getCell(n)`, `cell.getStringCellValue()`, `cell.getNumericCellValue()`.',
                     'Use try-with-resources so that the workbook is always closed.']),
       ])

module(15, 'unit-testing-with-junit-6', 'Introduction to Unit Testing with JUnit 6', 'module15junit',
       ['15.1 Introduction to JUnit 6', '15.2 Installing The Sample Project', '15.3 Your First JUnit 6 Test',
        '15.4 The JUnit 6 Test Lifecycle', '15.5 Writing Good Assertions', '15.6 Naming Your Tests',
        '15.7 Grouping Tests With @Nested', '15.8 Data Driven Tests In JUnit 6', '15.9 Testing Exceptions in JUnit 6',
        '15.10 Using Tags In JUnit 6', '15.11 JUnit 6 Comprehensive Exercise', '15.12 JUnit 6 Comprehensive Exercise (part 2)'],
       'In this module you stop writing the code, and start writing the tests. The classes under test are already written: '
       '`Basket`, `PasswordValidator` and `ParkingFeeCalculator`. Read them first, so that you know what they should do. '
       'Several of these exercises (15.6, 15.7 and 15.10) are about the _structure_ of tests, so they come with an extra test '
       'which checks that you have restructured the tests correctly.',
       [
           ex('15.1-15.2', 'Introduction to JUnit 6, and installing the sample project', 'Lessons 15.1 and 15.2',
              [], ['WhenSettingUpJUnitTest'],
              """Make sure that JUnit 6 is working in your project. Run `WhenSettingUpJUnitTest` from your IDE, and from the command line.
You do not need to change any code in this exercise.""",
              done='Both tests pass.'),
           ex('15.3', 'Your first JUnit 6 test', 'Lesson 15.3',
              ['t:WhenCreatingABasketTest'], ['WhenCreatingABasketTest'],
              """Write four tests for the `Basket` class. Each `TODO` comment describes the test to write.
Replace the `fail(...)` line with your test, using the `@Test` annotation (already there) and AssertJ assertions.""",
              hints=['Structure your tests as _arrange_ (set up), _act_ (do something) and _assert_ (check the result).'],
              also=['m:Basket']),
           ex('15.4', 'The JUnit 6 test lifecycle', 'Lesson 15.4',
              ['t:WhenUsingTheTestLifecycleTest'], ['WhenUsingTheTestLifecycleTest'],
              """The tests in this class need a `Basket` that has been created _before each test_, and some bookkeeping which
records when the lifecycle methods run. Add the four lifecycle methods described in the class comment:
`@BeforeAll`, `@BeforeEach`, `@AfterEach` and `@AfterAll`.""",
              hints=['`@BeforeAll` and `@AfterAll` methods must be `static`.',
                     'JUnit creates a new instance of the test class for each test, so fields are not shared between tests.']),
           ex('15.5', 'Writing good assertions', 'Lesson 15.5',
              ['t:WhenWritingGoodAssertionsTest'], ['WhenWritingGoodAssertionsTest'],
              """Write assertions about a `Basket` that contains some items. Choose the clearest assertion for each case:
`extracting()`, `isCloseTo()`, `allMatch()`, `filteredOn()`, descriptions with `as()`, `SoftAssertions`, `isEmpty()`
and checking for an exception.""",
              hints=['Good assertions say what you mean: `assertThat(list).isEmpty()` is clearer than `assertThat(list.size()).isEqualTo(0)`.']),
           ex('15.6', 'Naming your tests', 'Lesson 15.6',
              ['t:WhenNamingTestsTest'], ['TestNamingStandardsTest'],
              """The tests in `WhenNamingTestsTest` work, but they are called `test1`, `test2` and `test3`. Rename each of them so the name says what
behaviour is being tested (for example `shouldIncreaseTheItemCountWhenAnItemIsAdded`), and add a `@DisplayName` which describes
the test as a readable sentence.

Run `TestNamingStandardsTest` to check your work.""",
              hints=['A good test name tells you what is wrong when the test fails, without having to read the test.']),
           ex('15.7', 'Grouping tests with @Nested', 'Lesson 15.7',
              ['t:WhenCheckingOutABasketTest'], ['NestedTestStructureTest', 'WhenCheckingOutABasketTest*'],
              """All the tests in `WhenCheckingOutABasketTest` are in one flat list. Reorganise them into two `@Nested` classes:
one for the tests where the basket is empty, and one for the tests where the basket has items.
Move the setup code into a `@BeforeEach` method in each nested class.

Run `NestedTestStructureTest` to check your work, and run `WhenCheckingOutABasketTest` to make sure all five tests still pass.""",
              hints=['A nested class is a non-static inner class annotated with `@Nested`.',
                     'Each nested class can have its own `@BeforeEach`.']),
           ex('15.8', 'Data driven tests', 'Lesson 15.8',
              ['t:WhenValidatingPasswordsTest'], ['WhenValidatingPasswordsTest'],
              """The `PasswordValidator` should accept strong passwords (at least 8 characters, with an upper case letter,
a lower case letter, a digit and a special character) and reject everything else.

Turn each of the five placeholder tests into a parameterized test, which runs once for each data value:
`@ValueSource`, `@NullAndEmptySource`, `@CsvSource` and `@MethodSource`.""",
              hints=['Replace `@Test` with `@ParameterizedTest`, and add a parameter to the method for the test data.',
                     'Use `@ParameterizedTest(name = "...")` with `{0}` and `{1}` to make the test names readable.'],
              also=['m:PasswordValidator']),
           ex('15.9', 'Testing exceptions', 'Lesson 15.9',
              ['t:WhenTestingExceptionsTest'], ['WhenTestingExceptionsTest'],
              """Write tests that check that `Basket` rejects bad input, using `assertThrows()` and AssertJ's `assertThatThrownBy()`.
Check the type of the exception, and its message.""",
              hints=['`assertThrows(SomeException.class, () -> codeThatThrows());`',
                     '`assertThatThrownBy(() -> code()).isInstanceOf(...).hasMessage(...)`']),
           ex('15.10', 'Using tags', 'Lesson 15.10',
              ['t:WhenUsingTagsTest'], ['TagsAreAppliedTest'],
              """Tag the tests in `WhenUsingTagsTest`: the two quick tests as `@Tag("smoke")`, and the two long-running ones as `@Tag("slow")`.

Then run just some of the tests from the command line:

```
mvn test -Dtest=WhenUsingTagsTest -Dgroups=smoke
mvn test -Dtest=WhenUsingTagsTest -DexcludedGroups=slow
```

Run `TagsAreAppliedTest` to check your work.""",
              hints=['Tags can be put on a method or on a whole class.']),
           ex('15.11', 'Comprehensive exercise (part 1)', 'Lesson 15.11',
              ['t:ParkingFeeCalculatorTest'], ['ParkingFeeCalculatorTest'],
              """Write a complete set of tests for `ParkingFeeCalculator.feeFor(int hours)`. The rules are in the Javadoc of the class:

- The first hour is free.
- Each extra hour costs 2.50.
- The fee for a day never exceeds 20.00 (test the boundary: the number of hours where the cap starts to apply).
- Stays of fewer than 1 or more than 24 hours are rejected with an `IllegalArgumentException`.

Use everything from this module: clear names and `@DisplayName`s, `@Nested` groups, parameterized tests,
exception tests, and precise assertions.""",
              done='Your tests pass, and they would fail if any of the rules in `ParkingFeeCalculator` were broken.',
              also=['m:ParkingFeeCalculator']),
           ex('15.12', 'Comprehensive exercise (part 2): test-driven development', 'Lesson 15.12',
              ['m:ParkingFeeCalculator'], ['WhenParkingAtTheWeekendTest'],
              """The tests for the weekend rates are already written in `WhenParkingAtTheWeekendTest`, and they fail. Read them,
and then implement `feeFor(int hours, DayOfWeek day)` in `ParkingFeeCalculator` until they all pass.
The weekend rules are in the Javadoc of the class.

This is _test-driven development_: write a failing test first, and then write the simplest code that makes it pass.""",
              hints=['Saturdays and Sundays use the weekend rates. All other days use the existing `feeFor(int hours)` method.',
                     'The test cases are a specification: look at the edge cases they test.']),
       ])
# Module 16 is written by hand (see below)


# ---------------------------------------------------------------------------
def code_path(kind, name, pkg):
    base = 'src/main/java' if kind == 'm' else 'src/test/java'
    return f'{ROOT}{base}/com/serenitydojo/{pkg}/{name}.java'


def render(mod):
    pkg = mod['package']
    lines = [f"# Module {mod['num']} — {mod['title']}", '']
    lines.append('**Lessons**')
    lines.append('')
    for lesson in mod['lessons']:
        lines.append(f'- {lesson}')
    lines.append('')
    if mod['intro']:
        lines += [mod['intro'], '']
    lines += ['**Run all the tests for this module**', '', '```',
              f'mvn test -Dtest="**/{pkg}/*"', '```', '',
              f'The code for this module is in the `com.serenitydojo.{pkg}` package, under `src/main/java` and `src/test/java`.', '',
              '---', '']
    for e in mod['exercises']:
        lines += [f"## Exercise {e['id']} — {e['title']}", '', f"_{e['lesson']}_", '']
        files = []
        for f in e['edit']:
            kind, name = f.split(':')
            files.append(f'[`{name}.java`]({code_path(kind, name, pkg)})')
        if files:
            lines += ['**Edit:** ' + ', '.join(files), '']
        if e['also']:
            others = []
            for f in e['also']:
                kind, name = f.split(':')
                others.append(f'[`{name}.java`]({code_path(kind, name, pkg)})')
            lines += ['**Read:** ' + ', '.join(others) + ' (already complete)', '']
        lines += ['**Your task**', '', e['task'], '']
        if e['hints']:
            lines += ['**Hints**', '']
            lines += [f'- {h}' for h in e['hints']]
            lines.append('')
        lines += ['**Check your work**', '', '```']
        for r in e['run']:
            lines.append(f'mvn test -Dtest={r}')
        lines += ['```', '']
        done = e['done'] or ('All the tests in ' + ' and '.join(f'`{r}`' for r in e['run']) + ' pass.')
        lines += [f'**Done when:** {done}', '', '---', '']
    if mod['notes']:
        lines += [mod['notes'], '']
    return '\n'.join(lines).rstrip() + '\n'


for mod in MODULES:
    folder = OUT / f"module-{mod['num']:02d}-{mod['slug']}"
    folder.mkdir(parents=True, exist_ok=True)
    (folder / 'README.md').write_text(render(mod), encoding='utf-8')
print(f'wrote {len(MODULES)} module READMEs')
