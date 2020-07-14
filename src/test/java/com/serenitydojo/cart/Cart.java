package com.serenitydojo.cart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cart {

    List<Item> contents = new ArrayList<>();

    public void add(Item item) {
        contents.add(item);
    }

    public List<Item> getItems() {
        return contents;
    }

    public Item getItem(int index) {
        return contents.get(index);
    }

    Random random = new Random();
    public Item getItemWithName(String expectedItemName) throws NoSuchItemException, ItemNotReadyException {

        if (random.nextBoolean()) {
            throw new ItemNotReadyException("Item with name " + expectedItemName + " not ready yet");
        }

        for(Item item : contents) {
            if (item.isCalled(expectedItemName)) {
                return item;
            }
        }
        throw new NoSuchItemException("No such item with name " + expectedItemName);
    }
}
