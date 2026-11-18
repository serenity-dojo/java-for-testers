package com.serenitydojo.module15junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.within;
//@@ starter
import static org.junit.jupiter.api.Assertions.fail;
//@@ end

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
//@@ solution
        assertThat(basket.items())
                .extracting(Basket.Item::name)
                .containsExactly("Apple", "Pear", "Melon");
//@@ starter
        fail("TODO: write this assertion");
//@@ end
    }

    @Test
    void checkTheTotalAllowingForRounding() {
        // TODO: check that the total is 8.25, within 0.001. Decimal calculations are rarely exact
//@@ solution
        assertThat(basket.total()).isCloseTo(8.25, within(0.001));
//@@ starter
        fail("TODO: write this assertion");
//@@ end
    }

    @Test
    void checkSeveralPropertiesOfOneItem() {
        // TODO: take the first item, and check its name, price and quantity.
        //       Hint: assertThat(item.name())... or use assertThat(item).isEqualTo(new Basket.Item(...))
//@@ solution
        Basket.Item firstItem = basket.items().get(0);

        assertThat(firstItem).isEqualTo(new Basket.Item("Apple", 0.50, 6));
//@@ starter
        fail("TODO: write this assertion");
//@@ end
    }

    @Test
    void checkThatEveryItemHasAPositiveQuantity() {
        // TODO: check that every item has a quantity above zero. Hint: allMatch(...)
//@@ solution
        assertThat(basket.items()).allMatch(item -> item.quantity() > 0);
//@@ starter
        fail("TODO: write this assertion");
//@@ end
    }

    @Test
    void checkTheExpensiveItems() {
        // TODO: check that only the Melon costs more than 1.00. Hint: filteredOn(...)
//@@ solution
        assertThat(basket.items())
                .filteredOn(item -> item.price() > 1.00)
                .extracting(Basket.Item::name)
                .containsExactly("Melon");
//@@ starter
        fail("TODO: write this assertion");
//@@ end
    }

    @Test
    void addADescriptionToMakeFailuresEasierToUnderstand() {
        // TODO: check that the item count is 11, and add a description using .as("...")
        //       which will be shown if the assertion fails
//@@ solution
        assertThat(basket.itemCount()).as("number of things in the basket").isEqualTo(11);
//@@ starter
        fail("TODO: write this assertion");
//@@ end
    }

    @Test
    void checkSeveralThingsAtOnceSoThatAllFailuresAreReported() {
        // TODO: use SoftAssertions to check that the total is close to 8.25 AND the item count is 11.
        //       Soft assertions report every failure, not just the first one.
        //       Hint: SoftAssertions.assertSoftly(softly -> { softly.assertThat(...)...; });
//@@ solution
        org.assertj.core.api.SoftAssertions.assertSoftly(softly -> {
            softly.assertThat(basket.total()).isCloseTo(8.25, within(0.001));
            softly.assertThat(basket.itemCount()).isEqualTo(11);
        });
//@@ starter
        fail("TODO: write this assertion");
//@@ end
    }

    @Test
    void checkThatAnEmptyListOfItemsIsDetected() {
        Basket emptyBasket = new Basket();

        // TODO: check that the items of the empty basket are empty (not that the size is zero)
//@@ solution
        assertThat(emptyBasket.items()).isEmpty();
//@@ starter
        fail("TODO: write this assertion");
//@@ end
    }

    @Test
    void theItemListCannotBeModifiedFromOutside() {
        List<Basket.Item> items = basket.items();

        // TODO: check that trying to clear the list throws an UnsupportedOperationException
//@@ solution
        assertThatThrownBy(items::clear).isInstanceOf(UnsupportedOperationException.class);
//@@ starter
        fail("TODO: write this assertion");
//@@ end
    }
}
