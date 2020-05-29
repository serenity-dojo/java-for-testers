package com.serenitydojo.shoppingcart;

public class AShoppingCart extends ShoppingCart {
    public static AShoppingCartBuilder with(int quantity) {
        return new AShoppingCartBuilder(new AShoppingCart(), quantity);
    }

    public AShoppingCartBuilder andWith(int quantity) {
        return new AShoppingCartBuilder(this, quantity);
    }

    public AShoppingCart andWithADiscountOf(double discount) {
        applyDiscount(discount);
        return this;
    }

    public static class AShoppingCartBuilder {
        private int quantity;
        private String unit;
        private String product;
        private AShoppingCart shoppingCart;

        public AShoppingCartBuilder(AShoppingCart shoppingCart, int quantity) {
            this.quantity = quantity;
            this.shoppingCart = shoppingCart;
        }

        public AShoppingCartBuilder bagsOf(String product) {
            this.unit = "bags";
            this.product = product;
            return this;
        }

        public AShoppingCartBuilder bottlesOf(String product) {
            this.unit = "bottles";
            this.product = product;
            return this;
        }

        public AShoppingCart eachCosting(double itemCost) {
            ShoppingItem newItem = new ShoppingItem(product,unit,itemCost,"213546543543",1.0,"Some Random Brand");
            shoppingCart.add(quantity, newItem);
            return shoppingCart;
        }

        public AShoppingCartBuilder bagOf(String product) {
            return bagsOf(product);
        }

        public ShoppingCart shoppingBags() {
            shoppingCart.addBags(quantity);
            return shoppingCart;
        }
    }
}
