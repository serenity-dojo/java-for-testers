package com.serenitydojo.classAndObjects;

/**
 * 
 * TODO: Inheritance and Polymorphism concepts implementation with - Exercise 2,Exercise 1
 * 
 */
public class HampsterEntity extends AbstractPetEntity {
	
	private String favoriteGame;
	
	public HampsterEntity(String name, int age,String favoriteGame) {
		super(name, age);
	}

	@Override
	public String play() {
		return "runs in wheel";
	}

	/**
	 * @return the favoriteGame
	 */
	public String getFavoriteGame() {
		return favoriteGame;
	}

	/**
	 * @param favoriteGame the favoriteGame to set
	 */
	public void setFavoriteGame(String favoriteGame) {
		this.favoriteGame = favoriteGame;
	}

}