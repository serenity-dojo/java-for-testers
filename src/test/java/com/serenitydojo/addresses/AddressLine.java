package com.serenitydojo.addresses;

public class AddressLine {

    private final String JSON_FORMAT = "{\"street\": \"%s\", \"housenumber\": \"%s\"}";

    private final String street;
    private final String housenumber;

    public AddressLine(String street, String housenumber) {
        this.street = street;
        this.housenumber = housenumber;
    }

    public String getStreet() {
        return street;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public String asJson() {
        return  String.format(JSON_FORMAT, street, housenumber);
    }
}
