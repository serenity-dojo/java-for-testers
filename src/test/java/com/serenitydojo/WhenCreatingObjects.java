package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {

        Cat felix = new Cat("Felix","Tuna", 4);

        assertEquals(felix.getName(), "Felix");
        assertEquals(felix.getFavoriteFood(), "Tuna");
        assertEquals(felix.getAge(), 4);
    }

    @Test
    public void creating_a_dog() {

        Dog fido = new Dog("Fido","Bone", 5);
        assertEquals(fido.getName(), "Fido");
        assertEquals(fido.getFavoriteToy(), "Bone");
        assertEquals(fido.getAge(), 5);

    }

    @Test
    public void creating_a_hampster() {

        Hampster rusty = new Hampster("Rusty","Wheel",1);

        assertEquals(rusty.getName(),"Rusty");
        assertEquals(rusty.getFavoriteGame(),"Wheel");
        assertEquals(rusty.getAge(),1);
    }


    @Test
    public void cat_makes_noise() {
        Cat felix = new Cat("Felix", 4);

        System.out.println("Felix goes " + felix.makeNoise());
    }

    @Test
    public void dog_makes_noise() {
        Dog fido = new Dog("Fido","bone", 5);

        System.out.println("Fido goes " + fido.makeNoise());
    }

    @Test
    public void pets_make_noise() {
        Pet felix = new Cat("Felix",4);
        Pet fido = new Dog("Fido", "bone", 5);
        Pet rusty = new Hampster("Rusty", "wheels", 1);

        System.out.println("Felix goes " + felix.makeNoise());
        System.out.println("Fido goes " + fido.makeNoise());
        System.out.println("Rusty goes " + rusty.makeNoise());
    }

    @Test
    public void pets_can_play() {
        Pet felix = new Cat("Felix",4);
        Pet fido = new Dog("Fido", "bone", 5);
        Pet rusty = new Hampster("Rusty", "wheels", 1);

//        assertEquals(felix.play(), "plays with string");
//        assertEquals(fido.play(), "plays with bone");
//        assertEquals(rusty.play(), "runs in wheel");

    }

}
