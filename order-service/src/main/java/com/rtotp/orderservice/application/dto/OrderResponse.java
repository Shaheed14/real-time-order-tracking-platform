package com.rtotp.orderservice.application.dto;

import com.rtotp.common.domain.OrderStatus;

import java.time.Instant;
import java.util.UUID;

public record OrderResponse(
        UUID id,
        Long customerId,
        Long restaurantId,
        OrderStatus status,
        Instant createdAt,
        Instant updatedAt
) {
}
