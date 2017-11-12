package com.kodilla.good.patterns.challenges.orderservice;

public interface ProductOrderRepository {

        public boolean createOrder (User user, Product product, double orderSize, double orderValue);
}
