package com.serenitydojo.module15junit;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Exercise 15.9: Testing exceptions in JUnit 6.
 */
class WhenTestingExceptionsTest {

    private final Basket basket = new Basket();

    @Test
    void anItemMustHaveAName() {
        // TODO: check that adding an item with a blank name ("") throws an IllegalArgumentException,
        //       using assertThrows(...)
        fail("TODO: write this test");
    }

    @Test
    void thePriceCannotBeNegative() {
        // TODO: check that adding an item with a price of -1.00 throws an IllegalArgumentException
        //       with the message "The price cannot be negative". Use assertThatThrownBy(...)
        fail("TODO: write this test");
    }

    @Test
    void theQuantityMustBeAtLeastOne() {
        // TODO: check that adding an item with a quantity of 0 is rejected with an IllegalArgumentException
        //       whose message contains the words "at least one". Use assertThatThrownBy(...)
        fail("TODO: write this test");
    }

    @Test
    void removingAnItemThatIsNotInTheBasketIsAnError() {
        // TODO: check that removing "Apple" from an empty basket throws a NoSuchElementException,
        //       and that the message mentions "Apple"
        fail("TODO: write this test");
    }

    @Test
    void aFailedAddShouldNotChangeTheBasket() {
        // TODO: try to add an invalid item (catching or asserting the exception), and then check
        //       that the basket is still empty
        fail("TODO: write this test");
    }

    @Test
    void validItemsShouldNotThrowAnything() {
        // TODO: check that adding a valid item does not throw an exception. Hint: assertThatNoException()
        fail("TODO: write this test");
    }
}
