package com.serenitydojo.fruitmarket;

import org.junit.Before;
import org.junit.Test;

import static com.serenitydojo.fruitmarket.Fruit.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TheCatalog {
    Catalog catalog;

    @Before
    public void createANewCatalog(){
        catalog = new Catalog();
        catalog.setPriceOf(Apple).to(4.00)
                .setPriceOf(Orange).to(5.50)
                .setPriceOf(Banana).to(4.50)
                .setPriceOf(Pear).to(4.50);
    }

    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruit() {
        Catalog catalog = new Catalog();

        catalog.setPriceOf(Apple).to(4.00);
        assertThat(catalog.getPriceOf(Apple)).isEqualTo(4.00);
    }

    @Test
    public void shouldListTheAvailableFruitInAlphabeticalOrder() {
        assertThat(catalog.getAvailableFruit()).containsExactly("Apple", "Banana", "Orange", "Pear");

    }

    @Test
    public void shouldReturnTheCorrectPricesOfEachFruitInSeason(){
        assertThat(catalog.getPriceOf(Apple)).isEqualTo(4.00);
        assertThat(catalog.getPriceOf(Orange)).isEqualTo(5.50);
       }

    @Test(expected = FruitUnavailableException.class)
    public void shouldReportAnExceptionIfAFruitIsNotAvailable() {
        catalog.getPriceOf(Strawberries);
    }

    //Test I added
    @Test
    public void shouldNotBeAbleToAddFruitWithWrongPrice(){
        Catalog catalog = new Catalog();

        catalog.setPriceOf(Banana).to(4.25);

        assertThat(catalog.getPriceOf(Banana)).isNotEqualTo(4.50);
    }

    //Test I added
    @Test
    public void shouldListAllAvailableFruits(){
        catalog = new Catalog();
        catalog.setPriceOf(Apple).to(4.00)
                .setPriceOf(Orange).to(5.50)
                .setPriceOf(Banana).to(4.50)
                .setPriceOf(Pear).to(4.50)
                .setPriceOf(Peach).to(3.25)
                .setPriceOf(Strawberries).to(4.25)
                .setPriceOf(Mulberries).to(3.0);



        assertThat(catalog.getAvailableFruit()).containsExactlyInAnyOrder("Apple", "Banana",  "Pear","Orange","Mulberries","Peach", "Strawberries");







    }

}
