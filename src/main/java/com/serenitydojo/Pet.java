package com.serenitydojo;

public abstract class Pet {

    private String name;
    private int age;

    // Constructor Method
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String makeNoise();

    public abstract String play();
}
