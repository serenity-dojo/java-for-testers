package com.serenitydojo.shoppingcart;

import org.junit.Assert;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WhenCalculatingTotalPrice {


    /**
     * TODO:
     * Write a test that checks the following scenario:
     *  - Add the following items to a shopping cart:
     *         - 2 kg rice at 4.99 each
     *         - 3 litres of milk at 3.99
     *         - 1 bag of apples at 6.99
     *         - 1 bag of oranges at 7.99
     *  - Proceed to the checkout
     *  - The total should be 36.93
     *
     */
    @Test
    public void shouldCalculatePriceWhenArticlesAreAddedToTheCart() {
        double totalPrice = totalPriceOf(
                                AShoppingCart.with(2).bagsOf("Rice").eachCosting(4.99)
                                             .andWith(3).bottlesOf("Milk").eachCosting(3.99)
                                             .andWith(1).bagOf("Apple").eachCosting(6.99)
                                             .andWith(1).bagOf("Oranges").eachCosting(6.99)
        );
        assertThat(totalPrice).isEqualTo(35.93);
    }

    private double totalPriceOf(ShoppingCart cart) {
        return cart.getTotal();
    }

    /**
     * TODO: Write another test to check what happens when you add bags with the addBags() method
     */
    @Test
    public void shouldCharge50centsPerBag() {
    }

    /**
     * TODO: Write another test to check what happens when you apply a discount using the "applyDiscount()" method
     */
    @Test
    public void shouldReduceThePriceWhenADiscountIsApplied() {

    }
}
