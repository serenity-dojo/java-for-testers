package com.serenitydojo.shoppingcart;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.Test;

public class WhenCalculatingTotalPriceTests {

	/**
	 * TODO: Write a test that checks the following scenario: - Add the following
	 * items to a shopping cart: - 2 kg rice at 4.99 each - 3 litres of milk at 3.99
	 * - 1 bag of apples at 6.99 - 1 bag of oranges at 7.99 - Proceed to the
	 * checkout - The total should be 36.93
	 *
	 */
	@Test
	public void shouldCalculatePriceWhenArticlesAreAddedToTheCart() {
		double totalPrice = totalPriceOf(AShoppingCartEntity.with(2).bagsOf("Rice").eachCosting(4.99).andWith(3).bottlesOf("Milk").eachCosting(3.99)
						.andWith(1).bagOf("Apple").eachCosting(6.99).andWith(1).bagOf("Oranges").eachCosting(6.99));
	
	assertThat(totalPrice).isEqualTo(35.93);
	System.out.println("\nTC-01 - shouldCalculatePriceWhenArticlesAreAddedToTheCart() - Executed successfully.");
	}
	
	
	/**
	 * TODO: Write another test to check what happens when you add bags with the
	 * addBags() method
	 * 
	 */
	@Test
	public void shouldCharge50centsPerBag() {
	double totalPrice = totalPriceOf(
	                AShoppingCartEntity.with(2).bagsOf("Rice").eachCosting(4.99)
	                        .andWith(3).bottlesOf("Milk").eachCosting(3.99)
	                        .andWith(1).bagOf("Apple").eachCosting(6.99)
	                        .andWith(1).bagOf("Oranges").eachCosting(6.99)
	                        .andWith(3).shoppingBags()
	        );
	
	assertThat(totalPrice).isEqualTo(37.43);
	System.out.println("\nTC-02 - shouldCharge50centsPerBag() - Executed successfully.");
	}

	
	/**
	 * TODO: Write another test to check what happens when you apply a discount
	 * using the "applyDiscount()" method
	 * 
	 */
	@Test
	public void shouldReduceThePriceWhenADiscountIsApplied() {
	double totalPrice = totalPriceOf(
	                AShoppingCartEntity.with(2).bagsOf("Rice").eachCosting(4.99)
	                        .andWith(3).bottlesOf("Milk").eachCosting(3.99)
	                        .andWith(1).bagOf("Apple").eachCosting(6.99)
	                        .andWith(1).bagOf("Oranges").eachCosting(6.99)
	                        .andWithADiscountOf(10.00)
	        );
	
	assertThat(totalPrice).isEqualTo(25.93);
	System.out.println("\nTC-03 - shouldReduceThePriceWhenADiscountIsApplied() - Executed successfully.");
	}
	
	private double totalPriceOf(ShoppingCartEntity cart) {
		return cart.getTotal();
	}


}