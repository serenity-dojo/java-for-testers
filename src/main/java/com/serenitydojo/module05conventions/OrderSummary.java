package com.serenitydojo.module05conventions;

/**
 * Exercise 5.1: Java conventions.
 * <p>
 * This class works, but it ignores the Java naming conventions. Rename the fields, constants and methods
 * so that WhenFollowingJavaConventionsTest passes:
 * <ul>
 *   <li>Constants (static final) use UPPER_SNAKE_CASE</li>
 *   <li>Fields use camelCase and are private</li>
 *   <li>Methods use camelCase</li>
 *   <li>Methods that return a boolean start with is, has or can</li>
 * </ul>
 */
public class OrderSummary {

    public static final int MAX_ITEMS = 10;

    private final String customerName;
    private double totalPrice;
    private int itemCount;

    public OrderSummary(String customerName) {
        this.customerName = customerName;
    }

    public void addItem(double price) {
        if (isFull()) {
            throw new IllegalStateException("An order can contain at most " + MAX_ITEMS + " items");
        }
        itemCount++;
        totalPrice += price;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getItemCount() {
        return itemCount;
    }

    public boolean isFull() {
        return itemCount >= MAX_ITEMS;
    }
}
