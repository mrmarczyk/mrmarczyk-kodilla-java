package com.kodilla.good.patterns.challenges.orderservice;

public class Application {

    public static void main (String[] args) {

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retriever();
        ProductOrderService productOrderService = new ProductOrderService(new InformationService() {
            @Override
            public void inform(User user, String message) {

                System.out.println(message);

            }
        }, new OrderService() {
            @Override
            public boolean ordered(OrderRequest orderRequest) {
                return true;
            }
        }, new ProductOrderRepository() {
            @Override
            public boolean createOrder(OrderRequest orderRequest) {
                return true;
            }
        });
        productOrderService.process(orderRequest);
    }
}
