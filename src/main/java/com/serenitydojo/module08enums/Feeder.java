package com.serenitydojo.module08enums;

/**
 * Exercise 8.1a: Switches.
 */
public class Feeder {

    /**
     * Chooses the right food for an animal:
     * <pre>
     *            standard     premium
     *   CAT      TUNA         SALMON
     *   DOG      DOG_FOOD     DELUXE_DOG_FOOD
     *   HAMSTER  CABBAGE      LETTUCE
     * </pre>
     * Any other animal gets UNKNOWN food.
     */
    public FoodType feeds(AnimalType animal, boolean isPremium) {
        switch (animal) {
            case CAT:
                return isPremium ? FoodType.SALMON : FoodType.TUNA;
            case DOG:
                return isPremium ? FoodType.DELUXE_DOG_FOOD : FoodType.DOG_FOOD;
            case HAMSTER:
                return isPremium ? FoodType.LETTUCE : FoodType.CABBAGE;
            default:
                return FoodType.UNKNOWN;
        }
    }
}
