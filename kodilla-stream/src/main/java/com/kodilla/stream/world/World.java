package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {

    private final List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public BigDecimal getPeopleQuality(){
        BigDecimal totalPeopleQuantity = continents.stream().map()
    }
}
