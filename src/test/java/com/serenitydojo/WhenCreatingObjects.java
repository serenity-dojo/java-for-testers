package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenCreatingObjects {
    @Test
    public void creating_a_cat(){
        String name = "Felix";
        String food = "Tuna";
        int age = 4;

        Cat felix = new Cat("Felix", "Tuna", 4);

        Assert.assertEquals(felix.getName(), "Felix");
        Assert.assertEquals(felix.getFood(), "Tuna");
        Assert.assertEquals(felix.getAge(), 4);

        Pet hamster = new Hamster("Rulo", "Ball", 6);
        /* System.out.println(felix.getName());
        System.out.println(felix.getFood());
        System.out.println(felix.getAge());

        Cat spot = new Cat( "Spot", "Tuna", 3);
        System.out.println("Spot´s age is " + spot.getAge());*/

    }

    @Test
    public void creating_a_dog(){
        Dog rosco = new Dog("Rosco", "stick", 5);
        Assert.assertEquals(rosco.getName(), "Rosco");
        Assert.assertEquals(rosco.getToy(), "stick");
        Assert.assertEquals(rosco.getAge(), 5);
    }

    @Test
    public void cat_make_noise(){
        Cat spot = new Cat( "Spot", "Tuna", 3);
        Cat felix = new Cat("Felix", "Tuna", 4);

        System.out.println("Usual Food " + Cat.usualFood());
        System.out.println("Felix´s favorite food = " + felix.getFood());
        System.out.println("Felix goes " + felix.makeNoise());
        //Cat.CAT_NOISE = "Loud meow";

        /*spot.makeNoise();
        felix.makeNoise();
        spot.groom();
        spot.feed("Salmon");
        felix.feed("Tuna");*/

    }

    @Test
    public void dog_makes_noise(){
        Dog fido = new Dog("Fido", "Bone", 3);
        System.out.println("Fido goes " + fido.makeNoise());
    }

    @Test
    public void pets_make_noise(){
        Pet felix = new Cat("Felix", "String", 4);
        Pet fido = new Dog("Fido", "bone", 5);
        Pet rusty = new Hamster("Rusty", "Wheel", 5);

        System.out.println("Felix goes " + felix.makeNoise());
        System.out.println("Rusty goes " + rusty.makeNoise());
        System.out.println("Fido goes " + fido.makeNoise());
    }

    @Test
    public void creating_hamster(){

        Hamster rulo = new Hamster("Rulo", "Wheel", 10);

        Assert.assertEquals(rulo.getName(), "Rulo");
        Assert.assertEquals(rulo.getFavoriteGame(), "Wheel");
        Assert.assertEquals(rulo.getAge(), 10);
    }

    @Test
    public void whenAnimalsPlay(){
        Pet fido = new Dog("Fido", "Bone", 5);
        Pet spot = new Cat("Spot", "String", 5);
        Pet hazel = new Hamster("Hazel", "Wheel", 3);

        assertThat(fido.play(), equalTo("plays with bone"));
        assertThat(spot.play(), equalTo("plays with string"));
        assertThat(hazel.play(), equalTo("plays in wheel"));
    }

}
