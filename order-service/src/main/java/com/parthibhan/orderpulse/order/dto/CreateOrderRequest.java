package com.parthibhan.orderpulse.order.dto;

public record CreateOrderRequest(
        String customerId,
        String productId,
        int quantity) {}
