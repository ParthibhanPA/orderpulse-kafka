package com.parthibhan.orderpulse.notification.consumer;

import com.parthibhan.orderpulse.notification.event.OrderCreatedEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class OrderCreatedConsumer {

    private static final Logger log = LoggerFactory.getLogger(OrderCreatedConsumer.class);

    @KafkaListener(topics = "order-created", groupId = "notification-service-group")
    public void consume(OrderCreatedEvent event) {
        log.info("Received order-created event: {}", event);
    }
}