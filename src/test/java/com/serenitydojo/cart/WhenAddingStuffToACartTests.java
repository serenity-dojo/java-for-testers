package com.serenitydojo.cart;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.Test;

/**
 * In a shopping cart we should be able to
 * - add one item.
 * - add multiple items.
 * - add multiple quantities of the same item.
 * - get a product description from the catalog.
 * 
 */

public class WhenAddingStuffToACartTests {

	@Test
	public void iCanAddASingleItem() {
	CartEntity cart = new CartEntity();
	ItemEntity item = new ItemEntity("bread");
	cart.setContents(item);

	assertThat(cart.getContents()).contains(item);
	System.out.println("\nTC-01 - iCanAddASingleItem() - Executed successfully.");
	}

	
	@Test
	public void ICanGetAnItemFromTheList() {
	CartEntity cart = new CartEntity();
	ItemEntity item = new ItemEntity("bread");
	cart.setContents(item);

	assertThat(cart.getItem(0)).isEqualTo(item);
	System.out.println("\nTC-02 - ICanGetAnItemFromTheList() - Executed successfully.");
	}

	
	@Test(enabled = false)
	public void iCanGetAnItemByName() throws NoSuchItemException, ItemNotReadyException {
		try {
			CartEntity cart = new CartEntity();
			ItemEntity item = new ItemEntity("bread");
			cart.setContents(item);

			assertThat(cart.getItemWithName("bread")).isEqualTo(item);
			System.out.println("\nTC-03 - iCanGetAnItemByName() - Executed successfully.");
		} catch (Exception e) {
			System.out.println("\nException : " + e);
		}
	}

	
	@org.junit.Test(expected = NoSuchItemException.class)
	public void noMatchingItemIsInTheCart() {
	CartEntity cart = new CartEntity();
	ItemEntity item = new ItemEntity("bread");
	cart.setContents(item);

	ItemEntity foundItem = TheItemEntity.inTheCartInstance(cart).withName("cheese");
	assertThat(foundItem).isEqualTo(item);
	System.out.println("\nTC-04 - noMatchingItemIsInTheCart() - Executed successfully.");
	}
	

}