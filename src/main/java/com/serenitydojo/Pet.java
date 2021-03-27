package com.serenitydojo;

public abstract class Pet {
    private String name;
    private int age;


    public Pet(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String goForWalks() { return "walk walk walk"; }
    public abstract String makeNoise();
    public abstract String play();
}
