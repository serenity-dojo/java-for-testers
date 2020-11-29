package com.serenitydojo.fruitmarket;

import org.junit.Before;
import org.junit.Test;

import static com.serenitydojo.fruitmarket.Fruit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TheShoppingCart {

    Catalog catalog;
    ShoppingCart cart;

    @Before
    public void setupCatalog() {
        catalog = new Catalog();
        catalog.setPriceOf(Apple).to(4.00)
                .setPriceOf(Orange).to(5.50)
                .setPriceOf(Banana).to(4.50)
                .setPriceOf(Pear).to(4.50);

        cart = new ShoppingCart(catalog);
    }

    @Test
    public void shouldStartWithNoItems() {
        assertThat(cart.getItems()).isEmpty();
    }

    @Test
    public void shouldKeepTrackOfItemsAddedToTheCart() {
        cart.add(2.0).kilosOf(Apple)
            .add(3.0).kilosOf(Orange);

        assertThat(cart.getItems()).hasSize(2);
    }

    @Test
    public void shouldUseTheCatalogToCalculateThePriceOfItemsAddedToTheCart() {
        cart.add(2.0).kilosOf(Apple)
                .add(2.0).kilosOf(Orange)
                .add(1.0).kilosOf(Pear);

        assertThat(cart.getTotalPrice()).isEqualTo(23.50);
    }

    @Test
    public void shouldKeepTrackOfTheTotalPrice() {
        cart.add(2.0).kilosOf(Apple);

        ShoppingCartItem apples = cart.getItems().get(0);

        assertThat(apples.getFruit()).isEqualTo(Apple);
        assertThat(apples.getQuantity()).isEqualTo(2.0);
        assertThat(apples.getTotalCost()).isEqualTo(8.00);
    }

    @Test
    public void shouldGiveBulkDiscountsDiscount() {
        cart.add(10.0).kilosOf(Apple);

        assertThat(cart.getTotalPrice()).isEqualTo(36.00);
    }

    @Test
    public void buildDiscountsOnlyApplyToQuantitiesOverFiveKgs() {
        cart.add(10.0).kilosOf(Apple);
        cart.add(2.00).kilosOf(Orange);

        assertThat(cart.getTotalPrice()).isEqualTo(47.00);
    }
}
