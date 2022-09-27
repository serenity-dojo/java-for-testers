package com.serenitydojo;

public class Dog extends Pet{

    private String name;
    private String toy;
    private int age;

    public static String DOG_NOISE = "Woof";

    public static String PLAY = "plays with bone";

    public boolean isFed = true;

    public Dog(String name, String toy, int age) {
        super(name, age);
        this.toy = toy;
    }

    @Override
    public String makeNoise()
    {
        return DOG_NOISE;
    }

    @Override
    public String play() {
        return PLAY;
    }

    public void feed(){
        System.out.println(isFed);
    }

    public String getToy() {
        return toy;
    }

    public int getAge() {
        return age;
    }
}
