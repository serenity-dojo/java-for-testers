package com.serenitydojo.fruitmarket;

import com.serenitydojo.exceptions.FruitUnavailableException;
import org.junit.Test;

import static com.serenitydojo.fruitmarket.Fruit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TheCatalog {

    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruit() {
        Catalog catalog = new Catalog();
        setUpFruitCatalog(catalog);
        catalog.setPriceOf(Apple).to(5.00);
        assertThat(catalog.getPriceOf(Apple)).isEqualTo(5.00);
    }

    @Test
    public void shouldReturnTheEntriesInTheCatalogInAlphabeticalOrder(){
        Catalog catalog = new Catalog();
        setUpFruitCatalog(catalog);
        assertThat(catalog.sortCatalog()).isSorted();
    }

    @Test
    public void shouldReportThePriceOfaGivenFruit(){
        Catalog catalog = new Catalog();
        setUpFruitCatalog(catalog);
        assertThat(catalog.getPriceOf(Banana)).isEqualTo(6.00);
    }

    @Test(expected = FruitUnavailableException.class)
    public void shouldReportFruitUnavailableException(){
        Catalog catalog = new Catalog();
        setUpFruitCatalog(catalog);
        catalog.getPriceOf(Mulberries);
    }

    @Test
    public void shouldKeepShoppingCartRunningTotal(){
        Catalog catalog = new Catalog();
        setUpFruitCatalog(catalog);
        ShoppingCart shoppingCart = new ShoppingCart(catalog);

        shoppingCart.addItemToShoppingCart(Apple, 2.5);
        shoppingCart.addItemToShoppingCart(Banana, 2.00);
        assertThat(shoppingCart.totalPrice()).isEqualTo(22.00);

        shoppingCart.addItemToShoppingCart(Pear, 2.00);
        assertThat(shoppingCart.totalPrice()).isEqualTo(27.9);
    }

    @Test
    public void shouldApplyDiscountIfQuantityIs5KilosOrOver(){
        Catalog catalog = new Catalog();
        setUpFruitCatalog(catalog);
        ShoppingCart shoppingCart = new ShoppingCart(catalog);
        shoppingCart.addItemToShoppingCart(Apple, 5.0);
        assertThat(shoppingCart.totalPrice()).isEqualTo(18.00);

    }

    private void setUpFruitCatalog(Catalog catalog) {
        catalog.setPriceOf(Apple).to(4.00);
        catalog.setPriceOf(Orange).to(5.50);
        catalog.setPriceOf(Banana).to(6.00);
        catalog.setPriceOf(Pear).to(4.50);
        //return catalog;
    }
}
