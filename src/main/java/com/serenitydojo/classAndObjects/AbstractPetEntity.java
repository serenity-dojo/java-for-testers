package com.serenitydojo.classAndObjects;

/**
 * 
 * TODO: Inheritance and Polymorphism concepts implementation with - Exercise 1.
 * 
 */
public abstract class AbstractPetEntity {
	
	private String name;
	private int age;
	public abstract String play();
	
	public AbstractPetEntity(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "AbstractPetEntity [name=" + name + ", age=" + age + "]";
	}


}