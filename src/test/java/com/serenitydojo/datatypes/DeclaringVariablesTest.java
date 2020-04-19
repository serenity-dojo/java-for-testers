package com.serenitydojo.datatypes;

import org.junit.Assert;
import org.junit.Test;

public class DeclaringVariablesTest {
    @Test
    public void declaring_simple_numbers() {
        int age = 42;
        age = age + 1;
        System.out.println("Age ="  + age);
    }

    @Test
    public void declaring_final_numbers() {
        final int ageThisYear = 42;
        int ageNextYear = ageThisYear + 1;
        System.out.println("Age next year ="  + ageNextYear);
    }

    @Test
    public void declaring_final_numbers_and_asserting_the_result() {
        final int ageThisYear = 42;
        int ageNextYear = ageThisYear + 1;
        Assert.assertEquals(43, ageNextYear);
    }

    @Test
    public void declaring_strings() {
        String name = "Jane";

        String uppercaseName = name.toUpperCase();
        System.out.println("Upper case name = "  + uppercaseName);


    }
}
