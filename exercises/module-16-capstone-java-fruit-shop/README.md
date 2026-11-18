# Module 16 — Capstone Project: The Java Fruit Shop

**Lessons**

- The Java Fruit Shop Challenge (this written brief — read it _before_ the video)
- 16.1 Java Fruit Shop Solution — Live Coding Demo

This is your chance to bring together everything you have learned in the course: classes, fields and methods, enums, collections,
maps, exceptions, lambdas and streams, and unit testing.

**Do not watch the solution video first.** Try the challenge yourself, and then watch the demo to compare your approach with the
one in the video. There is more than one correct way to write it.

**Run all the tests for this module**

```
mvn test -Dtest="**/module16fruitshop/*"
```

The code for this module is in the `com.serenitydojo.module16fruitshop` package, under `src/main/java` and `src/test/java`.

---

## The brief

A local greengrocer wants to sell fruit online. You have been asked to write the core of the shop: a **catalog** that records which fruit
is for sale and what it costs, and a **shopping cart** that uses the catalog to work out what a customer has to pay.

### The fruit

The `Fruit` enum lists the kinds of fruit that the shop can sell: `Apple`, `Orange`, `Banana`, `Pear`, `Peach`, `Strawberries` and `Mulberries`.
Not every fruit is available all year, so the catalog only contains the fruit that is currently in season.

### The catalog

The `Catalog` stores the price per kilo of each fruit that is currently available. The prices are set using a fluent style, so that
several prices can be set in a single statement:

```java
Catalog catalog = new Catalog();
catalog.setPriceOf(Apple).to(4.00)
       .setPriceOf(Orange).to(5.50)
       .setPriceOf(Banana).to(4.50)
       .setPriceOf(Pear).to(4.50);
```

The catalog must be able to:

| Method | Behaviour |
|---|---|
| `setPriceOf(fruit).to(price)` | Sets (or updates) the price per kilo of a fruit, and returns the catalog so that calls can be chained |
| `getPriceOf(fruit)` | Returns the price per kilo of a fruit |
| `getAvailableFruit()` | Returns the **names** of the fruit in the catalog, as a list in alphabetical order (e.g. `["Apple", "Banana", "Orange", "Pear"]`) |

If you ask for the price of a fruit that is not in the catalog, a `FruitUnavailableException` is thrown, with a message such as
`Strawberries currently unavailable`.

### The shopping cart

A `ShoppingCart` is created for a catalog. Customers add fruit to the cart, again in a fluent style:

```java
ShoppingCart cart = new ShoppingCart(catalog);
cart.add(2.0).kilosOf(Apple)
    .add(1.5).kilosOf(Pear);
```

The cart must be able to:

| Method | Behaviour |
|---|---|
| `add(kilos).kilosOf(fruit)` | Adds that amount of the fruit to the cart, using the price in the catalog, and returns the cart so that calls can be chained |
| `getItems()` | Returns the items in the cart as a list of `ShoppingCartItem`s, in the order they were added. Changing the returned list must not change the cart |
| `getTotalPrice()` | Returns the total price of everything in the cart |

Each `ShoppingCartItem` records the fruit, the quantity (in kilos), and the total cost of that item.

Trying to add a fruit which is not in the catalog throws a `FruitUnavailableException`, and the cart is not changed.

### Bulk discounts

Customers who buy in bulk get a discount: if a customer adds **5 kilos or more** of a fruit in one go, that item is **10% cheaper**.
The discount applies only to the items that qualify, not to the whole cart.

For example, with the prices above:

| Cart | Total |
|---|---|
| 2 kilos of apples, 2 kilos of oranges, 1 kilo of pears | 2 × 4.00 + 2 × 5.50 + 1 × 4.50 = **23.50** |
| 10 kilos of apples | 10 × 4.00 × 0.9 = **36.00** |
| 10 kilos of apples, 2 kilos of oranges | 36.00 + 2 × 5.50 = **47.00** |

---

## Exercise 16.1 — Build the Java Fruit Shop

**Edit:** [`Catalog.java`](../../src/main/java/com/serenitydojo/module16fruitshop/Catalog.java), [`ShoppingCart.java`](../../src/main/java/com/serenitydojo/module16fruitshop/ShoppingCart.java)

**Read:** [`Fruit.java`](../../src/main/java/com/serenitydojo/module16fruitshop/Fruit.java), [`ShoppingCartItem.java`](../../src/main/java/com/serenitydojo/module16fruitshop/ShoppingCartItem.java), [`FruitUnavailableException.java`](../../src/main/java/com/serenitydojo/module16fruitshop/FruitUnavailableException.java) (already complete)

**Tests:** [`TheCatalogTest.java`](../../src/test/java/com/serenitydojo/module16fruitshop/TheCatalogTest.java), [`TheShoppingCartTest.java`](../../src/test/java/com/serenitydojo/module16fruitshop/TheShoppingCartTest.java)

**Your task**

The tests already describe the behaviour in the brief, and the classes are set up with the method signatures and `TODO` comments.
Implement `Catalog` and then `ShoppingCart`, one test at a time, until everything passes.

**Hints**

- Start with the catalog: a `Map<Fruit, Double>` is a good way to store the prices.
- The `setPriceOf(fruit)` method returns a small helper object (`PriceSetter`) which remembers the fruit, so that its `to(price)` method knows which price to set.
  `add(kilos)` and `kilosOf(fruit)` in the cart work in the same way.
- `getAvailableFruit()` is a good place to use a stream: `keySet().stream().map(Enum::name).sorted()`.
- Work on one test at a time. Run the whole test class after each change.
- Floating point arithmetic is approximate, so the tests compare prices with `isCloseTo(..., within(0.001))`.

**Check your work**

```
mvn test -Dtest=TheCatalogTest
mvn test -Dtest=TheShoppingCartTest
```

**Done when:** All the tests in `TheCatalogTest` and `TheShoppingCartTest` pass.

---

## Stretch goals

Finished early? Try these extensions. Write a test first for each one!

1. **Removing items:** add a way to remove a fruit from the cart.
2. **Better discounts:** give a 15% discount for 10 kilos or more, and keep the 10% discount for 5 kilos or more.
3. **A receipt:** add a `getReceipt()` method which returns a list of lines such as `2.0 kilos of Apple: 8.00`, followed by the total.
4. **Merging items:** if the same fruit is added twice, combine the two into a single item (and think about what that does to the discount).
5. **Stock levels:** make the catalog track how many kilos of each fruit are in stock, and refuse to sell more than the shop has.
