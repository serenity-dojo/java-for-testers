package com.serenitydojo.module04methods;

/**
 * Exercises 4.1 to 4.3: methods, static fields and static methods.
 */
public class Cat {

    // Exercise 4.2: a constant shared by every cat
    public static final String CAT_NOISE = "Meow";

    // Exercise 4.2: a counter shared by every cat
    private static int numberOfCats = 0;

    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfCats++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getNumberOfCats() {
        return numberOfCats;
    }

    // ---------------------------------------------------------------------
    // Exercise 4.1: Defining methods
    // ---------------------------------------------------------------------

    /**
     * Returns the noise a cat makes.
     */
    public String makeNoise() {
        return CAT_NOISE;
    }

    /**
     * Increases the cat's age by one year.
     */
    public void haveBirthday() {
        age++;
    }

    /**
     * Returns true if the cat is at least one year old.
     */
    public boolean isAdult() {
        return age >= 1;
    }

    /**
     * Describes the cat, e.g. "Felix is 4 years old".
     */
    public String describe() {
        return name + " is " + age + " years old";
    }

    /**
     * Feeds the cat, e.g. feed("tuna") returns "Felix eats some tuna".
     */
    public String feed(String food) {
        return name + " eats some " + food;
    }

    // ---------------------------------------------------------------------
    // Exercise 4.3: Static methods
    // ---------------------------------------------------------------------

    /**
     * The food that cats usually like. This does not depend on any particular cat, so it is static.
     */
    public static String usualFood() {
        return "Tuna";
    }
}
