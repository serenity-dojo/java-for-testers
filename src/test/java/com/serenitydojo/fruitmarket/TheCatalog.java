package com.serenitydojo.fruitmarket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.serenitydojo.fruitmarket.Fruit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TheCatalog {

    Catalog catalog;

    @Before
    public void createANewCatalog() {
        catalog = new Catalog();
        catalog.setPriceOf(Apple).to(4.00)
                .setPriceOf(Orange).to(5.50)
                .setPriceOf(Banana).to(4.50)
                .setPriceOf(Pear).to(4.50);
    }

    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruit() {
        catalog.setPriceOf(Apple).to(5.00);
        assertThat(catalog.getPriceOf(Apple)).isEqualTo(5.00);
    }

    @Test
    public void shouldListTheAvailableFruitInAlphabeticalOrder() {
        assertThat(catalog.returnCurrentlyAvailableFruit()).containsExactly("Apple", "Banana", "Orange", "Pear");
    }

    @Test
    public void shouldReturnTheCorrectPricesOfEachFruitInSeason() {
        assertThat(catalog.getPriceOf(Apple)).isEqualTo(4.00);
        assertThat(catalog.getPriceOf(Orange)).isEqualTo(5.50);
    }

    @Test
    public void shouldReportAnExceptionIfAFruitIsNotAvailable() throws FruitUnavailableException {
        catalog.getPriceOf(Strawberries);
    }

    @Test
    public void shouldBeAbleToAddItemsToCart()
    {
        ShoppingCart cart=new ShoppingCart(catalog);
        cart.setItems(new ShoppingCartItem(Apple,2.00,catalog.getPriceOf(Apple)*2));
        cart.setItems(new ShoppingCartItem(Banana,4.00,catalog.getPriceOf(Banana)*4));
        for(int i=0;i< cart.getItems().size();i++)
        {
            switch (cart.getItems().get(i).getFruit())
            {
                case Apple:
                    assertThat(cart.getItems().get(i).getQuantity()).isEqualTo(2.00);
                    assertThat(cart.getItems().get(i).getTotalCost()).isEqualTo(8.00);
                    break;
                case Banana:
                    assertThat(cart.getItems().get(i).getQuantity()).isEqualTo(4.00);
                    assertThat(cart.getItems().get(i).getTotalCost()).isEqualTo(18.00);
                    break;
                default:
                    System.out.println("Unable to find the items in the cart");
            }
        }
    }

    @Test
    public void shouldBeAbleToGetTotalCostOfTheItemsOnTheCart()
    {
        ShoppingCart cart=new ShoppingCart(catalog);
        cart.setItems(new ShoppingCartItem(Apple,2.00,catalog.getPriceOf(Apple)*2));
        cart.setItems(new ShoppingCartItem(Banana,4.00,catalog.getPriceOf(Banana)*4));
        assertThat(cart.calculateTotalCost()).isEqualTo(26.00);
    }

    //When you buy 5 kilos or more of any fruit, you get a 10% discount
    @Test
    public void shouldBeAbleToGetDiscountedPriceWhenQuantityIsEqualToFive()
    {
       ShoppingCart cart=new ShoppingCart(catalog);
       cart.setItems(new ShoppingCartItem(Apple,5.00,catalog.getPriceOf(Apple)*5));
       assertThat(cart.calculateTotalCost()).isEqualTo(18.00);
    }

    @Test
    public void shouldBeAbleToGetDiscountedPriceWhenQuantityIsGreaterThanFive()
    {
        ShoppingCart cart=new ShoppingCart(catalog);
        cart.setItems(new ShoppingCartItem(Banana,5.50,catalog.getPriceOf(Banana)* 5.50));
        assertThat(cart.calculateTotalCost()).isEqualTo(22.275);
    }

    @Test
    public void shouldBeAbleToGetDiscountedPriceWhenDifferentTypesOfFruitsExistAndOnlyTwoOfThemEligibleForDiscount()
    {
        ShoppingCart cart=new ShoppingCart(catalog);
        cart.setItems(new ShoppingCartItem(Banana,5.50,catalog.getPriceOf(Banana)* 5.50));
        cart.setItems(new ShoppingCartItem(Pear,6.00,catalog.getPriceOf(Pear)* 6));
        cart.setItems(new ShoppingCartItem(Orange,3.00,catalog.getPriceOf(Orange)* 3));
        assertThat(cart.calculateTotalCost()).isEqualTo(63.075);
    }

}
