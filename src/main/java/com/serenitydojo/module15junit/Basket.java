package com.serenitydojo.module15junit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * A shopping basket. This is the class you will write tests for in Module 15.
 * It is complete - you do not need to change it.
 */
public class Basket {

    public record Item(String name, double price, int quantity) {
        public double lineTotal() {
            return price * quantity;
        }
    }

    private final List<Item> items = new ArrayList<>();

    /**
     * Adds an item to the basket.
     *
     * @throws IllegalArgumentException if the name is blank, the price is negative, or the quantity is not positive
     */
    public void add(String name, double price, int quantity) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("An item must have a name");
        }
        if (price < 0) {
            throw new IllegalArgumentException("The price cannot be negative");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("The quantity must be at least one");
        }
        items.add(new Item(name, price, quantity));
    }

    /**
     * Removes every item with the given name.
     *
     * @throws NoSuchElementException if there is no such item in the basket
     */
    public void remove(String name) {
        boolean removed = items.removeIf(item -> item.name().equals(name));
        if (!removed) {
            throw new NoSuchElementException("No item called " + name + " in the basket");
        }
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    /**
     * The total number of things in the basket (adding up the quantities).
     */
    public int itemCount() {
        return items.stream().mapToInt(Item::quantity).sum();
    }

    public double total() {
        return items.stream().mapToDouble(Item::lineTotal).sum();
    }

    public List<Item> items() {
        return Collections.unmodifiableList(items);
    }
}
