package com.serenitydojo.module03classes;

/**
 * Exercise 3.3b: Protecting a field with a setter.
 */
public class Hamster {
    private final String name;
    private int age;

    public Hamster(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }
}
