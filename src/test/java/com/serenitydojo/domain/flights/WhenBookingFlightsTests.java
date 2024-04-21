package com.serenitydojo.domain.flights;
import java.util.Arrays;
import java.util.List;
import org.testng.annotations.Test;

public class WhenBookingFlightsTests {

	List<HotelEntity> londonHotels = Arrays.asList(new HotelEntity("Hilton", 5), new HotelEntity("Holiday Inn", 3));
	List<HotelEntity> barcelonHotels = Arrays.asList(new HotelEntity("Hilton", 5), new HotelEntity("Double Tree", 4));
	List<HotelEntity> halifaxHotels = Arrays.asList(new HotelEntity("Holiday Inn", 3));

	@Test
	void shouldHaveAListOfServicedAirports() {
		AbstractAirportEntity heathrow = new InternationalAirport("Heathrow", "LHR", "United Kingdom",
				Arrays.asList("France", "Spain", "USA", "Canada"), londonHotels);
		AbstractAirportEntity barcelona = new InternationalAirport("Barcelona", "BCN", "Spain",
				Arrays.asList("UK", "France", "Italy"), barcelonHotels);
		AbstractAirportEntity halifax = new RegionalAirport("Halifax", "YHZ", "Canada", halifaxHotels);

		List<AbstractAirportEntity> airports = Arrays.asList(halifax, barcelona, heathrow);

		for (AbstractAirportEntity airport : airports) {
			System.out.println("AIRPORT CODE: " + airport.getCode());
			if (airport instanceof IHasHotels) {
				IHasHotels airportWithHotels = (IHasHotels) airport;
				System.out.println("5 star hotels: " + airportWithHotels.findHotelsByStars(5));
			}
		}
	System.out.println("\nTC-01 - shouldHaveAListOfServicedAirports() - Executed successfully.");
	}

}