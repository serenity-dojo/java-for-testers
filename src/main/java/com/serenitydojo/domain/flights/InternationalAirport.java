package com.serenitydojo.domain.flights;
import java.util.List;

public class InternationalAirport extends AbstractAirportEntity implements ICanFlyOverseas, IHasHotels {

	private final List<String> servicedCountries;
    private final List<HotelEntity> hotels;
    
	public InternationalAirport(String name, String code, String country, List<String> servicedCountries,List<HotelEntity> hotels) {
		super(name, code, country);
		this.servicedCountries = servicedCountries;
		this.hotels = hotels;
	}

	@Override
	public List<HotelEntity> findHotels() {
		return this.hotels;
	}

	@Override
	public List<String> getServicedCountries() {
		return this.servicedCountries;
	}

	@Override
	public boolean canFlyOverseas() {
		return false;
	}

}