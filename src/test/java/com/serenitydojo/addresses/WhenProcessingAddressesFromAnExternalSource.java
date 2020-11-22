package com.serenitydojo.addresses;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class WhenProcessingAddressesFromAnExternalSource {

    @Test
    public void it_should_work_for_simple_DE_addresses() {
        assertThat(FormattedAddress.of( "Winterallee 3")).isEqualTo("{\"street\": \"Winterallee\", \"housenumber\": \"3\"}");
    }

    @Test
    public void it_should_work_for_simple_DE_addresses_with_longer_street_numbers() {
        assertThat(FormattedAddress.of( "Musterstrasse 45")).isEqualTo("{\"street\": \"Musterstrasse\", \"housenumber\": \"45\"}");
    }

    @Test
    public void it_should_work_for_simple_DE_addresses_with_alphanumberical_street_numbers() {
        assertThat(FormattedAddress.of( "Blaufeldweg 123B")).isEqualTo("{\"street\": \"Blaufeldweg\", \"housenumber\": \"123B\"}");
    }

    @Test
    public void it_should_work_for_simple_addresses_with_german_characters() {
        assertThat(FormattedAddress.of( "Am Bächle 23")).isEqualTo("{\"street\": \"Am Bächle\", \"housenumber\": \"23\"}");
    }

    @Test
    public void it_should_work_for_simple_DE_addresses_with_alphanumberical_street_numbers2() {
        assertThat(FormattedAddress.of( "Auf der Vogelwiese 23 b")).isEqualTo("{\"street\": \"Auf der Vogelwiese\", \"housenumber\": \"23 b\"}");
    }

    @Test
    public void it_should_work_for_simple_FR_addresses() {
        assertThat(FormattedAddress.of( "4444, rue de la revolution")).isEqualTo("{\"street\": \"rue de la revolution\", \"housenumber\": \"4444\"}");
    }

    @Test
    public void it_should_work_for_simple_US_addresses() {
        assertThat(FormattedAddress.of( "200 Broadway Av")).isEqualTo("{\"street\": \"Broadway Av\", \"housenumber\": \"200\"}");
    }

    @Test
    public void it_should_work_for_simple_ES_addresses() {
        assertThat(FormattedAddress.of( "Calle Aduana, 29")).isEqualTo("{\"street\": \"Calle Aduana\", \"housenumber\": \"29\"}");
    }

    @Test
    public void it_should_work_for_ES_addresses_with_NO() {
        assertThat(FormattedAddress.of( "Calle 39 No 1540")).isEqualTo("{\"street\": \"Calle 39\", \"housenumber\": \"No 1540\"}");
    }

}
