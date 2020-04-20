package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {

        Cat felix = new Cat("Felix","Tuna", 4);

        assert felix.getName().equals("Spot");
        Assert.assertEquals(felix.getAge(), 5);
        Assert.assertEquals(felix.getFavoriteFood(), "Tuna");
        Assert.assertEquals(felix.getAge(), 5);
    }
}
