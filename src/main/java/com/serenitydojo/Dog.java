package com.serenitydojo;

public class Dog {

    private String name;
    private String toy;
    private int age;

    public Dog(String name, String toy, int age) {
        this.name = name;
        this.toy = toy;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getToy() {
        return toy;
    }

    public int getAge() {
        return age;
    }
}
