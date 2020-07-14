package com.serenitydojo.cart;

public class Item {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isCalled(String expectedItemName) {
        return name.equalsIgnoreCase(expectedItemName.trim());
    }
}
