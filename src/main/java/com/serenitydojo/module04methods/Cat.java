package com.serenitydojo.module04methods;

/**
 * Exercises 4.1 to 4.3: methods, static fields and static methods.
 */
public class Cat {

    // Exercise 4.2: a constant shared by every cat
    // TODO: set the value of this constant to "Meow"
    public static final String CAT_NOISE = "";

    // Exercise 4.2: a counter shared by every cat
    private static int numberOfCats = 0;

    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        // TODO: increase the numberOfCats counter every time a new cat is created
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
        // TODO: return the CAT_NOISE constant
        return "";
    }

    /**
     * Increases the cat's age by one year.
     */
    public void haveBirthday() {
        // TODO: increase the age by one
    }

    /**
     * Returns true if the cat is at least one year old.
     */
    public boolean isAdult() {
        // TODO: return true if the age is 1 or more
        return false;
    }

    /**
     * Describes the cat, e.g. "Felix is 4 years old".
     */
    public String describe() {
        // TODO: return the name, followed by " is ", the age and " years old"
        return "";
    }

    /**
     * Feeds the cat, e.g. feed("tuna") returns "Felix eats some tuna".
     */
    public String feed(String food) {
        // TODO: return the name, followed by " eats some " and the food
        return "";
    }

    // ---------------------------------------------------------------------
    // Exercise 4.3: Static methods
    // ---------------------------------------------------------------------

    /**
     * The food that cats usually like. This does not depend on any particular cat, so it is static.
     */
    public static String usualFood() {
        // TODO: return "Tuna"
        return "";
    }
}
