package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {

        Cat felix = new Cat("Felix","Tuna", 4);

        Assert.assertEquals(felix.getName(), "Felix");
        Assert.assertEquals(felix.getFavoriteFood(), "Tuna");
        Assert.assertEquals(felix.getAge(), 4);
    }

    @Test
    public void creating_a_dog() {

        Dog poppy = new Dog("Poppy","Teddy Bear", 7);

        Assert.assertEquals(poppy.getName(), "Poppy");
        Assert.assertEquals(poppy.getFavoriteToy(), "Teddy Bear");
        Assert.assertEquals(poppy.getAge(), 7);

    }
}
