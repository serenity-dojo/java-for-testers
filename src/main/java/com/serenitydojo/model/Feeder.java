package com.serenitydojo.model;

public class Feeder {
    public String feeds(String animal, boolean isPremium) {
        if (animal.equals("Cat")) {
            return (isPremium) ? "Salmon" : "Tuna";
        } else if (animal.equals("Dog")) {
            return "Dog Food";
        }

        return "Cabbage";

    }
}
