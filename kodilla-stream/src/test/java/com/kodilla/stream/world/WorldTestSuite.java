package com.kodilla.stream.world;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.Collections;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //given
        Country country1 = new Country("Polska", new BigDecimal(37000000));
        Continent continent1 = new Continent("Europa", Collections.singleton(country1));
        World world = new World(Collections.singletonList(continent1));

        //when


        //then
    }
}
