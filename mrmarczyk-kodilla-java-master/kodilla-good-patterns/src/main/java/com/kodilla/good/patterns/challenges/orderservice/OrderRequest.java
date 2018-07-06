package com.kodilla.good.patterns.challenges.orderservice;

public class OrderRequest {

    private final String orderID;
    private final User user;
    private final Product product;
    private final double orderSize;


    public OrderRequest(String orderID, User user, Product product, double orderSize) {
        this.orderID = orderID;
        this.user = user;
        this.product = product;
        this.orderSize = orderSize;
    }

    public String getOrderID() {
        return orderID;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public double getOrderSize() {
        return orderSize;
    }

    public double getOrderValue() {
        return orderSize * product.getProductPrice();
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "orderID='" + orderID + '\'' +
                ", user=" + user +
                ", product=" + product +
                ", orderSize=" + orderSize +
                ", orderValue=" + getOrderValue() +
                '}';
    }
}
