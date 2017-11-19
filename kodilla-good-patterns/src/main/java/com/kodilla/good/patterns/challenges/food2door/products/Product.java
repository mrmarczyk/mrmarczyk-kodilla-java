package com.kodilla.good.patterns.challenges.food2door.products;

public class Product {

    private final String productID;
    private final String productName;
    private final double productPrice;
    private final boolean isRestricted;

    public Product(String productID, String productName, double productPrice, boolean isRestricted) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.isRestricted = isRestricted;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public boolean getIsRestricted() {return isRestricted; }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", isRestricted=" + isRestricted +
                '}';
    }
}