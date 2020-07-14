package com.serenitydojo.cart;

public class TheItem {
    private Cart cart;

    public TheItem(Cart cart) {
        this.cart = cart;
    }

    public static TheItem inTheCart(Cart cart) {
        return new TheItem(cart);
    }

    public Item withName(String itemName) {
        try {
            return cart.getItemWithName(itemName);
        } catch (NoSuchItemException e) {
            e.printStackTrace();
        } catch (ItemNotReadyException e) {
            e.printStackTrace();
        }
        return null;
    }
}
