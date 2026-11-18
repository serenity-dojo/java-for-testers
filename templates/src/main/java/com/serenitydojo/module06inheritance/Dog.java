package com.serenitydojo.module06inheritance;

/**
 * Exercise 6.1a: Basic inheritance.
 */
//@@ solution
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
//@@ starter
public class Dog {
    // TODO: make Dog extend the Pet class. It should:
    //  - have a constructor taking a name and a favoriteToy (pass the name up to the Pet constructor with super)
    //  - have a getFavoriteToy() method
    //  - override makeNoise() so that it returns "Woof"
}
//@@ end
