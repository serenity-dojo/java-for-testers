package com.serenitydojo.module15junit;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;
//@@ starter
import static org.junit.jupiter.api.Assertions.fail;
//@@ end

/**
 * Exercise 15.9: Testing exceptions in JUnit 6.
 */
class WhenTestingExceptionsTest {

    private final Basket basket = new Basket();

    @Test
    void anItemMustHaveAName() {
        // TODO: check that adding an item with a blank name ("") throws an IllegalArgumentException,
        //       using assertThrows(...)
//@@ solution
        assertThrows(IllegalArgumentException.class, () -> basket.add("", 1.00, 1));
//@@ starter
        fail("TODO: write this test");
//@@ end
    }

    @Test
    void thePriceCannotBeNegative() {
        // TODO: check that adding an item with a price of -1.00 throws an IllegalArgumentException
        //       with the message "The price cannot be negative". Use assertThatThrownBy(...)
//@@ solution
        assertThatThrownBy(() -> basket.add("Apple", -1.00, 1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("The price cannot be negative");
//@@ starter
        fail("TODO: write this test");
//@@ end
    }

    @Test
    void theQuantityMustBeAtLeastOne() {
        // TODO: check that adding an item with a quantity of 0 is rejected with an IllegalArgumentException
        //       whose message contains the words "at least one". Use assertThatThrownBy(...)
//@@ solution
        assertThatThrownBy(() -> basket.add("Apple", 1.00, 0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("at least one");
//@@ starter
        fail("TODO: write this test");
//@@ end
    }

    @Test
    void removingAnItemThatIsNotInTheBasketIsAnError() {
        // TODO: check that removing "Apple" from an empty basket throws a NoSuchElementException,
        //       and that the message mentions "Apple"
//@@ solution
        NoSuchElementException exception = assertThrows(NoSuchElementException.class, () -> basket.remove("Apple"));

        assertThat(exception).hasMessageContaining("Apple");
//@@ starter
        fail("TODO: write this test");
//@@ end
    }

    @Test
    void aFailedAddShouldNotChangeTheBasket() {
        // TODO: try to add an invalid item (catching or asserting the exception), and then check
        //       that the basket is still empty
//@@ solution
        assertThrows(IllegalArgumentException.class, () -> basket.add("Apple", -1.00, 1));

        assertThat(basket.isEmpty()).isTrue();
//@@ starter
        fail("TODO: write this test");
//@@ end
    }

    @Test
    void validItemsShouldNotThrowAnything() {
        // TODO: check that adding a valid item does not throw an exception. Hint: assertThatNoException()
//@@ solution
        org.assertj.core.api.Assertions.assertThatNoException().isThrownBy(() -> basket.add("Apple", 0.50, 2));
//@@ starter
        fail("TODO: write this test");
//@@ end
    }
}
