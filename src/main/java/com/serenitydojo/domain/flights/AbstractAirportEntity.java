package com.serenitydojo.domain.flights;

public abstract class AbstractAirportEntity {

	private final String name;
	private final String code;
	private final String country;
	
	public AbstractAirportEntity(String name, String code, String country) {
		this.name = name;
		this.code = code;
		this.country = country;
	}

	public abstract boolean canFlyOverseas();
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	
}