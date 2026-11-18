package com.serenitydojo.module06inheritance;

/**
 * The base class for all of our pets. This class is complete - you do not need to change it.
 */
public class Pet {
    private final String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String goForWalks() {
        return "walk walk walk";
    }

    public String makeNoise() {
        return "...";
    }
}
