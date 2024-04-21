package com.serenitydojo.classAndObjects;

/**
 * 
 * TODO: Inheritance and Polymorphism concepts implementation with - Exercise 1.
 * 
 */
public class CatEntity extends AbstractPetEntity {

	private String favoriteFood;
	public static final String CAT_NOISE = "Meow";

	public static String usualFood() {
		return "Tuna";
	}

	public CatEntity(String name, int age) {
		super(name, age);
		this.favoriteFood = usualFood();
	}

	public CatEntity(String name, String favoriteFood, int age) {
		super(name, age);
		this.favoriteFood = favoriteFood;
	}

	/**
	 * @return the favoriteFood
	 */
	public String getFavoriteFood() {
		return favoriteFood;
	}

	/**
	 * @param favoriteFood the favoriteFood to set
	 */
	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public void makeNoise() {
		System.out.println(CAT_NOISE);
	}

	public void feed(String food) {
		System.out.println(getName() + " eats some " + food);
	}

	public void groom() {
		lickPaws();
		cleanFur();
	}

	private void cleanFur() {
		System.out.println(getName() + " cleans his fur");
	}

	private void lickPaws() {
		System.out.println(getName() + " licks his paws");
	}

	@Override
	public String play() {
		return "plays with string";
	}

	@Override
	public String toString() {
		return "CatEntity [favoriteFood=" + favoriteFood + " name=" +getName()+", age="+getAge()+"]";
	}

}