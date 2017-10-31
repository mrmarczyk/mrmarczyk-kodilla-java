package com.kodilla.good.patterns.challenges;

public class Order {

    private Product orderedProduct;
    private double orderSize;
    private double orderValue;

    public Product getOrderedProduct() {
        return orderedProduct;
    }

    public double getOrderSize() {
        return orderSize;
    }

    public double getOrderValue() {
        return orderValue;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderedProduct=" + orderedProduct +
                ", orderSize=" + orderSize +
                ", orderValue=" + orderValue +
                '}';
    }
}
