package com.rtotp.orderservice.application.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record CreateOrderRequest(
        @NotNull @Positive Long customerId,
        @NotNull @Positive Long restaurantId
) {
}
