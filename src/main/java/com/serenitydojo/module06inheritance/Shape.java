package com.serenitydojo.module06inheritance;

import java.util.Locale;

/**
 * An abstract class: it describes what every shape can do, but leaves the details to its subclasses.
 * This class is complete - you do not need to change it.
 */
public abstract class Shape {

    /**
     * Every shape has an area, but each kind of shape calculates it differently.
     */
    public abstract double area();

    public String describe() {
        return getClass().getSimpleName() + " with an area of " + String.format(Locale.ROOT, "%.2f", area());
    }
}
