package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static com.serenitydojo.Cat.usualFood;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {
        String name = "Felix";
        String favoriteFood = "Tuna";
        int age = 4;

        // Create an object of CAT class
        Cat felix = new Cat(name,favoriteFood,age);
        System.out.println(felix.getName());
        System.out.println(felix.getFavoriteFood());
        System.out.println(felix.getAge());

        // Create a new Cat Object
        Cat spot = new Cat("spot","Tuna",3);
        System.out.println(spot.getName());
        System.out.println(spot.getFavoriteFood());
        System.out.println(spot.getAge());

    }

    @Test
    public void cat_make_noise() {
        String name = "Felix";
        String favoriteFood = "Tuna";
        int age = 4;

        // Create an object of CAT class
        Cat felix = new Cat(name,age);
        Cat spot = new Cat("spot","Salmon",3);

        System.out.println("Cat's favorite food = "+usualFood());
    }

    @Test
    public void creating_a_dog() {
        String name = "Fido";
        String favoriteToy = "Bone";
        int age = 5;

        // Create an object of Dog class
        Dog fido = new Dog(name,favoriteToy,age);
        Assert.assertEquals(fido.getName(),name);
        Assert.assertEquals(fido.getFavoriteToy(),favoriteToy);
        Assert.assertEquals(fido.getAge(),age);
    }

    @Test
    public void dog_make_noise() {
        String name = "Fido";
        String favoriteToy = "Bone";
        int age = 5;

        // Create an object of CAT class
        Dog fido = new Dog(name,favoriteToy,age);
        fido.makeNoise();
        Assert.assertEquals(fido.isFed(),true);
    }

    @Test
    public void creating_a_hampster() {
        String name = "Rusty";
        String favoriteGame = "Wheel";
        int age = 2;

        // Create an object of Dog class
        Hamster rusty = new Hamster(name,favoriteGame,age);
        Assert.assertEquals(rusty.getName(),name);
        Assert.assertEquals(rusty.getFavoriteGame(),favoriteGame);
        Assert.assertEquals(rusty.getAge(),age);
    }

    @Test
    public void pets_make_noise() {
        // Create an object of Pet class
        Cat felix = new Cat("Felix", "Tuna", 3);
        Dog fido = new Dog("Fido", "Bone", 5);
        Hamster rusty = new Hamster("Rusty", "Weel", 1);

        System.out.println("Felix goes = " + felix.makeNoise());
        System.out.println("Fido goes = " + fido.makeNoise());
        System.out.println("Rusty goes = " + rusty.makeNoise());
    }
}
