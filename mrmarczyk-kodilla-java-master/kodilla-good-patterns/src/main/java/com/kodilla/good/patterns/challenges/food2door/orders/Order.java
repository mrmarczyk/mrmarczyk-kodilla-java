package com.kodilla.good.patterns.challenges.food2door.orders;

import com.kodilla.good.patterns.challenges.food2door.products.Product;
import com.kodilla.good.patterns.challenges.food2door.users.User;
import com.kodilla.good.patterns.challenges.food2door.vendors.Vendor;

public class Order {

    private final String orderID;
    private final User user;
    private final Vendor vendor;
    private final Product product;
    private final double orderSize;


    public Order(String orderID, User user, Vendor vendor, Product product, double orderSize) {
        this.orderID = orderID;
        this.user = user;
        this.vendor = vendor;
        this.product = product;
        this.orderSize = orderSize;
    }

    public String getOrderID() {
        return orderID;
    }

    public User getUser() {
        return user;
    }

    public Vendor getVendor() { return vendor; }

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
        return "Order{" +
                "orderID='" + orderID + '\'' +
                ", user=" + user +
                ", vendor=" + vendor +
                ", product=" + product +
                ", orderSize=" + orderSize +
                '}';
    }
}
