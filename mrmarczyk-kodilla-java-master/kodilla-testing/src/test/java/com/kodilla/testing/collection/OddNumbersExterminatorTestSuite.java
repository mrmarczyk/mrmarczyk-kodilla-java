package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminatorTestSuite {

    OddNumbersExterminator exterminator = new OddNumbersExterminator();

    @Before
    public void before() {
        System.out.println("Test Case: begin");
    }

    @After
    public void after() {
        System.out.println("Test Case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        /* Given */
        List<Integer> emptyList = new ArrayList<>();
        /* When */
        List<Integer> exterminatedList = exterminator.exterminate(emptyList);
        /* Then */
        Assert.assertEquals(0, exterminatedList.size());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> normalList = new ArrayList<Integer>();
        normalList.add(1);
        normalList.add(2);
        //When
        List<Integer> exterminatedList = exterminator.exterminate(normalList);
        //Then
        Assert.assertEquals (1, exterminatedList.size());
        Assert.assertEquals(new Integer(2), exterminatedList.get(0));
    }
}
