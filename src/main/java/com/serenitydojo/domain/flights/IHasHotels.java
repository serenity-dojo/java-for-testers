package com.serenitydojo.domain.flights;
import java.util.List;
import java.util.stream.Collectors;

public interface IHasHotels {

	List<HotelEntity> findHotels();

	default List<HotelEntity> findHotelsByStars(int numberOfStars) {
		return findHotels().stream()
				           .filter(hotel -> hotel.getStars() == numberOfStars)
				           .collect(Collectors.toList());
	}

}