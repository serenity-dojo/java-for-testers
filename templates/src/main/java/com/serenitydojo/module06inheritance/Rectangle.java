package com.serenitydojo.module06inheritance;

/**
 * Exercise 6.2b: Abstract methods.
 */
public class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
//@@ solution
        return width * height;
//@@ starter
        // TODO: the area of a rectangle is width * height
        return 0;
//@@ end
    }
}
