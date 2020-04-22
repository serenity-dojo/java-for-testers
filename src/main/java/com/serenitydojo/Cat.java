package com.serenitydojo;

/**
 * A feline creature.
 */
public class Cat {
    /**
     * The name of the cat
     * This is important
     */
    private String name;
    private String favoriteFood;
    private int age;

    // A very useful field
    public static final String CAT_NOISE = "Meow";

    public static String usualFood() {
        return "Tuna";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.favoriteFood = usualFood();
    }

    public Cat(String name, String favoriteFood, int age) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public void makeNoise() {
        System.out.println(CAT_NOISE);
    }

    public void feed(String food) {
        System.out.println(name + " eats some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(name + " cleans his fur");
    }

    private void lickPaws() {
        System.out.println(name + " licks his paws");
    }
}
