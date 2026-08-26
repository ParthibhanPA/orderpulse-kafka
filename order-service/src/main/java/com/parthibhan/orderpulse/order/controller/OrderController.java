package com.parthibhan.orderpulse.order.controller;

import com.parthibhan.orderpulse.order.dto.CreateOrderRequest;
import com.parthibhan.orderpulse.order.event.OrderCreatedEvent;
import com.parthibhan.orderpulse.order.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OrderCreatedEvent createOrder(@RequestBody CreateOrderRequest request) {
        return orderService.createOrder(request);
    }
}
