package com.serenitydojo.cart;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CartEntity {

	private Random random = new Random();
	private List<ItemEntity> contents = new ArrayList<>();;

	/**
	 * @param contents the contents to set
	 * 
	 */
	public void setContents(ItemEntity item) {
		this.contents.add(item);
	}

	/**
	 * @return the contents
	 * 
	 */
	public List<ItemEntity> getContents() {
		return contents;
	}

	public ItemEntity getItem(int indexVal) {
		return this.contents.get(indexVal);
	}

	public ItemEntity getItemWithName(String expectedItemName) throws NoSuchItemException, ItemNotReadyException {
		try {
			if (!random.nextBoolean()) {
				throw new ItemNotReadyException("Item with name '" + expectedItemName + "' not ready yet");
			}

			for (ItemEntity item : contents) {
				if (item.isCalled(expectedItemName)) {
					return item;
				}
			}
		} catch (Exception e) {
			System.out.println("\nException : " + e);
		}
		throw new NoSuchItemException("No such item with name " + expectedItemName);
	}

}