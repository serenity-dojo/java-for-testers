package com.serenitydojo.enums;

import org.junit.Test;

import java.util.EnumMap;

public class WhenManipulatingEnums {

    static EnumMap<Level, String> LEVEL_LABELS = new EnumMap<>(Level.class);
    static {
        LEVEL_LABELS.put(Level.HIGH, "HIGH!");
        LEVEL_LABELS.put(Level.MEDIUM, "MEDIUM!");
        LEVEL_LABELS.put(Level.LOW, "LOW!");
        LEVEL_LABELS.put(Level.REALLY_LOW, "REALLY LOW!");
    }

    @Test
    public void withConditionals() {

        String levelAsText = LEVEL_LABELS.get(Level.HIGH);

        System.out.println(Level.HIGH.toString());
        System.out.println(levelAsText);
    }

    @Test
    public void whenUsingEnumAttributes() {

        Ladder ladder = new Ladder(10);
        compareByHeightTo(ladder,5);
        compareByHeightTo(Level.HIGH,3);
    }

    public void compareByHeightTo(ComparableByHeight thing, int minimumHeight) {
        if (thing.isHighEnough(minimumHeight)) {
            System.out.println("HIGH ENOUGH");
        } else {
            System.out.println("NOT HIGH ENOUGH!");
        }
    }
}
