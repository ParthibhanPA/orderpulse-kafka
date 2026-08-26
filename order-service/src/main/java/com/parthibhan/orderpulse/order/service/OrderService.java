package com.parthibhan.orderpulse.order.service;

import com.parthibhan.orderpulse.order.dto.CreateOrderRequest;
import com.parthibhan.orderpulse.order.event.OrderCreatedEvent;
import com.parthibhan.orderpulse.order.producer.OrderProducer;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    private final OrderProducer orderProducer;

    public OrderService(OrderProducer orderProducer) {
        this.orderProducer = orderProducer;
    }

    public OrderCreatedEvent createOrder(CreateOrderRequest request) {

        String orderId = UUID.randomUUID().toString();

        OrderCreatedEvent event = new OrderCreatedEvent(
            orderId,
            request.customerId(),
            request.productId(),
            request.quantity()
        );

        orderProducer.publish(event);

        return event;
    }
}
