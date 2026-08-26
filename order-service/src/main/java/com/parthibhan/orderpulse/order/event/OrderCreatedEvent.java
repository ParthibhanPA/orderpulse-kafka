package com.parthibhan.orderpulse.order.event;

public record OrderCreatedEvent(
        String orderId,
        String customerId,
        String productId,
        int quantity) {}
