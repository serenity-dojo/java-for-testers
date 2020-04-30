package com.serenitydojo.model;

public class Feeder {
    public String feeds(AnimalType animal, boolean isPremium) {

        switch (animal) {
            case CAT:
                return (isPremium) ? "Salmon" : "Tuna";
            case DOG:
                return  (isPremium) ? "Deluxe Dog Food" : "Dog Food";
            case HAMSTER:
                return (isPremium) ? "Lettuce" : "Cabbage";
            default:
                return  "Don't know this animal - don't know the food";
        }
    }
}
