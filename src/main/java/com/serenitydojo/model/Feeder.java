package com.serenitydojo.model;

public class Feeder {
    public String feeds(AnimalType animal, boolean isPremium) {

        switch (animal) {
            case CAT:
                return (isPremium) ? String.valueOf(FoodType.SALMON) : String.valueOf(FoodType.TUNA);
            case DOG:
                return (isPremium) ? FoodType.DELUXE_DOG_FOOD.toString() : FoodType.DOG_FOOD.toString();
            case HAMSTER:
                return (isPremium) ? FoodType.LETTUCE.toString() : FoodType.CABBAGE.toString();
            default:
                return FoodType.UNKNOWN.toString();
        }
        /*if(animal.equals("Cat")){
            return (isPremium) ? "Salmon" : "Tuna";
        } else if (animal.equals("Dog")) {
            return (isPremium) ? "Deluxe food" : "Dog food";
        } else return (isPremium) ? "Lettuce" : "Cabbage";*/

    }
}
