package com.serenitydojo.classAndObjects;

/**
 * 
 * TODO: Inheritance and Polymorphism concepts implementation with - Exercise 1.
 * 
 */
public class DogEntity extends AbstractPetEntity {
	
	private String favoriteToy;
	private int age;
	private String name;
	private static final String DOG_NOISE = "Woof";
    private boolean isFed; 

	public DogEntity(String name, String favoriteToy, int age) {
		super(name, age);
		this.favoriteToy = favoriteToy;
	}

	/**
	 * @return the favoriteToy
	 */
	public String getFavoriteToy() {
		return favoriteToy;
	}

	/**
	 * @param favoriteToy the favoriteToy to set
	 */
	public void setFavoriteToy(String favoriteToy) {
		this.favoriteToy = favoriteToy;
	}
	
	
	/**
	 * implementation of Exercise 4
	 * 
	 */
	public String makeNoise() {
		return DOG_NOISE;
	}
	
	public boolean isFed() {
		return isFed;
	}

	
	/**
	 * 
	 * @param isFed the isFed to set
	 */
	public void feed() {
		this.isFed = true;
	}

	@Override
	public String play() {
		return "plays with bone";
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return super.getAge();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return super.getName();
	}

}