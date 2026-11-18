package com.serenitydojo.module06inheritance;

/**
 * Exercise 6.1a: Basic inheritance.
 */
public class Dog extends Pet {
    private final String favoriteToy;

    public Dog(String name, String favoriteToy) {
        super(name);
        this.favoriteToy = favoriteToy;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    @Override
    public String makeNoise() {
        return "Woof";
    }
}
