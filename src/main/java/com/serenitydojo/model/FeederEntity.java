package com.serenitydojo.model;
import static com.serenitydojo.model.FoodTypeEnum.CABBAGE;
import static com.serenitydojo.model.FoodTypeEnum.DELUXE_DOG_FOOD;
import static com.serenitydojo.model.FoodTypeEnum.DOG_FOOD;
import static com.serenitydojo.model.FoodTypeEnum.LETTUCE;
import static com.serenitydojo.model.FoodTypeEnum.SALMON;
import static com.serenitydojo.model.FoodTypeEnum.TUNA;

public class FeederEntity {

	public FoodTypeEnum feeds(AnimalTypeEnum animal, boolean isPremium) {
		
		switch (animal) {
		case CAT:
			return (isPremium) ? SALMON : TUNA;
		case DOG:
			return (isPremium) ? DELUXE_DOG_FOOD : DOG_FOOD;
		case HAMSTER:
			return (isPremium) ? LETTUCE : CABBAGE;
		default:
			return FoodTypeEnum.UNKNOWN;
		}
		
	}

}