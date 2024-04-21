package com.serenitydojo.addresses;

public class AddressLineEntity {

	private final String street;
	private final String housenumber;
	private final String JSON_FORMAT = "{\"street\": \"%s\", \"housenumber\": \"%s\"}";

	public AddressLineEntity(String street, String housenumber) {
		this.street = street;
		this.housenumber = housenumber;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @return the housenumber
	 */
	public String getHousenumber() {
		return housenumber;
	}

	public String asJson() {
		return String.format(JSON_FORMAT, street, housenumber);
	}

}