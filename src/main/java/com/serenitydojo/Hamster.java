package com.serenitydojo;

public class Hamster extends Pet {
    private String favoriteGame;
    public static final String HAMPSTER_NOISE = "Squeak";
    public Hamster(String name, String favoriteGame, int age) {
        super(name,age);
        this.favoriteGame = favoriteGame;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }

    @Override
    public String makeNoise() {
        return HAMPSTER_NOISE;
    }

    @Override
    public String play() {
        return HAMPSTER_NOISE;
    }
}
