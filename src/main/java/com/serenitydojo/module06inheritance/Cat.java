package com.serenitydojo.module06inheritance;

/**
 * Exercise 6.1b: Basic inheritance.
 */
public class Cat extends Pet {
    private final String favoriteFood;

    public Cat(String name, String favoriteFood) {
        super(name);
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    @Override
    public String makeNoise() {
        return "Meow";
    }

    @Override
    public String goForWalks() {
        return "Cats don't go for walks";
    }
}
