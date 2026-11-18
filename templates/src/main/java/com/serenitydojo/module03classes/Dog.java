package com.serenitydojo.module03classes;

/**
 * Exercise 3.3a: Private fields.
 */
public class Dog {
//@@ solution
    private final String name;
    private final String favoriteToy;
    private final int age;

    public Dog(String name, String favoriteToy, int age) {
        this.name = name;
        this.favoriteToy = favoriteToy;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favoriteToy;
    }

    public int getAge() {
        return age;
    }
//@@ starter
    // TODO: add three private fields (name, favoriteToy and age),
    //       a constructor that sets them, and a getter for each field
//@@ end
}
