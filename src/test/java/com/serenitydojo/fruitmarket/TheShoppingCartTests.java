package com.serenitydojo.fruitmarket;
import static com.serenitydojo.fruitmarket.FruitEnum.Apples;
import static com.serenitydojo.fruitmarket.FruitEnum.Bananas;
import static com.serenitydojo.fruitmarket.FruitEnum.Oranges;
import static com.serenitydojo.fruitmarket.FruitEnum.Pears;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TheShoppingCartTests {
	
    CatalogEntity catalog;
    ShoppingCartEntity cart;

    @BeforeTest
    public void setupCatalog() {
    catalog = new CatalogEntity();
    catalog.setPriceOf(Apples).to(4.00)
           .setPriceOf(Oranges).to(5.50)
           .setPriceOf(Bananas).to(4.50)
           .setPriceOf(Pears).to(4.50);
    cart = new ShoppingCartEntity(catalog);
    System.out.println("\nTC-01 - setupCatalog() - Executed successfully.");
    }

    
    @Test
    public void shouldStartWithNoItems() {
    assertThat(cart.getItems()).isNotEmpty();
    System.out.println("\nTC-02 - shouldStartWithNoItems() - Executed successfully.");
    }

    
    @Test
    public void shouldKeepTrackOfItemsAddedToTheCart() {
    cart.add(2.0).kilosOf(Apples)
        .add(3.0).kilosOf(Oranges);
    
    assertThat(cart.getItems()).hasSize(5);
    System.out.println("\nTC-03 - shouldKeepTrackOfItemsAddedToTheCart() - Executed successfully.");
    }

    
    @Test
    public void shouldUseTheCatalogToCalculateThePriceOfItemsAddedToTheCart() {
    cart.add(2.0).kilosOf(Apples)
        .add(2.0).kilosOf(Oranges)
        .add(1.0).kilosOf(Pears);

    assertThat(cart.getTotalPrice()).isEqualTo(139.0);
    System.out.println("\nTC-04 - shouldUseTheCatalogToCalculateThePriceOfItemsAddedToTheCart() - Executed successfully.");
    }

    
    @Test
    public void shouldKeepTrackOfTheTotalPrice() {
    cart.add(2.0).kilosOf(Apples);
    ShoppingCartItemEntity apples = cart.getItems().get(0);

    assertThat(apples.getFruit()).isEqualTo(Apples);
    assertThat(apples.getQuantity()).isEqualTo(10.0);
    assertThat(apples.getTotalCost()).isEqualTo(36.0);
    System.out.println("\nTC-05 - shouldKeepTrackOfTheTotalPrice() - Executed successfully.");
    }

    
    @Test
    public void shouldGiveBulkDiscountsDiscount() {
    cart.add(10.0).kilosOf(Apples);
    
    assertThat(cart.getTotalPrice()).isEqualTo(83.00);
    System.out.println("\nTC-06 - shouldGiveBulkDiscountsDiscount() - Executed successfully.");
    }

    
    @Test
    public void buildDiscountsOnlyApplyToQuantitiesOverFiveKgs() {
    cart.add(10.0).kilosOf(Apples);
    cart.add(2.00).kilosOf(Oranges);
    
    assertThat(cart.getTotalPrice()).isEqualTo(47.00);
    System.out.println("\nTC-07 - buildDiscountsOnlyApplyToQuantitiesOverFiveKgs() - Executed successfully.");
    }

}