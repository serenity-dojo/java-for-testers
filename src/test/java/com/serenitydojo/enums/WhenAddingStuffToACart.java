package com.serenitydojo.enums;

import com.serenitydojo.cart.*;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * In a shopping cart we should be able to
 * - add one item
 * - add multiple items
 * - add multiple quantities of the same item
 * - get a product description from the catalog
 */
public class WhenAddingStuffToACart {

    @Test
    public void iCanAddASingleItem() {
        Cart cart = new Cart();
        Item item = new Item("bread");

        cart.add(item);

        assertThat(cart.getItems()).contains(item);
    }

    @Test
    public void ICanGetAnItemFromTheList() {
        Cart cart = new Cart();
        Item item = new Item("bread");
        cart.add(item);

        assertThat(cart.getItem(0)).isEqualTo(item);
    }

    @Test
    public void iCanGetAnItemByName() throws NoSuchItemException, ItemNotReadyException {
        Cart cart = new Cart();
        Item item = new Item("bread");
        cart.add(item);

        assertThat(cart.getItemWithName("bread")).isEqualTo(item);
    }

    @Test(expected = NoSuchItemException.class)
    public void noMatchingItemIsInTheCart() {
        Cart cart = new Cart();
        Item item = new Item("bread");
        cart.add(item);

        Item foundItem = TheItem.inTheCart(cart).withName("cheese");

        assertThat(foundItem).isEqualTo(item);
    }
}
