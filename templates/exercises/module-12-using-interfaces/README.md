# Module 12 — Using Interfaces

**Lessons**

- 12.1 Using Interfaces to model domain behaviour

An interface describes _what_ something can do, without saying _how_. Code that uses the interface does not need to know which implementation it is working with.

**Run all the tests for this module**

```
mvn test -Dtest="**/module12interfaces/*"
```

The code for this module is in the `com.serenitydojo.module12interfaces` package, under `src/main/java` and `src/test/java`.

---

## Exercise 12.1 — Modelling interest-bearing products

_Lesson 12.1_

**Edit:** [`SavingsAccount.java`](../../src/main/java/com/serenitydojo/module12interfaces/SavingsAccount.java), [`InterestYieldingBond.java`](../../src/main/java/com/serenitydojo/module12interfaces/InterestYieldingBond.java), [`Portfolio.java`](../../src/main/java/com/serenitydojo/module12interfaces/Portfolio.java)

**Read:** [`InterestBearing.java`](../../src/main/java/com/serenitydojo/module12interfaces/InterestBearing.java) (already complete)

**Your task**

`InterestBearing` is an interface with a single method, `monthlyInterest()`. `SavingsAccount` and `InterestYieldingBond` both implement it.

1. Implement `monthlyInterest()` in each class (annual rate divided by 12, applied to the balance or the face value).
2. Implement `Portfolio`, which holds a list of `InterestBearing` things - of any kind - and can add up their interest and find the best.

Notice that `Portfolio` never mentions `SavingsAccount` or `InterestYieldingBond`.

**Check your work**

```
mvn test -Dtest=WhenCalculatingMonthlyInterestTest
```

**Done when:** All the tests in `WhenCalculatingMonthlyInterestTest` pass.

---

## Exercise 12.2 — Choosing a pricing strategy

_Lesson 12.1_

**Edit:** [`StandardPricing.java`](../../src/main/java/com/serenitydojo/module12interfaces/StandardPricing.java), [`BlackFridayPricing.java`](../../src/main/java/com/serenitydojo/module12interfaces/BlackFridayPricing.java), [`MemberPricing.java`](../../src/main/java/com/serenitydojo/module12interfaces/MemberPricing.java), [`Checkout.java`](../../src/main/java/com/serenitydojo/module12interfaces/Checkout.java)

**Read:** [`PricingStrategy.java`](../../src/main/java/com/serenitydojo/module12interfaces/PricingStrategy.java) (already complete)

**Your task**

A shop can charge for the same goods in different ways. The `PricingStrategy` interface models this.

1. Implement three strategies: `StandardPricing` (full price), `BlackFridayPricing` (30% off) and `MemberPricing` (a percentage discount).
2. Implement `Checkout`, which works out the total of a basket of prices using whichever strategy it is given.

A strategy with a single method can also be written as a lambda, as the last tests demonstrate.

**Check your work**

```
mvn test -Dtest=WhenChoosingAPricingStrategyTest
```

**Done when:** All the tests in `WhenChoosingAPricingStrategyTest` pass.

---
