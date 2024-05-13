package com.serenitydojo.enums;

import org.junit.Test;

import java.util.EnumMap;

public class WhenManipulateEnums {

    static EnumMap<Level,String> LEVEL_LABELS = new EnumMap<>(Level.class);
    static {
        LEVEL_LABELS.put(Level.HIGH, "HIGH!");
        LEVEL_LABELS.put(Level.MEDIUM, "MEDIUM!");
        LEVEL_LABELS.put(Level.LOW, "LOW!");
    }

    @Test
    public void withConditionals() {
        Level myLevel = Level.HIGH;

        if(myLevel == Level.HIGH) {
            System.out.println("High Level");
        } else{
            System.out.println("Another Level");
        }

        switch(myLevel) {
            case HIGH:System.out.println(myLevel);break;
            case MEDIUM:System.out.println("MEDIUM!");break;
            case LOW:System.out.println("LOW!");break;
            default:
                System.out.println("Don't know the level");
        }
    }

    @Test
    public void associateLabel() {
        EnumMap<Level,String> labelLeves = new EnumMap<>(Level.class);

        labelLeves.put(Level.HIGH,"HIGH!");
        labelLeves.put(Level.MEDIUM,"MEDIUM!");
        labelLeves.put(Level.LOW,"LOW!");
        System.out.println("High Level");

        Level myLevel = Level.HIGH;
        System.out.println(labelLeves.get(myLevel));

    }

    @Test
    public void associateLabelStatic() {
        System.out.println(LEVEL_LABELS.get(Level.HIGH));

    }

    @Test
    public void whenUsingEnumAttributes() {
        System.out.println(Level.HIGH.getLevelCode());

        System.out.println(Level.LOW.isHighEnough(3));
        System.out.println(Level.HIGH.isHighEnough(3));

    }
}
