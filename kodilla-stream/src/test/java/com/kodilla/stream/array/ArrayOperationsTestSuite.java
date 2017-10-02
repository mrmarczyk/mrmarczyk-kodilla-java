package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {

    @Test

    public void testGetAverage() {

        //given
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        //when
        double testedAverage = getAverage(numbers);

        //then
        Assert.assertEquals(5.5, testedAverage, 0.1);


    }
}
