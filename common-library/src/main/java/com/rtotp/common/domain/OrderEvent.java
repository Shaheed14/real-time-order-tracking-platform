package com.rtotp.common.domain;

import java.time.Instant;
import java.util.UUID;

public record OrderEvent(
        UUID orderId,
        UUID driverId,
        OrderStatus status,
        String message,
        Instant occurredAt
) {
}
