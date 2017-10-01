package com.kodilla.stream.world;

import java.util.Set;

public class Continent {

    private final String continentName;

    private final Set<Country> countries;

    public Continent(String continentName, Set<Country> countries) {
        this.continentName = continentName;
        this.countries = countries;
    }
}
