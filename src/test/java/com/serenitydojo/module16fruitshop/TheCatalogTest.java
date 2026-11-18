package com.serenitydojo.module16fruitshop;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.serenitydojo.module16fruitshop.Fruit.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class TheCatalogTest {

    Catalog catalog;

    @BeforeEach
    void createANewCatalog() {
        catalog = new Catalog();
        catalog.setPriceOf(Apple).to(4.00)
                .setPriceOf(Orange).to(5.50)
                .setPriceOf(Banana).to(4.50)
                .setPriceOf(Pear).to(4.50);
    }

    @Test
    void shouldBeAbleToSetThePriceOfAFruit() {
        Catalog newCatalog = new Catalog();

        newCatalog.setPriceOf(Apple).to(4.00);

        assertThat(newCatalog.getPriceOf(Apple)).isEqualTo(4.00);
    }

    @Test
    void shouldBeAbleToUpdateTheCurrentPriceOfAFruit() {
        catalog.setPriceOf(Apple).to(6.00);

        assertThat(catalog.getPriceOf(Apple)).isEqualTo(6.00);
    }

    @Test
    void shouldListTheAvailableFruitInAlphabeticalOrder() {
        assertThat(catalog.getAvailableFruit()).containsExactly("Apple", "Banana", "Orange", "Pear");
    }

    @Test
    void shouldReturnTheCorrectPricesOfEachFruitInSeason() {
        assertThat(catalog.getPriceOf(Apple)).isEqualTo(4.00);
        assertThat(catalog.getPriceOf(Orange)).isEqualTo(5.50);
    }

    @Test
    void shouldReportAnExceptionIfAFruitIsNotAvailable() {
        assertThatThrownBy(() -> catalog.getPriceOf(Strawberries))
                .isInstanceOf(FruitUnavailableException.class)
                .hasMessage("Strawberries currently unavailable");
    }

    @Test
    void anEmptyCatalogHasNoFruitAvailable() {
        assertThat(new Catalog().getAvailableFruit()).isEmpty();
    }
}
