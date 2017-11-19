package com.kodilla.good.patterns.challenges.food2door.vendors;

public class ExtraFoodShop implements Vendor {

    private final String vendorID;
    private final String vendorName;

    public ExtraFoodShop(String vendorID, String vendorName) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
    }

    @Override
    public String getVendorID() {
        return vendorID;
    }

    @Override
    public String getVendorName() {
        return vendorName;
    }

    @Override
    public void process() {
    }

    @Override
    public String toString() {
        return "ExtraFoodShop{" +
                "vendorID='" + vendorID + '\'' +
                ", vendorName='" + vendorName + '\'' +
                '}';
    }
}
