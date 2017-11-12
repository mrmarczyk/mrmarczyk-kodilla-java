package com.kodilla.good.patterns.challenges.orderservice;

public class ProductOrderService {
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
            boolean isBought = orderService.ordered(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderSize(), orderRequest.getOrderValue());

            if (isBought) {
                productOrderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderSize(), orderRequest.getOrderValue());
                System.out.println(orderRequest.toString());
                informationService.inform(orderRequest.getUser());
                return new OrderDTO(orderRequest.getUser(), true);
            } else {
                return new OrderDTO(orderRequest.getUser(), false);
            }
        }
    }
