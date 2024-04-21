package com.serenitydojo.shoppingcart;

public class AShoppingCartEntityBuilder {
	
	private int quantity;
    private String unit;
    private String product;
    private AShoppingCartEntity shoppingCart;
    
    public AShoppingCartEntityBuilder bagOf(String product) {
        return bagsOf(product);
    }
    
    public AShoppingCartEntityBuilder(AShoppingCartEntity shoppingCart, int quantity) {
        this.quantity = quantity;
        this.shoppingCart = shoppingCart;
    }

    public AShoppingCartEntityBuilder bagsOf(String product) {
        this.unit = "bags";
        this.product = product;
        return this;
    }

    public AShoppingCartEntityBuilder bottlesOf(String product) {
        this.unit = "bottles";
        this.product = product;
        return this;
    }

    public AShoppingCartEntity eachCosting(double itemCost) {
        ShoppingItemRecordEntity newItem = new ShoppingItemRecordEntity(product,unit,itemCost,"213546543543",1.0,"Some Random Brand");
        shoppingCart.add(quantity, newItem);
        return shoppingCart;
    }

   
    public ShoppingCartEntity shoppingBags() {
        shoppingCart.addBags(quantity);
        return shoppingCart;
    }

}