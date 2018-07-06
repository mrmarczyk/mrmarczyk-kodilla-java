package com.kodilla.good.patterns.challenges.food2door.vendors;

public interface Vendor {

    String vendorID = null;
    String vendorName = null;

    String getVendorID();

    String getVendorName();

    void process();

}
