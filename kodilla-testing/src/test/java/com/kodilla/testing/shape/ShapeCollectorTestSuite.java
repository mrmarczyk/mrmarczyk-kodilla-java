package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    private ShapeCollector collector;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        collector = new ShapeCollector();
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Circle circle = new Circle(2);
        //When
        collector.addFigure(circle);
        //Then
        Assert.assertEquals(circle, collector.getFigure(0));
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void testRemoveFigure() {
        //Given
        Circle circle = new Circle(3);
        collector.addFigure(circle);
        //When
        Boolean result = collector.removeFigure(circle);
        //Then
        Assert.assertTrue(result);
        collector.getFigure(0);
    }

    @Test
    public void testGetFigure() {
        //Given
        Circle circle = new Circle(3);
        collector.addFigure(circle);
        //When
        Shape addedFigure = collector.getFigure(0);
        //Then
        Assert.assertEquals(circle, addedFigure);
    }

    @Test
    public void testShowFigures() {
        //Given
        Circle circle = new Circle(1);
        Square square = new Square(2);
        Triangle triangle = new Triangle(2,1);
        collector.addFigure(circle);
        collector.addFigure(square);
        collector.addFigure(triangle);
        //When
        String showFigures = collector.showFigures();
        //Then
        Assert.assertEquals(circle.getShapeName() + " | " + circle.getField() + "\t" + square.getShapeName() + " | " + square.getField() + "\t" + triangle.getShapeName() + " | " + triangle.getField()  + "\t", showFigures);
    }


}
