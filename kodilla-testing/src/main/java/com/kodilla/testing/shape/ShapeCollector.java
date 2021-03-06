package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.StringJoiner;

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

        //StringJoiner

        StringJoiner sj = new StringJoiner("\t");
        for (Shape shape : collector)
        {
            sj.add(shape.toString());
        }

        System.out.println(sj.toString());

        return sj.toString();


        /*StringBuilder

        StringBuilder sb = new StringBuilder();

        for (Shape shape : collector)
        {
            sb.append(shape);
            sb.append("\t");
        }

        System.out.println(sb.toString());

        return sb.toString();
        */


    }
}
