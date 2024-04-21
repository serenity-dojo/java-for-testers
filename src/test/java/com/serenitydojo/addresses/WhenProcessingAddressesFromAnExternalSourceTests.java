package com.serenitydojo.addresses;
import static org.assertj.core.api.Assertions.assertThat;
import org.testng.annotations.Test;

public class WhenProcessingAddressesFromAnExternalSourceTests {

	@Test
	public void it_should_work_for_simple_DE_addresses() {
	assertThat(FormattedAddressEntity.of("Winterallee 3"))
				.isEqualTo("{\"street\": \"Winterallee\", \"housenumber\": \"3\"}");
	
	System.out.println("\nTC-01 - it_should_work_for_simple_DE_addresses() - Executed successfully.");
	}

	
	@Test
	public void it_should_work_for_simple_DE_addresses_with_longer_street_numbers() {
	assertThat(FormattedAddressEntity.of("Musterstrasse 45"))
				.isEqualTo("{\"street\": \"Musterstrasse\", \"housenumber\": \"45\"}");
	
	System.out.println("\nTC-02 - it_should_work_for_simple_DE_addresses_with_longer_street_numbers() - Executed successfully.");
	}

	
	@Test
	public void it_should_work_for_simple_DE_addresses_with_alphanumberical_street_numbers() {
	assertThat(FormattedAddressEntity.of("Blaufeldweg 123B"))
				.isEqualTo("{\"street\": \"Blaufeldweg\", \"housenumber\": \"123B\"}");
	
	System.out.println("\nTC-03 - it_should_work_for_simple_DE_addresses_with_alphanumberical_street_numbers() - Executed successfully.");
	}

	
	@Test
	public void it_should_work_for_simple_addresses_with_german_characters() {
	assertThat(FormattedAddressEntity.of("Am Bächle 23"))
				.isEqualTo("{\"street\": \"Am Bächle\", \"housenumber\": \"23\"}");
	
	System.out.println("\nTC-04 - it_should_work_for_simple_addresses_with_german_characters() - Executed successfully.");
	}

	
	@Test
	public void it_should_work_for_simple_DE_addresses_with_alphanumberical_street_numbers2() {
	assertThat(FormattedAddressEntity.of("Auf der Vogelwiese 23 b"))
				.isEqualTo("{\"street\": \"Auf der Vogelwiese\", \"housenumber\": \"23 b\"}");
	
	System.out.println("\nTC-05 - it_should_work_for_simple_DE_addresses_with_alphanumberical_street_numbers2() - Executed successfully.");
	}

	
	@Test
	public void it_should_work_for_simple_FR_addresses() {
	assertThat(FormattedAddressEntity.of("4444, rue de la revolution"))
				.isEqualTo("{\"street\": \"rue de la revolution\", \"housenumber\": \"4444\"}");
	
	System.out.println("\nTC-06 - it_should_work_for_simple_FR_addresses() - Executed successfully.");
	}

	
	@Test
	public void it_should_work_for_simple_US_addresses() {
	assertThat(FormattedAddressEntity.of("200 Broadway Av"))
				.isEqualTo("{\"street\": \"Broadway Av\", \"housenumber\": \"200\"}");
	
	System.out.println("\nTC-07 - it_should_work_for_simple_US_addresses() - Executed successfully.");
	}

	
	@Test
	public void it_should_work_for_simple_ES_addresses() {
	assertThat(FormattedAddressEntity.of("Calle Aduana, 29"))
				.isEqualTo("{\"street\": \"Calle Aduana\", \"housenumber\": \"29\"}");
	
	System.out.println("\nTC-08 - it_should_work_for_simple_ES_addresses() - Executed successfully.");
	}

	
	@Test
	public void it_should_work_for_ES_addresses_with_NO() {
	assertThat(FormattedAddressEntity.of("Calle 39 No 1540"))
				.isEqualTo("{\"street\": \"Calle 39\", \"housenumber\": \"No 1540\"}");
	
	System.out.println("\nTC-09 - it_should_work_for_ES_addresses_with_NO() - Executed successfully.");
	}

}