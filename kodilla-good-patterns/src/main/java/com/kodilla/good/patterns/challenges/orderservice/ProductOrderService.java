package com.kodilla.good.patterns.challenges.orderservice;

public class ProductOrderService {

    private static final String ORDER_RECEIVED = "Zamówienie użytkownika %s na produkt %s o wartości %s wpłyneło do systemu.";
    private static final String ORDER_HAS_BEEN_MADE = "Zamówienie na produkt: %s o wartości %s zostało przekazane do realizacji.";

    private InformationService informationService;
    private OrderService orderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.productOrderRepository = productOrderRepository;
        }

    public OrderDTO process (final OrderRequest orderRequest) {
            boolean isBought = orderService.ordered(orderRequest);
            informationService.inform(orderRequest.getUser(), String.format(ORDER_RECEIVED, orderRequest.getUser().getUserName(), orderRequest.getProduct().getProductName(), orderRequest.getOrderValue()));
            if (isBought) {
                productOrderRepository.createOrder(orderRequest);
                informationService.inform(orderRequest.getUser(), String.format(ORDER_HAS_BEEN_MADE, orderRequest.getProduct().getProductName(), orderRequest.getOrderValue()));
                return new OrderDTO(orderRequest.getUser(), true);
            } else {
                return new OrderDTO(orderRequest.getUser(), false);
            }
        }
    }
