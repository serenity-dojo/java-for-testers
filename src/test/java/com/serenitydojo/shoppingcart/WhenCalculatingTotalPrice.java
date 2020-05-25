package com.serenitydojo.shoppingcart;

import org.junit.Assert;
import org.junit.Test;

public class WhenCalculatingTotalPrice {

    @Test
    public void shouldCalculatePriceWhenArticlesAreAddedToTheCart() {
        ShoppingCart cart = new ShoppingCart();
        ShoppingItem item1 = new ShoppingItem("Rice", "1 kg", 4.99,"1235357214735835","Rice R Us");
        ShoppingItem item2 = new ShoppingItem("Milk", "1 lt", 3.99,"7879827234234232","Home Brand Dairy");
        ShoppingItem item3 = new ShoppingItem("Apples", "bag", 6.99,"345457584524562","Farmers Pick");
        ShoppingItem item4 = new ShoppingItem("Oranges", "bag", 7.99,"986865754876587","Farmers Pick");
        cart.add(2, item1);
        cart.add(3, item2);
        cart.add(1, item3);
        cart.add(1, item4);
        cart.addBags(3);
        double totalPrice = cart.getTotal();
        Assert.assertEquals(totalPrice, 38.43,0.0);
    }

    /**
     * TODO: Write another test to check what happens when you apply a discount using the "applyDiscount()" method
     *
     */
    @Test
    public void shouldReduceThePriceWhenADiscountIsApplied() {

    }
}
