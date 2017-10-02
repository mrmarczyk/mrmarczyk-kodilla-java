package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private final String countryName;
    private final BigDecimal localPeopleQuantity;

    public Country(String countryName, BigDecimal localPeopleQuantity) {
        this.countryName = countryName;
        this.localPeopleQuantity = localPeopleQuantity;
    }

    public BigDecimal getLocalPeopleQuantity() {
        return localPeopleQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        if (countryName != null ? !countryName.equals(country.countryName) : country.countryName != null) return false;
        return localPeopleQuantity != null ? localPeopleQuantity.equals(country.localPeopleQuantity) : country.localPeopleQuantity == null;
    }

    @Override
    public int hashCode() {
        int result = countryName != null ? countryName.hashCode() : 0;
        result = 31 * result + (localPeopleQuantity != null ? localPeopleQuantity.hashCode() : 0);
        return result;
    }
}
