package com.serenitydojo.fruitmarket;

import org.junit.Test;

import static com.serenitydojo.fruitmarket.Fruit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TheCatalog {

    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruit() {
        Catalog catalog = new Catalog();

        catalog.setPriceOf(Apple).to(4.00);
        assertThat(catalog.getPriceOf(Apple)).isEqualTo(4.00);
    }
}
