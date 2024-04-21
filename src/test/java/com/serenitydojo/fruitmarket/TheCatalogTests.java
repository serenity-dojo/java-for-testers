package com.serenitydojo.fruitmarket;
import static com.serenitydojo.fruitmarket.FruitEnum.Apples;
import static com.serenitydojo.fruitmarket.FruitEnum.Bananas;
import static com.serenitydojo.fruitmarket.FruitEnum.Oranges;
import static com.serenitydojo.fruitmarket.FruitEnum.Pears;
import static com.serenitydojo.fruitmarket.FruitEnum.Strawberries;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThrows;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TheCatalogTests {
	
    CatalogEntity catalog;

    @BeforeTest
    public void createANewCatalog() {
    catalog = new CatalogEntity();
    catalog.setPriceOf(Apples).to(4.00)
           .setPriceOf(Oranges).to(5.50)
           .setPriceOf(Bananas).to(4.50)
           .setPriceOf(Pears).to(4.50);
    System.out.println("\nTC-01 - createANewCatalog() - Executed successfully.");
    }

    
    @Test
    public void shouldBeAbleToUpdateTheCurrentPriceOfAFruit() {
    CatalogEntity catalog = new CatalogEntity();
    catalog.setPriceOf(Apples).to(4.00);
    
    assertThat(catalog.getPriceOf(Apples)).isEqualTo(4.00);
    System.out.println("\nTC-02 - shouldBeAbleToUpdateTheCurrentPriceOfAFruit() - Executed successfully.");
    }

    
    @Test
    public void shouldListTheAvailableFruitInAlphabeticalOrder() {
    assertThat(catalog.getAvailableFruit()).containsExactly("Apples", "Bananas", "Oranges", "Pears");
    System.out.println("\nTC-03 - shouldListTheAvailableFruitInAlphabeticalOrder() - Executed successfully.");
    }

    
    @Test
    public void shouldReturnTheCorrectPricesOfEachFruitInSeason() {
    assertThat(catalog.getPriceOf(Apples)).isEqualTo(4.00);
    assertThat(catalog.getPriceOf(Oranges)).isEqualTo(5.50);
    System.out.println("\nTC-04 - shouldReturnTheCorrectPricesOfEachFruitInSeason() - Executed successfully.");
    }

    
    @Test
    public void shouldListAvailableFruitNamesAlphabetically() {
    CatalogEntity catalog = CatalogEntity.catalogWithSomeItemsAndPricesForEverything();
    String availableFruits = catalog.getAvailableFruitNames();
    
    assertThat(availableFruits).isEqualTo("Apples, Bananas, Pears");
    System.out.println("\nTC-05 - shouldListAvailableFruitNamesAlphabetically() - Executed successfully.");
    }

    
    @Test
    public void shoppingCartKeepsRunningTotal() {
    CatalogEntity catalog = CatalogEntity.catalogWithSomeItemsAndPricesForEverything();
    ShoppingCartEntity cart = new ShoppingCartEntity(catalog);
    assertThat(cart.getTotalPrice()).isEqualTo(0.0);
    cart.addItem(Pears, 1);
    assertThat(cart.getTotal()).isEqualTo(1.0);
    cart.addItem(Bananas, 4);
    assertThat(cart.getTotal()).isEqualTo(9.0);
    System.out.println("\nTC-06 - shoppingCartKeepsRunningTotal() - Executed successfully.");
    }

    
    @Test
    public void throwsExceptionWhenNoSuchFruit() {
    CatalogEntity catalog = CatalogEntity.catalogWithSomeItemsAndPricesForEverything();
    ShoppingCartEntity cart = new ShoppingCartEntity(catalog);

    FruitUnavailableException noSuchFruit = assertThrows (
                FruitUnavailableException.class,
                () -> cart.addItem(Oranges, 99)
    );
    assertThat(noSuchFruit.getMessage()).isEqualTo("no such fruit");

    FruitUnavailableException noSuchAmount = assertThrows(
                FruitUnavailableException.class,
                () -> cart.addItem(Apples, 99)
    );
    assertThat(noSuchAmount.getMessage()).isEqualTo("no such amount");
    System.out.println("\nTC-07 - throwsExceptionWhenNoSuchFruit() - Executed successfully.");
    }


    @Test
    public void receive10percentDiscountWhenOver5kgForAnyFruit() {
    CatalogEntity catalog = CatalogEntity.withItems( new CatalogItem(Apples, 5),new CatalogItem(Apples, 1) );
    catalog.setPriceOf(Apples, 1.00);
    ShoppingCartEntity cart = new ShoppingCartEntity(catalog);
    cart.addItem(Apples, 5);
    assertThat(cart.getTotal()).isEqualTo(5.0);
    cart.addItem(Apples, 1);
    assertThat(cart.getTotal()).isEqualTo(5.4);
    System.out.println("\nTC-08 - receive10percentDiscountWhenOver5kgForAnyFruit() - Executed successfully.");
    }

    
    @Test
    public void noDiscountWhenDifferentFruits() {
    CatalogEntity catalog = CatalogEntity.withItems( new CatalogItem(Pears, 5), new CatalogItem(Apples, 1) );
    catalog.setPriceOf(Apples, 1.00);
    catalog.setPriceOf(Pears, 1.00);
    ShoppingCartEntity cart = new ShoppingCartEntity(catalog);
    cart.addItem(Pears, 5);
    assertThat(cart.getTotal()).isEqualTo(5.0);
    cart.addItem(Apples, 1);
    assertThat(cart.getTotal()).isEqualTo(6);
    System.out.println("\nTC-09 - noDiscountWhenDifferentFruits() - Executed successfully.");
    }
    
    
    @org.junit.Test(expected = FruitUnavailableException.class)
    public void shouldReportAnExceptionIfAFruitIsNotAvaialble() {
    catalog.getPriceOf(Strawberries);
    System.out.println("\nTC-05 - shouldReportAnExceptionIfAFruitIsNotAvaialble() - Executed successfully.");
    }

}