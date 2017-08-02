package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> collector = new ArrayList<>();

    public void addFigure(Shape shape) {
        collector.add(shape);
    }

    public Boolean removeFigure(Shape shape) {
        return collector.remove(shape);
    }

    public Shape getFigure(int n) {
        return collector.get(n);
    }

    public String showFigures() {

        String result = "";
        for (Shape shape: collector) {
            result += (shape.getShapeName() + " " + shape.getField() + "\n").toString();
        }

        System.out.println(result);
        return result;
    }
}
