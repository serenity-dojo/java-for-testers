package com.serenitydojo.module03classes;

/**
 * Exercise 3.3b: Protecting a field with a setter.
 */
public class Hamster {
//@@ solution
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
//@@ starter
    // TODO: add a private name and age, a constructor, and getters for both.
    //       Add a setAge() method too, but ignore any age that is less than zero.
    //       There should be no setter for the name.
//@@ end
}
