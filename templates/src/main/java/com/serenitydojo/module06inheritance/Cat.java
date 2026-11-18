package com.serenitydojo.module06inheritance;

/**
 * Exercise 6.1b: Basic inheritance.
 */
//@@ solution
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
//@@ starter
public class Cat {
    // TODO: make Cat extend the Pet class. It should:
    //  - have a constructor taking a name and a favoriteFood
    //  - have a getFavoriteFood() method
    //  - override makeNoise() so that it returns "Meow"
    //  - override goForWalks() so that it returns "Cats don't go for walks"
}
//@@ end
