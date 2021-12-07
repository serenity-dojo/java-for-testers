package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;
import static com.serenitydojo.Cat.usualFood;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {

        Cat felix = new Cat("Felix","Tuna", 4);

        Assert.assertEquals(felix.getName(), "Felix");
        Assert.assertEquals(felix.getFavoriteFood(), "Tuna");
        Assert.assertEquals(felix.getAge(), 4);

        //Pet hampter = new Hampster("Rusty");
    }

    @Test
    public void creating_a_dog() {

        Dog fido = new Dog("Fido","Bone", 5);
        Assert.assertEquals(fido.getName(), "Fido");
        Assert.assertEquals(fido.getFavoriteToy(), "Bone");
        Assert.assertEquals(fido.getAge(), 5);

    }

    @Test
    public void cat_makes_noise() {
        Cat felix = new Cat("Felix", 4);
        Cat spot = new Cat("Spot","Salmon", 3);

        System.out.println("Cats like " + usualFood());
    }

    /*
    * Test for hampster class
     * */
    @Test
    public void creating_a_hampster()
    {
        Hampster rusty = new Hampster("Rusty","Wheel", 1);
        Assert.assertEquals(rusty.getName(), "Rusty");
        Assert.assertEquals(rusty.getFavoriteGame(), "Wheel");
        Assert.assertEquals(rusty.getAge(), 1);
    }

    @Test
    public void cat_make_noise(){
        Cat felix = new Cat("felix", 4);
        System.out.println("Felix goes" + felix.makeNoise());
    }

    @Test
    public void dog_make_noise(){
        Dog fido = new Dog("Fido", "bone", 5);
        System.out.println("Fido goes" + fido.makeNoise());
    }

    @Test
    public void pets_make_noise(){
        Pet felix = new Cat("Felix", 4);
        Pet fido = new Dog("Fido", "bone", 5);
        Pet rusty = new Hampster("Rusty", "Wheels", 1);

        System.out.println("Felix goes" + felix.makeNoise());
        System.out.println("Fido goes" + fido.makeNoise());
        System.out.println("Rusty goes" + rusty.makeNoise());
        System.out.println("Felix goes" + felix.goForWalks());
    }
}
