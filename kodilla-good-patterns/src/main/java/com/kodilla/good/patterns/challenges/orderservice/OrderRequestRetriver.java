package com.kodilla.good.patterns.challenges.orderservice;

public class OrderRequestRetriver {

    public OrderRequest retriever() {

        User user = new User ("user1", "mrmarczyk", "mrmarczyk@gmail.com" );
        Product product = new Product("product1", "Cheese cake", 199.00);

        return new OrderRequest("order1", user, product, 3);
    }
}
