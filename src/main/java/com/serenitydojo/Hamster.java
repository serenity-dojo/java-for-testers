package com.serenitydojo;

public class Hamster extends Pet{


    private String favoriteGame;
    private int age;

    public static String PLAY = "plays in wheel";

    public Hamster(String name, String favoriteGame, int age){
        super(name, age);
        this.favoriteGame = favoriteGame;
    }
    public String getFavoriteGame() {
        return favoriteGame;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String makeNoise(){
        return "Squeak";
    }

    @Override
    public String play() {
        return PLAY;
    }
}
