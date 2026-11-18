package com.serenitydojo.module16fruitshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.serenitydojo.module16fruitshop.Fruit.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.Assertions.within;

class TheShoppingCartTest {

    Catalog catalog;
    ShoppingCart cart;

    @BeforeEach
    void setupCatalog() {
        catalog = new Catalog();
        catalog.setPriceOf(Apple).to(4.00)
                .setPriceOf(Orange).to(5.50)
                .setPriceOf(Banana).to(4.50)
                .setPriceOf(Pear).to(4.50);

        cart = new ShoppingCart(catalog);
    }

    @Test
    void shouldStartWithNoItems() {
        assertThat(cart.getItems()).isEmpty();
        assertThat(cart.getTotalPrice()).isZero();
    }

    @Test
    void shouldKeepTrackOfItemsAddedToTheCart() {
        cart.add(2.0).kilosOf(Apple)
                .add(3.0).kilosOf(Orange);

        assertThat(cart.getItems()).hasSize(2);
    }

    @Test
    void shouldUseTheCatalogToCalculateThePriceOfItemsAddedToTheCart() {
        cart.add(2.0).kilosOf(Apple)
                .add(2.0).kilosOf(Orange)
                .add(1.0).kilosOf(Pear);

        assertThat(cart.getTotalPrice()).isCloseTo(23.50, within(0.001));
    }

    @Test
    void shouldKeepTrackOfTheDetailsOfEachItem() {
        cart.add(2.0).kilosOf(Apple);

        ShoppingCartItem apples = cart.getItems().get(0);

        assertThat(apples.getFruit()).isEqualTo(Apple);
        assertThat(apples.getQuantity()).isEqualTo(2.0);
        assertThat(apples.getTotalCost()).isCloseTo(8.00, within(0.001));
    }

    @Test
    void shouldGiveABulkDiscountOfTenPercentForFiveKilosOrMore() {
        cart.add(10.0).kilosOf(Apple);

        assertThat(cart.getTotalPrice()).isCloseTo(36.00, within(0.001));
    }

    @Test
    void shouldGiveTheBulkDiscountFromExactlyFiveKilos() {
        cart.add(5.0).kilosOf(Apple);

        assertThat(cart.getTotalPrice()).isCloseTo(18.00, within(0.001));
    }

    @Test
    void bulkDiscountsOnlyApplyToTheItemsThatQualifyForThem() {
        cart.add(10.0).kilosOf(Apple);
        cart.add(2.00).kilosOf(Orange);

        assertThat(cart.getTotalPrice()).isCloseTo(47.00, within(0.001));
    }

    @Test
    void shouldNotAllowFruitThatIsNotInTheCatalogToBeAdded() {
        assertThatThrownBy(() -> cart.add(1.0).kilosOf(Mulberries))
                .isInstanceOf(FruitUnavailableException.class);

        assertThat(cart.getItems()).isEmpty();
    }

    @Test
    void changingTheListOfItemsShouldNotChangeTheCart() {
        cart.add(1.0).kilosOf(Pear);

        cart.getItems().clear();

        assertThat(cart.getItems()).hasSize(1);
    }
}
