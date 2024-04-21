package com.serenitydojo.cart;

public class TheItemEntity {
	
	private CartEntity cart;

	public TheItemEntity(CartEntity cart) {
		this.cart = cart;
	}

	public static TheItemEntity inTheCartInstance(CartEntity cart) {
		return new TheItemEntity(cart);
	}
	
    public ItemEntity withName(String itemName) {
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