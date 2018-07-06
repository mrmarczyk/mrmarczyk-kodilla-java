package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public class World {

    private final List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getLocalPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
