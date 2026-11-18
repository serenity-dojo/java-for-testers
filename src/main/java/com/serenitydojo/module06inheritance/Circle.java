package com.serenitydojo.module06inheritance;

/**
 * Exercise 6.2a: Abstract methods.
 */
public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
