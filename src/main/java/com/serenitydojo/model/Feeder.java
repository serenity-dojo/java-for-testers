package com.serenitydojo.model;

public class Feeder {
    public String feeds(AnimalType animal, boolean isPremium) {

        switch (animal) {
            case CAT:
                return (isPremium) ? "Salmon" : "Tuna";
            case DOG:
                return (isPremium) ? "Meat" : "Dog Food";
            case HAMSTER:
                return (isPremium) ? "Letucce" : "Cabbage";
            default:
                return "Don't known this animal - don't known its food";
        }
    }
}