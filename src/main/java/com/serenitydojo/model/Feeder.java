package com.serenitydojo.model;

public class Feeder {
    public FoodType feeds(AnimalType animal, boolean isPremium) {

        switch (animal) {
            case CAT:
                return (isPremium) ? FoodType.SALMON : FoodType.TUNA;
            case DOG:
                return  (isPremium) ? FoodType.DELUXE_DOG_FOOD : FoodType.DOG_FOOD;
            case HAMSTER:
                return (isPremium) ? FoodType.LETTUCE : FoodType.CABBAGE;
            default:
                return  FoodType.UNKNOWN;
        }
    }
}
