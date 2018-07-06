package com.kodilla.testing.shape;

public class Square implements Shape {

    public final double a;

    public Square(double a) {
       this.a = a;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return a * a;
    }

    @Override
    public String toString() {
        return getShapeName() + " | " + getField();}
}
