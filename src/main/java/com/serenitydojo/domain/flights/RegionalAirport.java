package com.serenitydojo.domain.flights;
import java.util.List;

public class RegionalAirport extends AbstractAirportEntity implements IHasHotels {

	private final List<HotelEntity> hotels;

	public RegionalAirport(String name, String code, String country, List<HotelEntity> hotels) {
		super(name, code, country);
		this.hotels = hotels;
	}

	@Override
	public List<HotelEntity> findHotels() {
		return this.hotels;
	}

	@Override
	public boolean canFlyOverseas() {
		return false;
	}

}