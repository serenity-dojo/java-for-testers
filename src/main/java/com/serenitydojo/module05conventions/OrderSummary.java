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

    public static final int max_items = 10;

    private final String Customer_Name;
    private double Total_price;
    public int ItemCount;

    public OrderSummary(String customerName) {
        this.Customer_Name = customerName;
    }

    public void Add_Item(double price) {
        if (full()) {
            throw new IllegalStateException("An order can contain at most " + max_items + " items");
        }
        ItemCount++;
        Total_price += price;
    }

    public double Get_Total_Price() {
        return Total_price;
    }

    public String GetCustomerName() {
        return Customer_Name;
    }

    public int Get_Item_Count() {
        return ItemCount;
    }

    public boolean full() {
        return ItemCount >= max_items;
    }
}
