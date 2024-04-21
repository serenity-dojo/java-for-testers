package com.serenitydojo.domain.flights;

public class HotelEntity {

	private final String name;
	private final int stars;
	
	public HotelEntity(String name, int stars) {
		this.name = name;
		this.stars = stars;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the stars
	 */
	public int getStars() {
		return stars;
	}

	@Override
	public String toString() {
		return "HotelEntity [name=" + name + ", stars=" + stars + "]";
	}

}