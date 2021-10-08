package com.serenitydojo;

public class Hampster extends Pet {
    private String favoriteGame;
    private int age;

    public Hampster(String name, String favoriteGame, int age) {
        super(name);
        this.favoriteGame = favoriteGame;
        this.age = age;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String play() {
        return "runs in wheel";
    }

    @Override
    public String makeNoise() {
        return "Squeak";
    }
}
