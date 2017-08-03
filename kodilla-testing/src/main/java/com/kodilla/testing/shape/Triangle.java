package com.kodilla.testing.shape;

public class Triangle implements Shape {

    public final double a;
    public final double h;

    public Triangle (double a, double h) {
       final this.a = a;
       final this.h = h;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return 0.5 * a * h;
    }
}