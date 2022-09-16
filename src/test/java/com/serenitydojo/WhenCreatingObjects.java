package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {
    @Test
    public void creating_a_cat(){
        String name = "Felix";
        String food = "Tuna";
        int age = 4;

        Cat felix = new Cat("Felix", "Tuna", 4);


        System.out.println(felix.getName());
        System.out.println(felix.getFood());
        System.out.println(felix.getAge());

        Cat spot = new Cat( "Spot", "Tuna", 3);
        System.out.println("Spot´s age is " + spot.getAge());

    }

    @Test
    public void creating_a_dog(){
        Dog rosco = new Dog("Rosco", "stick", 5);
        Assert.assertEquals(rosco.getName(), "Rosco");
        Assert.assertEquals(rosco.getToy(), "stick");
        Assert.assertEquals(rosco.getAge(), 5);
    }
}
