package com.serenitydojo.module04methods;

/**
 * Exercises 4.1 to 4.3: methods, static fields and static methods.
 */
public class Cat {

    // Exercise 4.2: a constant shared by every cat
//@@ solution
    public static final String CAT_NOISE = "Meow";
//@@ starter
    // TODO: set the value of this constant to "Meow"
    public static final String CAT_NOISE = "";
//@@ end

    // Exercise 4.2: a counter shared by every cat
    private static int numberOfCats = 0;

    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
//@@ solution
        numberOfCats++;
//@@ starter
        // TODO: increase the numberOfCats counter every time a new cat is created
//@@ end
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
//@@ solution
        return CAT_NOISE;
//@@ starter
        // TODO: return the CAT_NOISE constant
        return "";
//@@ end
    }

    /**
     * Increases the cat's age by one year.
     */
    public void haveBirthday() {
//@@ solution
        age++;
//@@ starter
        // TODO: increase the age by one
//@@ end
    }

    /**
     * Returns true if the cat is at least one year old.
     */
    public boolean isAdult() {
//@@ solution
        return age >= 1;
//@@ starter
        // TODO: return true if the age is 1 or more
        return false;
//@@ end
    }

    /**
     * Describes the cat, e.g. "Felix is 4 years old".
     */
    public String describe() {
//@@ solution
        return name + " is " + age + " years old";
//@@ starter
        // TODO: return the name, followed by " is ", the age and " years old"
        return "";
//@@ end
    }

    /**
     * Feeds the cat, e.g. feed("tuna") returns "Felix eats some tuna".
     */
    public String feed(String food) {
//@@ solution
        return name + " eats some " + food;
//@@ starter
        // TODO: return the name, followed by " eats some " and the food
        return "";
//@@ end
    }

    // ---------------------------------------------------------------------
    // Exercise 4.3: Static methods
    // ---------------------------------------------------------------------

    /**
     * The food that cats usually like. This does not depend on any particular cat, so it is static.
     */
    public static String usualFood() {
//@@ solution
        return "Tuna";
//@@ starter
        // TODO: return "Tuna"
        return "";
//@@ end
    }
}
