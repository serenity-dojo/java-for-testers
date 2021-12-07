package com.serenitydojo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {

        Cat felix = new Cat("Felix", "Tuna", 4);

        assertEquals(felix.getName(), "Felix");
        assertEquals(felix.getFavoriteFood(), "Tuna");
        assertEquals(felix.getAge(), 4);
    }

    @Test
    public void creating_a_dog() {
        Dog fido = new Dog("Fido", "Bone", 5);
        assertEquals(fido.getName(), "Fido");
        assertEquals(fido.getFavoriteToy(), "Bone");
        assertEquals(fido.getAge(), 5);
    }
}
