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
        // TODO: the area of a circle is PI * radius * radius (use Math.PI)
        return 0;
    }
}
