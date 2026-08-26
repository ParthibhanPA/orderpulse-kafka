package com.parthibhan.orderpulse.notification.event;

public record OrderCreatedEvent(
        String orderId,
        String customerId,
        String productId,
        int quantity
) {
}