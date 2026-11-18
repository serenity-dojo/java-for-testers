package com.serenitydojo.module15junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Exercise 15.5: Writing good assertions.
 * <p>
 * Write assertions for each situation, using AssertJ (assertThat) to make them as clear as possible.
 */
class WhenWritingGoodAssertionsTest {

    private Basket basket;

    @BeforeEach
    void createABasketWithSomeItems() {
        basket = new Basket();
        basket.add("Apple", 0.50, 6);
        basket.add("Pear", 0.75, 4);
        basket.add("Melon", 2.25, 1);
    }

    @Test
    void checkTheNamesOfTheItems() {
        // TODO: check that the names of the items are exactly "Apple", "Pear" and "Melon", in that order.
        //       Hint: assertThat(basket.items()).extracting(...)
        fail("TODO: write this assertion");
    }

    @Test
    void checkTheTotalAllowingForRounding() {
        // TODO: check that the total is 8.25, within 0.001. Decimal calculations are rarely exact
        fail("TODO: write this assertion");
    }

    @Test
    void checkSeveralPropertiesOfOneItem() {
        // TODO: take the first item, and check its name, price and quantity.
        //       Hint: assertThat(item.name())... or use assertThat(item).isEqualTo(new Basket.Item(...))
        fail("TODO: write this assertion");
    }

    @Test
    void checkThatEveryItemHasAPositiveQuantity() {
        // TODO: check that every item has a quantity above zero. Hint: allMatch(...)
        fail("TODO: write this assertion");
    }

    @Test
    void checkTheExpensiveItems() {
        // TODO: check that only the Melon costs more than 1.00. Hint: filteredOn(...)
        fail("TODO: write this assertion");
    }

    @Test
    void addADescriptionToMakeFailuresEasierToUnderstand() {
        // TODO: check that the item count is 11, and add a description using .as("...")
        //       which will be shown if the assertion fails
        fail("TODO: write this assertion");
    }

    @Test
    void checkSeveralThingsAtOnceSoThatAllFailuresAreReported() {
        // TODO: use SoftAssertions to check that the total is close to 8.25 AND the item count is 11.
        //       Soft assertions report every failure, not just the first one.
        //       Hint: SoftAssertions.assertSoftly(softly -> { softly.assertThat(...)...; });
        fail("TODO: write this assertion");
    }

    @Test
    void checkThatAnEmptyListOfItemsIsDetected() {
        Basket emptyBasket = new Basket();

        // TODO: check that the items of the empty basket are empty (not that the size is zero)
        fail("TODO: write this assertion");
    }

    @Test
    void theItemListCannotBeModifiedFromOutside() {
        List<Basket.Item> items = basket.items();

        // TODO: check that trying to clear the list throws an UnsupportedOperationException
        fail("TODO: write this assertion");
    }
}
