package com.kodilla.good.patterns.challenges.orderservice;

public class Application {

    public static void main (String[] args) {

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retriever();
        ProductOrderService productOrderService = new ProductOrderService(new InformationService(), new OrderService(), new OrderRequestRetriver());
        productOrderService.process(orderRequest);
    }
}
